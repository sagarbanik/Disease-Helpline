package com.sagar.diseaseshelpline.Room.Dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface HospitalAndDepartment {

    @Query("SELECT * FROM hos_n_dept")
    List<HospitalAndDepartment> getAllHosNDept();

    @Insert
    void insert(HospitalAndDepartment hospitalAndDepartment);

    @Update
    void update(HospitalAndDepartment hospitalAndDepartment);
}
