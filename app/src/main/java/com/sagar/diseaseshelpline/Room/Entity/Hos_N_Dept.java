package com.sagar.diseaseshelpline.Room.Entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity
public class Hos_N_Dept {

    @SerializedName("id")
    @PrimaryKey
    @ColumnInfo(name = "id")
    private int id;

    @SerializedName("h_id")
    @ColumnInfo(name = "h_id")
    private int h_id;

    @SerializedName("dept_id")
    @ColumnInfo(name = "dept_id")
    private int dept_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getH_id() {
        return h_id;
    }

    public void setH_id(int h_id) {
        this.h_id = h_id;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }
}
