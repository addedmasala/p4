


















































































































package com.example.labcycle04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FragmentOne fragmentOne = new FragmentOne();
    FragmentTwo fragmentTwo = new FragmentTwo();
    int showingFragments = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.clayout,fragmentOne);
        showingFragments = 1;
        fragmentTransaction.commit();
    }

    public void SwitchFragments(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if(showingFragments==1){
            fragmentTransaction.replace(R.id.clayout,fragmentTwo);
            showingFragments = 2;
        }
        else {
            fragmentTransaction.replace(R.id.clayout,fragmentOne);
            showingFragments = 1;
        }
        fragmentTransaction.commit();
    }
}
















<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".FragmentOne">

    <ImageView
        android:id="@+id/imageView"
        android:layout_width="400dp"
        android:layout_height="300dp"
        android:layout_marginStart="5dp"
        android:layout_marginTop="148dp"
        android:layout_marginEnd="6dp"
        android:src="@drawable/number_1"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
</androidx.constraintlayout.widget.ConstraintLayout>

