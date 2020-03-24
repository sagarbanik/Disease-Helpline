package com.sagar.diseaseshelpline.Retrofit.Service;

import com.sagar.diseaseshelpline.Model.AllData;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DAHService {

    @GET("index.php")
    Call<AllData> getAllData();

}
