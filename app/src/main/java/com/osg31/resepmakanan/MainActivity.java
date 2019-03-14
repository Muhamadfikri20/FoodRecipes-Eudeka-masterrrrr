package com.osg31.resepmakanan;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.osg31.resepmakanan.view.list_view;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.search) TextInputEditText cari;
    @BindView(R.id.ok)
    Button ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent proses= new Intent(MainActivity.this, list_view.class);
                proses.putExtra("data",cari.getText().toString());
                startActivity(proses);
            }
        });

    }


}
