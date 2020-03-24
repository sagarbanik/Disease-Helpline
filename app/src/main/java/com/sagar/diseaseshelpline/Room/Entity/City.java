package com.sagar.diseaseshelpline.Room.Entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity
public class City {

    @SerializedName("id")
    @ColumnInfo(name = "id")
    @PrimaryKey
    private int id;

    @SerializedName("city_name")
    @ColumnInfo(name = "city_name")
    private String city_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }
}
