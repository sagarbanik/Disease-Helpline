package com.sagar.diseaseshelpline.Room.Dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.sagar.diseaseshelpline.Room.Entity.Chamber;
import com.sagar.diseaseshelpline.Room.Entity.Dr_Visiting_Day;
import java.util.List;

@Dao
public interface VisitingDayDao {

    @Query("SELECT * FROM dr_visiting_day")
    List<Dr_Visiting_Day> getAllVisitingDay();

    @Insert
    void insert(Dr_Visiting_Day dr_visiting_day);

    @Update
    void update(Dr_Visiting_Day dr_visiting_day);
}
