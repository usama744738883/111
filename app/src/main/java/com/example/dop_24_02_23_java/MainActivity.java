package com.example.dop_24_02_23_java;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dop_24_02_23_java.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnItemClick {
    ActivityMainBinding binding;
    AdapterFlat adapter;
    ArrayList<FlatModel> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        fillOurList();
        initRecycler();
    }

    private void initRecycler() {
        adapter = new AdapterFlat(arrayList,this);
        binding.rvFlat.setAdapter(adapter);
    }

    private void fillOurList() {
        arrayList.add(new FlatModel("3 Rooms","Sovetskaya 53",R.drawable.img));
        arrayList.add(new FlatModel("4 Rooms","Manas 53",R.drawable.img));
        arrayList.add(new FlatModel("3 Rooms","Sovetskaya 53",R.drawable.img));
        arrayList.add(new FlatModel("3 Rooms","Sovetskaya 53",R.drawable.img));
        arrayList.add(new FlatModel("3 Rooms","Sovetskaya 53",R.drawable.img));
        arrayList.add(new FlatModel("3 Rooms","Sovetskaya 53",R.drawable.img));
        arrayList.add(new FlatModel("3 Rooms","Sovetskaya 53",R.drawable.img));
        arrayList.add(new FlatModel("3 Rooms","Sovetskaya 53",R.drawable.img));
        arrayList.add(new FlatModel("3 Rooms","Sovetskaya 53",R.drawable.img));
        arrayList.add(new FlatModel("3 Rooms","Sovetskaya 53",R.drawable.img));
        arrayList.add(new FlatModel("3 Rooms","Sovetskaya 53",R.drawable.img));
    }

    @Override
    public void onClick(FlatModel flatModel) {
        Intent intent = new Intent(this,ContainerActivity.class);
        intent.putExtra("flat",flatModel);
        startActivity(intent);
    }
}