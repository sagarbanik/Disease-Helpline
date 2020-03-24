package com.sagar.diseaseshelpline.Room.Entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity
public class Hospital {

    @SerializedName("id")
    @ColumnInfo(name = "id")
    @PrimaryKey
    private int id;

    @SerializedName("h_name")
    @ColumnInfo(name = "h_name")
    private String h_name;

    @SerializedName("city_id")
    @ColumnInfo(name = "city_id")
    private int city_id;

    @SerializedName("area_id")
    @ColumnInfo(name = "area_id")
    private int area_id;

    @SerializedName("phone")
    @ColumnInfo(name = "phone")
    private String phone;

    @SerializedName("full_address")
    @ColumnInfo(name = "full_address")
    private String full_address;

    @SerializedName("longitude")
    @ColumnInfo(name = "longitude")
    private String longitude;

    @SerializedName("latitude")
    @ColumnInfo(name = "latitude")
    private String latitude;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getH_name() {
        return h_name;
    }

    public void setH_name(String h_name) {
        this.h_name = h_name;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public int getArea_id() {
        return area_id;
    }

    public void setArea_id(int area_id) {
        this.area_id = area_id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFull_address() {
        return full_address;
    }

    public void setFull_address(String full_address) {
        this.full_address = full_address;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}
