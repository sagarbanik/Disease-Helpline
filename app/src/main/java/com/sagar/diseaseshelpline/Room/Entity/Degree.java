package com.sagar.diseaseshelpline.Room.Entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity
public class Degree {

    @SerializedName("id")
    @ColumnInfo(name = "id")
    @PrimaryKey
    private int id;

    @SerializedName("dr_id")
    @ColumnInfo(name = "dr_id")
    private int dr_id;

    @SerializedName("dr_degree")
    @ColumnInfo(name = "dr_degree")
    private String dr_degree;

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

    public String getDr_degree() {
        return dr_degree;
    }

    public void setDr_degree(String dr_degree) {
        this.dr_degree = dr_degree;
    }
}
