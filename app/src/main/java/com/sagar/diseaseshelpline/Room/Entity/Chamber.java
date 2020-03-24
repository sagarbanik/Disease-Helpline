package com.sagar.diseaseshelpline.Room.Entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity
public class Chamber {

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

    @SerializedName("f_time")
    @ColumnInfo(name = "f_time")
    private String f_time;

    @SerializedName("t_time")
    @ColumnInfo(name = "t_time")
    private String t_time;

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

    public String getF_time() {
        return f_time;
    }

    public void setF_time(String f_time) {
        this.f_time = f_time;
    }

    public String getT_time() {
        return t_time;
    }

    public void setT_time(String t_time) {
        this.t_time = t_time;
    }
}
