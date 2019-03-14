
package com.osg31.resepmakanan.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Recipe {

    @SerializedName("meals")
    @Expose
    public List<Meal> meals = null;

}
