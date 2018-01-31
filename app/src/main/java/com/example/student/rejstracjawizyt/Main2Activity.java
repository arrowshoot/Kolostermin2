package com.example.student.rejstracjawizyt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ArrayList<lekarze> doktor = new ArrayList<>();
        doktor.add(new lekarze("kowalski", "pediatra"));
        doktor.add(new lekarze("kowalski", "pediatra"));
        doktor.add(new lekarze("kowalski", "pediatra"));
        doktor.add(new lekarze("kowalski", "pediatra"));
    }
}
