package com.example.oneuse.firstapp;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String KEY_NAME_VALUE = "NAME_VALUE";
    EditText mainInput;
    Button mainButton;
    ImageView mainImage;

    String name ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainInput = (EditText) findViewById(R.id.main_input);
        mainButton = (Button) findViewById(R.id.main_button);
        mainImage = (ImageView) findViewById(R.id.main_image);

        mainButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                //get input text
                final String inputText = mainInput.getText().toString();
                //cek input text content
                if (!TextUtils.isEmpty(inputText)){
                    showToastMessage("Hello + inputText");
                }
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
               intent.putExtra(Main2Activity.EXTRA_NAME, name );
                startActivity(intent);
            }
        });}

    private void showToastMessage(String message) {
        Toast.makeText(
                MainActivity.this,
                message,
                Toast.LENGTH_SHORT
        ).show();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString(KEY_NAME_VALUE, name);
        super.onSaveInstanceState(outState);
            }
}
