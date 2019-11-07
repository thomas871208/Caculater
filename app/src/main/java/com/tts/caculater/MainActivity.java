package com.tts.caculater;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        TextView number;
        double num;
        double num1;
        double num2 = 0;

        double tempplus;
        double tempnegetive;
        double temptime;
        double tempdevide;
        double temp = 0;

        double plus =0;
        double negetive =0;
        double time = 1;
        double devide = 1;

        int record = 5;
        int recordplus = 1;
        int recordnegetive =1;
        int recordtime = 1;
        int recorddevide =1;

        int warming = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = findViewById(R.id.number);
    }

    public void count(){
        num = (num2 * 10)+ num1;
        num2 = num;
        int warming = 0;
    }
    public void one(View view){
        num1 = 1;
        count();
        number.setText(num+"");
    }

    public void two(View view){
        num1 = 2;
        count();
        number.setText(num+"");
    }

    public void three(View view){
        num1 = 3;
        count();
        number.setText(num+"");
    }

    public void four(View view){
        num1 = 4;
        count();
        number.setText(num+"");
    }

    public void five(View view){
        num1 = 5;
        count();
        number.setText(num+"");
    }

    public void six(View view){
        num1 = 6;
        count();
        number.setText(num+"");
    }

    public void seven(View view){
        num1 = 7;
        count();
        number.setText(num+"");
    }

    public void eight(View view){
        num1 = 8;
        count();
        number.setText(num+"");
    }

    public void nine(View view){
        num1 = 9;
        count();
        number.setText(num+"");
    }

    public void zero(View view){
        num1 = 0;
        count();
        number.setText(num+"");
    }

    public void think(){
        if(record == 0){
            plus = temp;
            num = 0;
            tempplus = plus + num2;
            plus = tempplus;
            num2 = 0;
            temp = plus;
        }else if(record == 1){
            if (temp == 0) {
                negetive = temp;
                num=0;
                tempnegetive = num2;
            }else {
                negetive = temp;
                num = 0;
                tempnegetive = negetive - num2;
            }
            negetive = tempnegetive;
            num2 =0;
            temp = negetive;
        }else if(record == 2){
            if(temp == 0){
                temp = 1;
            }
            time = temp;
            num = 0;
            temptime = time * num2;
            time = temptime;
            num2 = 0;
            temp = time;
        }else if(record == 3){
            if(temp == 0){
                temp = 1;
                devide = temp;
                num = 0;
                tempdevide = num2 / devide;
            }else {
                devide = temp;
                num = 0;
                tempdevide = devide / num2;
            }
            devide = tempdevide;
            num2 = 0;
            temp = devide;
        }
    }
    public  void warm(){
        if (warming > 1){
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Warming")
                    .setMessage("運算符號輸入兩遍")
                    .setPositiveButton("OK",null)
                    .show();

            number.setText("0");
            num = 0;
            num1 =0 ;
            num2 = 0;
            temp = 0;
            record = 5;
            recordplus = 1;
            recordnegetive = 1;
            recordtime = 1;
            recorddevide = 1;
            plus = 0;
            negetive = 0;
            time = 0;
            devide = 0;
        }
    }
    public void plus(View view){
        if (record == 5){
            record = 0;
        }
        think();
        recordplus = 0;
        record = 0;
        number.setText( temp+"+");
        warming++;
        warm();
    }
    public void negetive(View view){
        if (record == 5){
            record = 1;
        }
        think();
        recordnegetive = 0;
        record = 1;
        number.setText( temp + "-");
        warming++;
        warm();
    }
    public void time(View view){
        if (record == 5) {
            record = 2;
        }
        think();
        recordtime = 0;
        record = 2;
        number.setText(temp +"×");
        warming++;
        warm();
    }
    public void devide(View view){
        if (record == 5) {
            record = 3;
        }
        think();
        recordtime = 0;
        record = 3;
        number.setText(temp +"÷");
        warming++;
        warm();
    }
    public void ac(View view){
        number.setText("0");
         num = 0;
         num1 =0 ;
         num2 = 0;
         temp = 0;
         record = 5;
         recordplus = 1;
         recordnegetive = 1;
         recordtime = 1;
         recorddevide = 1;
         plus = 0;
         negetive = 0;
         time = 0;
         devide = 0;
    }
    public void delete(View view){
        if(num >= 10) {
            num = (num - num1)/ 10;
            num2 = num;
            number.setText(num+"");
        }else if(num > 0){
            num = 0;
            num2 = num;
            number.setText(num+"");
         }
    }
    public void enter(View view){
        think();
        number.setText(""+temp);
    }
}
