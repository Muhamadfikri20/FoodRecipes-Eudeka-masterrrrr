package com.osg31.resepmakanan.api;


import com.osg31.resepmakanan.model.Recipe;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("api/json/v1/1/search.php")
    Call<Recipe> getRecipe(@Query("s") String s);


}



