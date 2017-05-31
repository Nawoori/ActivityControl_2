package com.nawoori.android.activitycontrol_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button Rbtn1;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Rbtn1 = (Button) findViewById(R.id.Rbtn1);
        editText = (EditText) findViewById(R.id.editText);

        Rbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //editText를 String으로 변수선언
            String a = editText.getText().toString();
            //텍스트에 입력된 값을  intent에 담는다.
            Intent abc = new Intent(getBaseContext(), SubActivity.class);
            //intent에 '키', '값'의 형태로 키값을 담는다.
            abc.putExtra( "KEY", a);
            //intent를 SubActivity class로 전달
            startActivity(abc);



            }
        });



    }
}
