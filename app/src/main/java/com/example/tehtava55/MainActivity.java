package com.example.tehtava55;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity{

    Fragment1 instanssi1;
    Fragment1 instanssi2;
    FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragment1, Fragment1.newInstance())
                .commit();
        this.manager = getSupportFragmentManager();
        //instanssi1 = this.manager.findFragmentById(R.id.fragment1);
    }
    public void onButtonPressed(int id, String txt){
        if (id == instanssi1.getId()){

        }

    }
}

