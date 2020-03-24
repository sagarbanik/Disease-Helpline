package com.sagar.diseaseshelpline.Room.Dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.sagar.diseaseshelpline.Room.Entity.Chamber;
import com.sagar.diseaseshelpline.Room.Entity.Disease;

import java.util.List;

@Dao
public interface DiseaseDao {

    @Query("SELECT * FROM disease")
    List<Disease> getAllDisease();

    @Insert
    void insert(Disease disease);

    @Update
    void update(Disease disease);
}
