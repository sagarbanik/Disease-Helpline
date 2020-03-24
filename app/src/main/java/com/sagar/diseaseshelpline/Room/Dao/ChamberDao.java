package com.sagar.diseaseshelpline.Room.Dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;


import com.sagar.diseaseshelpline.Room.Entity.Area;
import com.sagar.diseaseshelpline.Room.Entity.Chamber;

import java.util.List;

@Dao
public interface ChamberDao {
    @Query("SELECT * FROM chamber")
    List<Chamber> getAllChamber();

    @Insert
    void insert(Chamber chamber);

    @Update
    void update(Chamber chamber);

}
