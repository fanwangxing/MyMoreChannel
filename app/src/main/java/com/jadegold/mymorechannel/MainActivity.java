package com.jadegold.mymorechannel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import c.jadegold.mylibrary.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(Constant.name);
        TextView age = (TextView)findViewById(R.id.age);
        age.setText(Utils.age);
    }
}
