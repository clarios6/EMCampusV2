package com.example.sokka.emcampus;

/**
 * Created by sokka on 4/23/2017.
 */

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;



public class show_school extends AppCompatActivity implements InfoTemplate{

    private final String SCHOOL_NAME = "CSU San Jose";

    private final String ADDRESS = "One Washington Square, San Jose, CA";

    private final String NUM_STRING = "(408)924-2222";



    @Override

    public String getSchoolName() {

        return this.SCHOOL_NAME;

    }



    @Override

    public String getAddress() {

        return this.ADDRESS;

    }



    @Override

    public String getNumString() {

        return this.NUM_STRING;

    }



    @Override

    public int getNumInt() {

        return 0;

    }



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_show_school);

    }

}
