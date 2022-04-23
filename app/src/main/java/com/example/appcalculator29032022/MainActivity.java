package com.example.appcalculator29032022;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Global scope
    EditText mEdtNumber1, mEdtNumber2;
    TextView mTvResult;
    Button mBtnPlus, mBtnMinus, mBtnDivision, mBtnMultiply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ
        mEdtNumber1 = findViewById(R.id.edittextNumber1);
        mEdtNumber2 = findViewById(R.id.edittextNumber2);
        mTvResult = findViewById(R.id.textViewResult);
        mBtnPlus = findViewById(R.id.buttonPlus);
        mBtnDivision = findViewById(R.id.buttonDivision);
        mBtnMinus = findViewById(R.id.buttonMinus);
        mBtnMultiply = findViewById(R.id.buttonMultiply);

        mBtnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get input form edittext
                String textNumber1 = mEdtNumber1.getText().toString();
                String textNumber2 = mEdtNumber2.getText().toString();

                // Empty input
                if (textNumber1.isEmpty() || textNumber2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Input 1 or 2 is empty", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Convert type
                int number1 = Integer.parseInt(textNumber1);
                int number2 = Integer.parseInt(textNumber2);

                int result = number1 + number2;

                mTvResult.setText("Result = " + result);
            }
        });

    }

}