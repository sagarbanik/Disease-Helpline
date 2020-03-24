package com.sagar.diseaseshelpline.Room.Entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity
public class Area {

    @SerializedName("id")
    @PrimaryKey
    @ColumnInfo(name = "id")
    private int id;

    @SerializedName("city_id")
    @ColumnInfo(name = "city_id")
    private int city_id;

    @SerializedName("area_name")
    @ColumnInfo(name = "area_name")
    private String area_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getArea_name() {
        return area_name;
    }

    public void setArea_name(String area_name) {
        this.area_name = area_name;
    }
}
