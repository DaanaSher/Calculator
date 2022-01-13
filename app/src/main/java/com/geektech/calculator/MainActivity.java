package com.geektech.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;
    private Integer firstVar, secondVar;
    private Boolean isClickOperation = false;
    private String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tv_result);
    }

    public void onClickNumber(View view) {
        switch (view.getId()) {
            case R.id.btn_zero2:
                //кликнул на ноль
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("0");
                } else if (isClickOperation){
                    tvResult.setText("0");
                } else {
                    tvResult.append("0");
                }
                isClickOperation = false;
                break;
            case R.id.btn_one:
                //кликнул на единицу
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("1");
                } else if (isClickOperation){
                    tvResult.setText("1");
                } else {
                    tvResult.append("1");
                }
                isClickOperation = false;
                break;
            case R.id.btn_two:
                //кликнул на двойку
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("2");
                } else if (isClickOperation){
                    tvResult.setText("2");
                } else {
                    tvResult.append("2");
                }
                isClickOperation = false;
                break;
            case R.id.btn_three:
                //кликнул на тройку
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("3");
                } else if (isClickOperation){
                    tvResult.setText("3");
                } else {
                    tvResult.append("3");
                }
                isClickOperation = false;
                break;
            case R.id.btn_four:
                //кликнул на четверку
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("4");
                } else if (isClickOperation){
                    tvResult.setText("4");
                } else {
                    tvResult.append("4");
                }
                isClickOperation = false;
                break;
            case R.id.btn_five:
                //кликнул на пятерку
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("5");
                } else if (isClickOperation){
                    tvResult.setText("5");
                } else {
                    tvResult.append("5");
                }
                isClickOperation = false;
                break;
            case R.id.btn_six:
                //кликнул на шестерку
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("6");
                } else if (isClickOperation){
                    tvResult.setText("6");
                } else {
                    tvResult.append("6");
                }
                isClickOperation = false;
                break;
            case R.id.btn_seven:
                //кликнул на семерку
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("7");
                } else if (isClickOperation){
                    tvResult.setText("7");
                } else {
                    tvResult.append("7");
                }
                isClickOperation = false;
                break;
            case R.id.btn_eight:
                //кликнул на восьмерку
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("8");
                } else if (isClickOperation){
                    tvResult.setText("8");
                } else {
                    tvResult.append("8");
                }
                isClickOperation = false;
                break;
            case R.id.btn_nine:
                //кликнул на девятку
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("9");
                } else if (isClickOperation){
                    tvResult.setText("9");
                } else {
                    tvResult.append("9");
                }
                isClickOperation = false;
                break;
            case R.id.btn_clear:
                //кликнул на очищение
                tvResult.setText("0");
                isClickOperation = false;
                break;
        }
    }

    public void onClickOperation(View view) {
        switch (view.getId()){
            case R.id.btn_divide:
                //кликнул на деление
                firstVar = Integer.parseInt(tvResult.getText().toString());
                isClickOperation = true;
                operation = "/";
                break;
            case R.id.btn_multiplication:
                //кликнул на умножение
                firstVar = Integer.parseInt(tvResult.getText().toString());
                isClickOperation = true;
                operation = "*";
                break;
            case R.id.btn_minus:
                //кликнул на минус
                firstVar = Integer.parseInt(tvResult.getText().toString());
                isClickOperation = true;
                operation = "-";
                break;
            case R.id.btn_plus:
                //кликнул на плюс
                firstVar = Integer.parseInt(tvResult.getText().toString());
                isClickOperation = true;
                operation = "+";
                break;
            case R.id.btn_equal:
                //кликнул на равно
                secondVar = Integer.parseInt(tvResult.getText().toString());
                Integer result;
                switch (operation){
                    case "/":
                        result = firstVar / secondVar;
                        tvResult.setText(result.toString());
                        break;
                    case "*":
                        result = firstVar * secondVar;
                        tvResult.setText(result.toString());
                        break;
                    case "-":
                        result = firstVar - secondVar;
                        tvResult.setText(result.toString());
                        break;
                    case "+":
                        result = firstVar + secondVar;
                        tvResult.setText(result.toString());
                        break;
                }
                isClickOperation = true;
                break;
        }
    }
}