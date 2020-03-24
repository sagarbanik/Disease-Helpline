package com.sagar.diseaseshelpline.Room.Dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.sagar.diseaseshelpline.Room.Entity.Chamber;
import com.sagar.diseaseshelpline.Room.Entity.Degree;

import java.util.List;

@Dao
public interface DegreeDao {

    @Query("SELECT * FROM degree")
    List<Degree> getAllDegree();

    @Insert
    void insert(Degree degree);

    @Update
    void update(Degree degree);

}
