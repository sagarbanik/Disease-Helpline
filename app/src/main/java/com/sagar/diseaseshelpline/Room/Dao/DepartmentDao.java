package com.sagar.diseaseshelpline.Room.Dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.sagar.diseaseshelpline.Room.Entity.Chamber;
import com.sagar.diseaseshelpline.Room.Entity.Department;

import java.util.List;

@Dao
public interface DepartmentDao {

    @Query("SELECT * FROM department")
    List<Department> getAllDepartment();

    @Insert
    void insert(Department department);

    @Update
    void update(Department department);
}
