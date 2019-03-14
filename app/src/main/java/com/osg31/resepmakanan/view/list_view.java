package com.osg31.resepmakanan.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.osg31.resepmakanan.R;
import com.osg31.resepmakanan.viewmodel.listvm;

public class list_view extends AppCompatActivity {
private listvm vrecipe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        String terima = getIntent().getExtras().getString("data");

        vrecipe=new listvm(this);
        vrecipe.getRecipe(terima);

    }
}
