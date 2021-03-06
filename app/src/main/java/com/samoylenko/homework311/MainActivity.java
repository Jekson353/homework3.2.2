package com.samoylenko.homework311;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button point;
    private Button inz;
    private Button normal;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btn0 = findViewById(R.id.button0);
        point = findViewById(R.id.button);
        inz = findViewById(R.id.button_inz);
        normal = findViewById(R.id.button_normal);
        textView = findViewById(R.id.textView);

        //один обработчик на все кнопки
        View.OnClickListener oclBtn = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // по id определеяем кнопку, вызвавшую этот обработчик
                switch (v.getId()) {
                    case R.id.button1:
                        textView.setText(getText(R.string._1).toString());
                        break;
                    case R.id.button2:
                        textView.setText(getText(R.string._2).toString());
                        break;
                    case R.id.button3:
                        textView.setText(getText(R.string._3).toString());
                        break;
                    case R.id.button4:
                        textView.setText(getText(R.string._4).toString());
                        break;
                    case R.id.button5:
                        textView.setText(getText(R.string._5).toString());
                        break;
                    case R.id.button6:
                        textView.setText(getText(R.string._6).toString());
                        break;
                    case R.id.button7:
                        textView.setText(getText(R.string._7).toString());
                        break;
                    case R.id.button8:
                        textView.setText(getText(R.string._8).toString());
                        break;
                    case R.id.button9:
                        textView.setText(getText(R.string._9).toString());
                        break;
                    case R.id.button0:
                        textView.setText(getText(R.string._0).toString());
                        break;
                    case R.id.button:
                        textView.setText(getText(R.string.point).toString());
                        break;
                    default:
                        break;
                }
            }
        };

        btn1.setOnClickListener(oclBtn);
        btn2.setOnClickListener(oclBtn);
        btn3.setOnClickListener(oclBtn);
        btn4.setOnClickListener(oclBtn);
        btn5.setOnClickListener(oclBtn);
        btn6.setOnClickListener(oclBtn);
        btn7.setOnClickListener(oclBtn);
        btn8.setOnClickListener(oclBtn);
        btn9.setOnClickListener(oclBtn);
        btn0.setOnClickListener(oclBtn);
        point.setOnClickListener(oclBtn);

        inz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.linear13).setVisibility(View.GONE);
                findViewById(R.id.linear14).setVisibility(View.VISIBLE);
            }
        });

        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.linear14).setVisibility(View.GONE);
                findViewById(R.id.linear13).setVisibility(View.VISIBLE);
            }
        });

    }

}
