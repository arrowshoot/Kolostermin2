package com.example.student.rejstracjawizyt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
@OnClick(R.id.baton)
    void OnClick()
{
    Intent intent = new Intent(this,Main2Activity.class);
    startActivity(intent);
}
}
