package com.sagar.diseaseshelpline.Room.Dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.sagar.diseaseshelpline.Room.Entity.Dis_N_Dept;

import java.util.List;

@Dao
public interface DiseaseAndDepartmentDao {

    @Query("SELECT * FROM dis_n_dept")
    List<Dis_N_Dept> getAllDND();

    @Insert
    void insert(Dis_N_Dept dis_n_dept);

    @Update
    void update(Dis_N_Dept dis_n_dept);
}
