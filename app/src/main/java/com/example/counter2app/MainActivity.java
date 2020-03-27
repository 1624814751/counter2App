package com.example.counter2app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_10;
    Button btn_11, btn_12, btn_13, btn_14, btn_15, btn_16, btn_17, btn_18, btn_19;
    EditText text_1;
    boolean clr_flag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_9);
        btn_10 = (Button) findViewById(R.id.btn_10);
        btn_11 = (Button) findViewById(R.id.btn_11);
        btn_12 = (Button) findViewById(R.id.btn_12);
        btn_13 = (Button) findViewById(R.id.btn_13);
        btn_14 = (Button) findViewById(R.id.btn_14);
        btn_15 = (Button) findViewById(R.id.btn_15);
        btn_16 = (Button) findViewById(R.id.btn_16);
        btn_17 = (Button) findViewById(R.id.btn_17);
        btn_18 = (Button) findViewById(R.id.btn_18);
        btn_19 = (Button) findViewById(R.id.btn_19);
        text_1 = (EditText) findViewById(R.id.text_1);


        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_11.setOnClickListener(this);
        btn_12.setOnClickListener(this);
        btn_13.setOnClickListener(this);
        btn_14.setOnClickListener(this);
        btn_15.setOnClickListener(this);
        btn_16.setOnClickListener(this);
        btn_17.setOnClickListener(this);
        btn_18.setOnClickListener(this);
        btn_19.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        String str = text_1.getText().toString();
        switch (v.getId()) {
            case R.id.btn_5:
            case R.id.btn_6:
            case R.id.btn_7:
            case R.id.btn_9:
            case R.id.btn_11:
            case R.id.btn_13:
            case R.id.btn_14:
            case R.id.btn_15:
            case R.id.btn_17:
            case R.id.btn_18:
                if (clr_flag) {
                    clr_flag = false;
                    str = "";
                    text_1.setText("");
                }
                text_1.setText(str + ((Button) v).getText());
                break;
            case R.id.btn_16:
            case R.id.btn_12:
            case R.id.btn_8:
            case R.id.btn_4:
                if (clr_flag) {
                    clr_flag = false;
                    str = "";

                }

        }
    }
}