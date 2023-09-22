package com.cs407.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void add_click(View view){
        EditText first_TextField = (EditText) findViewById(R.id.editTextText2);
        EditText second_TextField = (EditText) findViewById(R.id.editTextText3);
        try {
            long first_numb = Long.parseLong(first_TextField.getText().toString());
            long sec_numb = Long.parseLong(second_TextField.getText().toString());
            try {
                String res = String.valueOf(first_numb + sec_numb);
                goToActivity(res);
            }
            catch (Exception e){
                Toast.makeText(MainActivity.this, "Your number is invalid", Toast.LENGTH_LONG).show();
            }
        }
        catch (NumberFormatException e){
            Toast.makeText(MainActivity.this, "Your number is too big or missing one or two numbers", Toast.LENGTH_LONG).show();
        }
    }

    public void subtract_click(View view){
        EditText first_TextField = (EditText) findViewById(R.id.editTextText2);
        EditText second_TextField = (EditText) findViewById(R.id.editTextText3);
        try {
            long first_numb = Long.parseLong(first_TextField.getText().toString());
            long sec_numb = Long.parseLong(second_TextField.getText().toString());
            try {
                String res = String.valueOf(first_numb - sec_numb);
                goToActivity(res);
            }
            catch (Exception e){
                Toast.makeText(MainActivity.this, "Your number is invalid", Toast.LENGTH_LONG).show();
            }
        }
        catch (NumberFormatException e){
            Toast.makeText(MainActivity.this, "Your number is too big or missing one or two numbers", Toast.LENGTH_LONG).show();
        }
    }

    public void multiply_click(View view){
        EditText first_TextField = (EditText) findViewById(R.id.editTextText2);
        EditText second_TextField = (EditText) findViewById(R.id.editTextText3);
        try {
            long first_numb = Long.parseLong(first_TextField.getText().toString());
            long sec_numb = Long.parseLong(second_TextField.getText().toString());
            try {
                String res = String.valueOf(first_numb * sec_numb);
                goToActivity(res);
            }
            catch (Exception e){
                Toast.makeText(MainActivity.this, "Your number is invalid or the result is too big", Toast.LENGTH_LONG).show();
            }
        }
        catch (NumberFormatException e){
            Toast.makeText(MainActivity.this, "Your number is too big or missing one or two numbers", Toast.LENGTH_LONG).show();
        }
    }

    public void divi_click(View view){
        EditText first_TextField = (EditText) findViewById(R.id.editTextText2);
        EditText second_TextField = (EditText) findViewById(R.id.editTextText3);
        try {
            long first_numb = Long.parseLong(first_TextField.getText().toString());
            long sec_numb = Long.parseLong(second_TextField.getText().toString());
            if (sec_numb == 0){
                Toast.makeText(MainActivity.this, "The second number must not be 0", Toast.LENGTH_LONG).show();
            }
            else{
                try {
                    String res = String.valueOf(Double.valueOf(first_numb) / Double.valueOf(sec_numb));
                    goToActivity(res);
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "Your number is invalid or the result is too big", Toast.LENGTH_LONG).show();
                }
            }
        }
        catch (NumberFormatException e){
            Toast.makeText(MainActivity.this, "Your number is too big or missing one or two numbers", Toast.LENGTH_LONG).show();
        }
    }

    public void goToActivity(String s){
        Intent intent = new Intent(this, output.class);
        intent.putExtra("output", s);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}