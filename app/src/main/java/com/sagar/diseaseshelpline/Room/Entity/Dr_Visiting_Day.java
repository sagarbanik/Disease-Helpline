package com.sagar.diseaseshelpline.Room.Entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity
public class Dr_Visiting_Day {

    @SerializedName("id")
    @ColumnInfo(name = "id")
    @PrimaryKey
    private int id;

    @SerializedName("dr_id")
    @ColumnInfo(name = "dr_id")
    private int dr_id;

    @SerializedName("h_id")
    @ColumnInfo(name = "h_id")
    private int h_id;

    @SerializedName("day_of_week")
    @ColumnInfo(name = "day_of_week")
    private int day_of_week;

    @SerializedName("status")
    @ColumnInfo(name = "status")
    private int status;

    public Dr_Visiting_Day(int id, int dr_id, int h_id, int day_of_week, int status) {
        this.id = id;
        this.dr_id = dr_id;
        this.h_id = h_id;
        this.day_of_week = day_of_week;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDr_id() {
        return dr_id;
    }

    public void setDr_id(int dr_id) {
        this.dr_id = dr_id;
    }

    public int getH_id() {
        return h_id;
    }

    public void setH_id(int h_id) {
        this.h_id = h_id;
    }

    public int getDay_of_week() {
        return day_of_week;
    }

    public void setDay_of_week(int day_of_week) {
        this.day_of_week = day_of_week;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
