package com.example.reminder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    //C:\Users\fexxl\AndroidStudioProjects\Reminder2
    TextView tvmain_date;
    String currenDate;
    float x1, x2, y1, y2;


    //https://developer.android.com/courses/fundamentals-training/toc-v2
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvmain_date = findViewById(R.id.tvmain_date);

        getDate();
        tvmain_date.setText(currenDate);

    }

    public void getDate() {
        Calendar calender = Calendar.getInstance();
        currenDate = DateFormat.getDateInstance().format(calender.getTime());
    }

    public boolean onTouchEvent(MotionEvent touchevent) {
        switch (touchevent.getAction()) {
            case MotionEvent.ACTION_DOWN:
                x1 = touchevent.getX();
                y1 = touchevent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchevent.getX();
                y2 = touchevent.getY();
                if (x1 > x2) {
                    Intent intent = new Intent(this, tasklist.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                } else if (x1 < x2) {
                    Intent intent = new Intent(this, Calendarview.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

                }
                break;
        }
        return false;
    }


}
