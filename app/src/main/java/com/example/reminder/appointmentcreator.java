package com.example.reminder;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.support.v7.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class appointmentcreator extends AppCompatActivity {
    EditText etname;
    String hansi_ist_sehr_dumm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointmentcreator);
    }


    public void create_appointment(View view) {
        String aptmnt = etname.getText().toString();
        new appointments(aptmnt);
    }
}
