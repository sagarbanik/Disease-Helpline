package com.sagar.diseaseshelpline;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import com.sagar.diseaseshelpline.Adapter.AdapterCitySpinner;
import com.sagar.diseaseshelpline.Adapter.AreaAdapter;
import com.sagar.diseaseshelpline.Adapter.CityAdapter;
import com.sagar.diseaseshelpline.Model.AllData;
import com.sagar.diseaseshelpline.Retrofit.Service.DAHService;
import com.sagar.diseaseshelpline.Room.Dao.AreaDao;
import com.sagar.diseaseshelpline.Room.Db.AppDatabase;
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

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private Spinner citySpinner;
    private Spinner areaSpinner;

    public static AppDatabase appDatabase;
    public static String BASE_URL = "http://10.0.2.2/disease_helpline/";

    //Retrofit declaration
    private Retrofit retrofit;
    private DAHService retrofitService;

    private List<Area> areaList;
    private List<Chamber> chamberList;
    private List<City> cityList;
    private List<Degree> degreeList;
    private List<Department> departmentList;
    private List<Dis_N_Dept> disNDeptList;
    private List<Disease> diseaseList;
    private List<Doctor> doctorList;
    private List<Dr_Visiting_Day> visitingDayList;
    private List<Hospital> hospitalList;

    private AreaAdapter areaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        appDatabase = Room.databaseBuilder(this, AppDatabase.class, "disease_helpline")
                .allowMainThreadQueries()
                .build();

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        retrofitService = retrofit.create(DAHService.class);

        fetchRemoteData();

        citySpinner = findViewById(R.id.citySpinner);
        areaSpinner = findViewById(R.id.areaSpinner);

        areaList = new ArrayList<>();
        /*areaAdapter = new AreaAdapter(MainActivity.this,R.layout.area_splinner_item,R.id.itemTV,areaList);
        areaSpinner.setAdapter(areaAdapter);*/

    }

    public void fetchRemoteData(){
        Call<AllData> allDataCall = retrofitService.getAllData();
        allDataCall.enqueue(new Callback<AllData>() {
            @Override
            public void onResponse(Call<AllData> call, Response<AllData> response) {

                if (response.isSuccessful()){
                    areaList =  response.body().getAreaList();
                    for (Area area: areaList){
                        if (searchInList(1,area.getArea_name()) == -1){
                            appDatabase.getAreaDao().insert(area);
                        }else {
                            appDatabase.getAreaDao().update(area);
                        }

                    }
                    cityList = response.body().getCityList();
                    for (City city: cityList){
                        if (searchInList(2,city.getCity_name()) == -1){
                            appDatabase.getCityDao().insert(city);
                        }else {
                            appDatabase.getCityDao().update(city);
                        }
                    }

                    CityAdapter cityAdapter = new CityAdapter(MainActivity.this,R.layout.city_splinner_item,R.id.itemTV,cityList);


                    citySpinner.setAdapter(cityAdapter);

                    citySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            Log.d("LOL", "onItemClick: Ap" +position);

                            areaList= appDatabase.getAreaDao().getAllSortedArea(cityList.get(position).getId());
                            //areaAdapter.notifyDataSetChanged();
                            areaAdapter = new AreaAdapter(MainActivity.this,R.layout.area_splinner_item,R.id.itemTV,areaList);
                            areaSpinner.setAdapter(areaAdapter);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });



                }
            }

            @Override
            public void onFailure(Call<AllData> call, Throwable t) {
                Log.d("My123", "onFailure: "+t.getMessage());
            }
        });
    }

    public int searchInList(int option,String name){
        if (option == 1){
            for (Area area:areaList){
                if (area.getArea_name().equals(name)){
                    return area.getId();
                }
            }
        }else if (option == 2){
            for (City city:cityList){
                if (city.getCity_name().equals(name)){
                    return city.getId();
                }
            }
        }
        return -1;
    }

}













/*
districtSpinner = findViewById(R.id.citySpinner);
        ArrayAdapter<CharSequence> adapterDis = ArrayAdapter.createFromResource(this,
                R.array.district_array, android.R.layout.simple_spinner_item);
        adapterDis.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        districtSpinner.setAdapter(adapterDis);


        areaSpinner = findViewById(R.id.areaSpinner);
        ArrayAdapter<CharSequence> adapterArea = ArrayAdapter.createFromResource(this,
                R.array.area_array, android.R.layout.simple_spinner_item);
        adapterArea.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        areaSpinner.setAdapter(adapterArea);
*/
