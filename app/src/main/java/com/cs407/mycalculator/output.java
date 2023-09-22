package com.cs407.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class output extends AppCompatActivity {
    TextView textView;
    public void goback(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);
        textView = (TextView) findViewById(R.id.textView_output);
        Intent intent = getIntent();
        String str = intent.getStringExtra("output");
        textView.setText(str);
    }
}