package com.example.james.graduate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.joda.time.Days;
import org.joda.time.LocalDate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView days = (TextView) findViewById(R.id.days);
        days.setText(String.valueOf(setPeriod()));
    }

    /**
     * @return different between today and graduate day in days.
     */
    private int setPeriod() {
        String graduateTime = "2017-07-15";
        return Days.daysBetween(LocalDate.now(), LocalDate.parse(graduateTime)).getDays();
    }
}
