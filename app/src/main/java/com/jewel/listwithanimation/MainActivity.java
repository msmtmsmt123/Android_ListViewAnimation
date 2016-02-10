package com.jewel.listwithanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.jewel.listwithanimation.adapter.AdRecycler;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String>list;
    private AdRecycler adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        prepareList();
    }
    private void init(){
        recyclerView= (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new AdRecycler(this);
        list=new ArrayList<>();
        recyclerView.setAdapter(adapter);
    }
    private void prepareList(){
        for(int i=1;i<100;i++){
            list.add("Item no : "+i);
        }
        adapter.setData(list);
    }
}
