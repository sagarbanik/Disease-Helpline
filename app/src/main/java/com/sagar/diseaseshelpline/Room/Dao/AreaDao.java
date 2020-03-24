package com.sagar.diseaseshelpline.Room.Dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.sagar.diseaseshelpline.Room.Entity.Area;

import java.util.List;

@Dao
public interface AreaDao {

    @Query("SELECT * FROM area")
    List<Area> getAllArea();

    @Query("SELECT * FROM area WHERE city_id=:cityID")
    List<Area> getAllSortedArea(int cityID);

    @Insert
    void insert(Area area);

    @Update
    void update(Area area);
}
