package com.example.oneuse.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.text.TextUtils;
public class Main2Activity extends AppCompatActivity {

    public static  final String EXTRA_NAME = "EXTRA_NAME";
    TextView secondTextField;
    String name = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

       secondTextField = (TextView) findViewById(R.id.second_text_field);
        if(getIntent()!= null){
            if (getIntent().hasExtra(EXTRA_NAME)){
                name = getIntent().getStringExtra(EXTRA_NAME);
            }
        }

        if (!TextUtils.isEmpty(name)){
            secondTextField.setText("extra="+name);

        }
    }
}
