package com.sagar.diseaseshelpline.Model;

import com.sagar.diseaseshelpline.Room.Entity.Area;
import com.sagar.diseaseshelpline.Room.Entity.Chamber;
import com.sagar.diseaseshelpline.Room.Entity.City;
import com.sagar.diseaseshelpline.Room.Entity.Degree;
import com.sagar.diseaseshelpline.Room.Entity.Department;
import com.sagar.diseaseshelpline.Room.Entity.Dis_N_Dept;
import com.sagar.diseaseshelpline.Room.Entity.Disease;
import com.sagar.diseaseshelpline.Room.Entity.Doctor;
import com.sagar.diseaseshelpline.Room.Entity.Dr_Visiting_Day;
import com.sagar.diseaseshelpline.Room.Entity.Hospital;

import java.util.List;

public class AllData {
    private boolean status;
    private List<Doctor> doctorList;
    private List<Degree> degreeList;
    private List<Disease> diseaseList;
    private List<Area> areaList;
    private List<City> cityList;
    private List<Hospital> hospitalList;
    private List<Department> departmentList;
    private List<Chamber> chamberList;
    private List<Dis_N_Dept> disAndDeptList;
    private List<Dr_Visiting_Day> visitingDayList;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(List<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    public List<Degree> getDegreeList() {
        return degreeList;
    }

    public void setDegreeList(List<Degree> degreeList) {
        this.degreeList = degreeList;
    }

    public List<Disease> getDiseaseList() {
        return diseaseList;
    }

    public void setDiseaseList(List<Disease> diseaseList) {
        this.diseaseList = diseaseList;
    }

    public List<Area> getAreaList() {
        return areaList;
    }

    public void setAreaList(List<Area> areaList) {
        this.areaList = areaList;
    }

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }

    public List<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(List<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    public List<Chamber> getChamberList() {
        return chamberList;
    }

    public void setChamberList(List<Chamber> chamberList) {
        this.chamberList = chamberList;
    }

    public List<Dis_N_Dept> getDisAndDeptList() {
        return disAndDeptList;
    }

    public void setDisAndDeptList(List<Dis_N_Dept> disAndDeptList) {
        this.disAndDeptList = disAndDeptList;
    }

    public List<Dr_Visiting_Day> getVisitingDayList() {
        return visitingDayList;
    }

    public void setVisitingDayList(List<Dr_Visiting_Day> visitingDayList) {
        this.visitingDayList = visitingDayList;
    }
}
