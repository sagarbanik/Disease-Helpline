package com.sagar.diseaseshelpline.Room.Dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.sagar.diseaseshelpline.Room.Entity.Chamber;
import com.sagar.diseaseshelpline.Room.Entity.City;

import java.util.List;

@Dao
public interface CityDao {

    @Query("SELECT * FROM city")
    List<City> getAllCity();

    @Insert
    void insert(City city);

    @Update
    void update(City city);
}
