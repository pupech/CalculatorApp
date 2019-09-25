package sdu.cs.prem.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         //ผูกตัวหแปร Java กับ XML
        final EditText numberEditText1 = findViewById(R.id.edtNumber1);
        final EditText numberEditText2 = findViewById(R.id.edtNumber2);
        Button addButton = findViewById(R.id.btnAdd);
        Button divideButton = findViewById(R.id.btnDivide);
        Button multiplyButton = findViewById(R.id.btnMultiply);
        Button minusButton = findViewById(R.id.btnMinus);

        final TextView resultTextView = findViewById(R.id.tvResult) ;

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(numberEditText1.getText().toString());
                int num2 = Integer.parseInt(numberEditText2.getText().toString());
                int Result = num1+num2 ;
                resultTextView.setText(Result+"");
            }
        }
        );

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(numberEditText1.getText().toString());
                int num2 = Integer.parseInt(numberEditText2.getText().toString());
                int Result = num1-num2 ;
                resultTextView.setText(Result + "");
            }
        });
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(numberEditText1.getText().toString());
                int num2 = Integer.parseInt(numberEditText2.getText().toString());
                int Result = num1*num2 ;
                resultTextView.setText(Result + "");
            }
        });
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(numberEditText1.getText().toString());
                int num2 = Integer.parseInt(numberEditText2.getText().toString());
                int Result = num1 / num2;
                resultTextView.setText(Result + "");
            }
        });
    } //End onCreate()Method
} //end class
