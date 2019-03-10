package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView{


    RecyclerView rv, rv1, rv2;
    BarbieAdapter adapter;
    BarbiePresenter presenter;
    List<BarbieModel> barbieModels = new ArrayList <>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv =  findViewById(R.id.rv_vertical);
        rv.setLayoutManager(new LinearLayoutManager(this));
        adapter = new BarbieAdapter(this,barbieModels);
        rv.setAdapter(adapter);
        presenter = new BarbiePresenter(this,this);
        presenter.setData();
        rv1 =  findViewById(R.id.rv_horizontal);
        rv1.setLayoutManager(new LinearLayoutManager(this, LinearLayout.HORIZONTAL, true));
        adapter = new BarbieAdapter(this,barbieModels);
        rv1.setAdapter(adapter);
        presenter = new BarbiePresenter(this,this);
        presenter.setData();
        rv2 =  findViewById(R.id.rv_grid);
        rv2.setLayoutManager(new GridLayoutManager(this, 2));
        adapter = new BarbieAdapter(this,barbieModels);
        rv2.setAdapter(adapter);
        presenter = new BarbiePresenter(this,this);
        presenter.setData();
    }

    @Override
    public void onSucces(List<BarbieModel> barbieModels) {
        this.barbieModels.clear();
        this.barbieModels.addAll(barbieModels);
        this.adapter.notifyDataSetChanged();
    }
}
