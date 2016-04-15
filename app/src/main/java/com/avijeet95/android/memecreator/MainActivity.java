package com.avijeet95.android.memecreator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import layout.Fragment1;
import layout.Fragment2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment1 fragment1 = new Fragment1();
        Fragment2 fragment2 = new Fragment2();
//        getFragmentManager()
        android.support.v4.app.FragmentTransaction var1 = getSupportFragmentManager().beginTransaction();

        var1.replace(R.id.frame1,fragment1);
        var1.commit();

        android.support.v4.app.FragmentTransaction var2 = getSupportFragmentManager().beginTransaction();
        Bundle bundle=new Bundle();
        bundle.putString("text", "MyText");
        fragment2.setArguments(bundle);
        var2.replace(R.id.frame2,fragment2);
        var2.commit();
    }
}
