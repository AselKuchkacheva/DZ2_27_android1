package com.example.dz2_27_android1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
    private Button button;
    private TextView textView;

    private int num1;
    private int num2;
    private int num3;
    private int res;
    private String KEY = "final";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.number1);
        editText2 = findViewById(R.id.number2);
        editText3 = findViewById(R.id.number3);
        button = findViewById(R.id.btn_button);
        textView = findViewById(R.id.view);
        init();
    }

    private void init() {

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(editText1.getText().toString());
                num2 = Integer.parseInt(editText2.getText().toString());
                num3 = Integer.parseInt(editText3.getText().toString());
                res = num1 + (num2/num3);
                //textView.setText(""+res);
            }
        });

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY, res);
        textView.setText(""+res);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        textView.setText(""+savedInstanceState.getInt(KEY));

    }
}