package com.sagar.diseaseshelpline.Room.Entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity
public class Dis_N_Dept {

    @SerializedName("id")
    @ColumnInfo(name = "id")
    @PrimaryKey
    private int id;

    @SerializedName("dept_id")
    @ColumnInfo(name = "dept_id")
    private int dept_id;

    @SerializedName("dis_id")
    @ColumnInfo(name = "dis_id")
    private int dis_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public int getDis_id() {
        return dis_id;
    }

    public void setDis_id(int dis_id) {
        this.dis_id = dis_id;
    }
}
