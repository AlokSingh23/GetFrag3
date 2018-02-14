package com.example.alok.getfrag;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


 if(savedInstanceState==null) {
             android.support.v4.app.Fragment fragment = new FirstFragment();
             android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
             fragmentManager.beginTransaction().replace(R.id.framid, fragment).commit();
         }

    }
    public void onBackPressed(){
        super.onBackPressed();
        Log.e("call","call");
    }
}
