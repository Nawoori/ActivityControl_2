package com.nawoori.android.activitycontrol_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    Button Rbtn2;
    TextView textView2, Num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Rbtn2 = (Button) findViewById(R.id.Rbtn2);
        Num = (TextView) findViewById(R.id.Num);
        textView2 = (TextView) findViewById(R.id.textView2);

        Intent intent = getIntent();
        String value = intent.getStringExtra("KEY");

        textView2.setText(value);

        




    }
}
