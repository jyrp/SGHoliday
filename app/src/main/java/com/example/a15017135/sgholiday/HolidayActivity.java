package com.example.a15017135.sgholiday;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.attr.name;
import static com.example.a15017135.sgholiday.R.drawable.day1;
import static com.example.a15017135.sgholiday.R.drawable.day2;
import static com.example.a15017135.sgholiday.R.id.Date;

public class HolidayActivity extends AppCompatActivity{
    ListView lv;
    ArrayAdapter aa;
    ArrayList<Holiday> holiday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.holidayview);

        lv = (ListView) this.findViewById(R.id.Holiday);

        // Create a few food objects in Food array
        holiday = new ArrayList<Holiday>();
        holiday.add(new Holiday(day1,"New year","1/1"));
        holiday.add(new Holiday(day2,"Labour day","5/1"));
        // Link this Activity object, the row.xml layout for
        //  each row and the food String array together
        aa = new HolidayAdapter(this, R.layout.row_holiday, holiday);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(HolidayActivity.this,holiday.get(position).getName() + " Date: " + holiday.get(position).getDate(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
