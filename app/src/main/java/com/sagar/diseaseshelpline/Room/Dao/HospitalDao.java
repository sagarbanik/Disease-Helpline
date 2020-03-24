package com.sagar.diseaseshelpline.Room.Dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.sagar.diseaseshelpline.Room.Entity.Chamber;
import com.sagar.diseaseshelpline.Room.Entity.Hospital;

import java.util.List;

@Dao
public interface HospitalDao {

    @Query("SELECT * FROM hospital")
    List<Hospital> getAllHospital();

    @Insert
    void insert(Hospital hospital);

    @Update
    void update(Hospital hospital);
}
