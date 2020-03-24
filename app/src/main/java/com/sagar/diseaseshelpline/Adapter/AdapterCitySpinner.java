package com.sagar.diseaseshelpline.Adapter;

import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import com.sagar.diseaseshelpline.R;
import com.sagar.diseaseshelpline.Room.Entity.City;

import java.util.List;

public class AdapterCitySpinner extends BaseAdapter implements SpinnerAdapter {

    private List<City> cityList;

    public AdapterCitySpinner(List<City> cityList) {
        this.cityList = cityList;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getCount() {
        return cityList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.city_splinner_item,parent,false);

        /*TextView itemTV;
        itemTV = view.findViewById(R.id.itemTV);
        itemTV.setText(cityList.get(position).getCity_name());*/

        return view;
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 1;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {

        /*View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_spinner_dropdown_item,parent,false);

        return view;*/
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.city_splinner_item,parent,false);

        TextView itemTV;
        itemTV = view.findViewById(R.id.itemTV);
        itemTV.setText(cityList.get(position).getCity_name());

        return view;
    }
}
