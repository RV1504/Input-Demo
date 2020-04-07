package com.example.inputdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText ip;
Button compute;
TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ip=findViewById(R.id.ip);
        compute=findViewById(R.id.compute);
        display=findViewById(R.id.display);
        //ip takes input from teh user
        compute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num=Integer.parseInt(ip.getText().toString());
                //converting a string to a number
                if(num%2==0)
                    display.setText("It is an even number");
                else {
                    display.setText("Its an odd number");
                }
            }
        });
    }
}

