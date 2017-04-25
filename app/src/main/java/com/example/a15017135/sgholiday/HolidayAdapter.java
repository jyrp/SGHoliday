package com.example.a15017135.sgholiday;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HolidayAdapter extends ArrayAdapter {

    private ArrayList<Holiday> holiday;
    private Context context;
    private ImageView ivHoliday;
    private TextView tvName;
    private TextView tvDate;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.row_holiday, parent, false);


        tvName = (TextView) rowView.findViewById(R.id.Name);
        tvDate = (TextView) rowView.findViewById(R.id.Date);
        ivHoliday = (ImageView) rowView.findViewById(R.id.imageViewSec);


        Holiday currentHoliday = holiday.get(position);


        tvName.setText(currentHoliday.getName());
        tvDate.setText(currentHoliday.getDate());
        ivHoliday.setImageResource(currentHoliday.getImage());
        return rowView;
    }
    public HolidayAdapter(Context context, int resource, ArrayList<Holiday> objects){
        super(context, resource, objects);

        holiday = objects;
        this.context = context;
    }

}
