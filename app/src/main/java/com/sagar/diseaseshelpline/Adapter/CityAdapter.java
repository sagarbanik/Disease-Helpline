package com.sagar.diseaseshelpline.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.sagar.diseaseshelpline.R;
import com.sagar.diseaseshelpline.Room.Entity.City;

import java.util.List;

public class CityAdapter extends ArrayAdapter<City> {

    public CityAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull List<City> cityList) {
        super(context, resource, textViewResourceId, cityList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        City cityItem = getItem(position);

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.city_splinner_item,parent,false);

        TextView itemTV;
        itemTV = view.findViewById(R.id.itemTV);
        itemTV.setText(cityItem.getCity_name());

        return view;
    }
    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.city_splinner_item,parent,false);
        }
        City cityItem = getItem(position);
        TextView txtTitle = (TextView) convertView.findViewById(R.id.itemTV);
        txtTitle.setText(cityItem.getCity_name());

        return convertView;
    }
}
