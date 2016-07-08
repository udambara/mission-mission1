package com.example.android.ex1_emotion;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.PaintDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Tvemotion;
    Button btnhappy;
    Button btngloomy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    void init()
    {

        Tvemotion = (TextView)findViewById(R.id.tv_emotion);
        btnhappy = (Button)findViewById(R.id.btn_happy);
        btngloomy = (Button)findViewById(R.id.btn_gloomy);
    }
    public void onClickHappy(View view){
        String emotion = btnhappy.getText().toString();
        int color = ((ColorDrawable)btnhappy.getBackground()).getColor();
        Tvemotion.setText(emotion);
        Tvemotion.setTextColor(color);
    }
    public void onClickGloomy(View view){
        String emotion = btngloomy.getText().toString();
        int color = ((ColorDrawable)btngloomy.getBackground()).getColor();
        Tvemotion.setText(emotion);
        Tvemotion.setTextColor(color);
    }
}
