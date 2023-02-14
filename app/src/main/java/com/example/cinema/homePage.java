package com.example.cinema;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import  android.graphics.Movie;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;

import com.example.cinema.RecycleViewOnItemClick;

import java.util.ArrayList;

public class homePage extends AppCompatActivity implements RecycleViewOnItemClick {
    RecyclerView rv;
    ArrayList<Item> movies ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        movies= new ArrayList<>();
        movies.add(new Item("chef", R.mipmap.cinem));
        movies.add(new Item("the menu", R.mipmap.cinem));
        movies.add(new Item("green book", R.mipmap.cinem));
        movies.add(new Item("TopGun", R.mipmap.cinem));
        movies.add(new Item("Samaritan", R.mipmap.cinem));
        movies.add(new Item("avatar", R.mipmap.cinem));
        rv = findViewById(R.id.recyclerview);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(movies);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);

    }


    @Override
    public void onItemClick(int position) {

    }
}
