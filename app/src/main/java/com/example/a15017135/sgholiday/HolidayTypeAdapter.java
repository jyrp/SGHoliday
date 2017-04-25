package com.example.a15017135.sgholiday;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class HolidayTypeAdapter extends ArrayAdapter{

    private ArrayList<HolidayType> holidaytype;
    private Context context;
    private TextView tvType;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.row_01, parent, false);


        tvType = (TextView) rowView.findViewById(R.id.tvHolidayType);

        HolidayType currentType = holidaytype.get(position);


        tvType.setText(currentType.getType());
        return rowView;
    }
    public HolidayTypeAdapter(Context context, int resource, ArrayList<HolidayType> objects){
        super(context, resource, objects);

        holidaytype = objects;
        this.context = context;
    }

}
