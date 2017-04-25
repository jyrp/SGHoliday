package com.example.a15017135.sgholiday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static android.support.v7.appcompat.R.id.info;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<HolidayType> holidaytype;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) this.findViewById(R.id.HolidayType);

        // Create a few food objects in Food array
        holidaytype = new ArrayList<HolidayType>();
        holidaytype.add(new HolidayType("Secular"));

        // Link this Activity object, the row.xml layout for
        //  each row and the food String array together
        aa = new HolidayTypeAdapter(this, R.layout.row_01, holidaytype);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,HolidayActivity.class);
                startActivity(intent);

            }
        });
    }
}
