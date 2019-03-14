package com.osg31.resepmakanan.viewmodel;

import android.content.Context;
import android.widget.Toast;

import com.osg31.resepmakanan.api.ApiClient;
import com.osg31.resepmakanan.api.ApiInterface;
import com.osg31.resepmakanan.model.Meal;
import com.osg31.resepmakanan.model.Recipe;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class listvm implements Callback<Recipe>{
    private Context context;
    private ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);

    private List<Meal> srecipe;

    public listvm(Context context){
        this.context=context;
    }

    public void getRecipe(String search){
        Call<Recipe> call = apiInterface.getRecipe(search);
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<Recipe> call, Response<Recipe> response) {
        if (response.body() != null) {
            srecipe=response.body().meals;

        } else
            Toast.makeText(context, "Data Null", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFailure(Call<Recipe> call, Throwable t) {
    }
}
