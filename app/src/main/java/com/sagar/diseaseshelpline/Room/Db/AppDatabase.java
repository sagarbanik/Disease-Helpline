package com.sagar.diseaseshelpline.Room.Db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.sagar.diseaseshelpline.Room.Dao.AreaDao;
import com.sagar.diseaseshelpline.Room.Dao.ChamberDao;
import com.sagar.diseaseshelpline.Room.Dao.CityDao;
import com.sagar.diseaseshelpline.Room.Dao.DegreeDao;
import com.sagar.diseaseshelpline.Room.Dao.DepartmentDao;
import com.sagar.diseaseshelpline.Room.Dao.DiseaseAndDepartmentDao;
import com.sagar.diseaseshelpline.Room.Dao.DiseaseDao;
import com.sagar.diseaseshelpline.Room.Dao.DoctorDao;
import com.sagar.diseaseshelpline.Room.Dao.HospitalDao;
import com.sagar.diseaseshelpline.Room.Dao.VisitingDayDao;
import com.sagar.diseaseshelpline.Room.Entity.Area;
import com.sagar.diseaseshelpline.Room.Entity.Chamber;
import com.sagar.diseaseshelpline.Room.Entity.City;
import com.sagar.diseaseshelpline.Room.Entity.Degree;
import com.sagar.diseaseshelpline.Room.Entity.Department;
import com.sagar.diseaseshelpline.Room.Entity.Disease;
import com.sagar.diseaseshelpline.Room.Entity.Dis_N_Dept;
import com.sagar.diseaseshelpline.Room.Entity.Doctor;
import com.sagar.diseaseshelpline.Room.Entity.Dr_Visiting_Day;
import com.sagar.diseaseshelpline.Room.Entity.Hos_N_Dept;
import com.sagar.diseaseshelpline.Room.Entity.Hospital;

@Database(entities = {
        Area.class,
        Chamber.class,
        City.class,
        Degree.class,
        Department.class,
        Disease.class,
        Dis_N_Dept.class,
        Doctor.class,
        Dr_Visiting_Day.class,
        Hospital.class,
        Hos_N_Dept.class}, version = 1, exportSchema = false)

public abstract class AppDatabase extends RoomDatabase {
    public abstract AreaDao getAreaDao();
    public abstract ChamberDao getChamberDao();
    public abstract CityDao getCityDao();
    public abstract DegreeDao getDegreeDao();
    public abstract DepartmentDao getDepartmentDao ();
    public abstract DiseaseDao getDiseaseDao();
    public abstract DiseaseAndDepartmentDao getDiseaseAndDepartmentDao();
    public abstract DoctorDao getDoctorDao();
    public abstract VisitingDayDao getVisitingDayDao();
    public abstract HospitalDao getHospitalDao();
}
