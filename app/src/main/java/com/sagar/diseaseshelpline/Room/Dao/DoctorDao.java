package com.sagar.diseaseshelpline.Room.Dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.sagar.diseaseshelpline.Room.Entity.Chamber;
import com.sagar.diseaseshelpline.Room.Entity.Disease;
import com.sagar.diseaseshelpline.Room.Entity.Doctor;

import java.util.List;

@Dao
public interface DoctorDao {

    @Query("SELECT * FROM doctor")
    List<Doctor> getAllDoctor();

    @Insert
    void insert(Doctor doctor);

    @Update
    void update(Doctor doctor);
}
