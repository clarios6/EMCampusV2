package com.example.sokka.emcampus;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    Button Stanislaus, Sonoma, SanMarcos, SanLuisObispo, SanJose, SanFrancisco, SanDiego, SanBernardino, Sacramento, Pomona;

    Button Northridge, MonteryBay, LosAngeles, LongBeach, Humboldt, Fullerton, Fresno, EastBay;

    Button DominguezHills, Chico, ChannelIslands, CalMaritime, Bakersfield;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Stanislaus=(Button)findViewById(R.id.Stanislaus);

        Stanislaus.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this, CSU_Stanislaus.class);

                startActivity(i);

            }

        });



        Sonoma=(Button)findViewById(R.id.Sonoma);

        Sonoma.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this, CSU_Sonoma.class);

                 startActivity(i);

            }

        });



        SanMarcos=(Button)findViewById(R.id.SanMarcos);

        SanMarcos.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this, CSU_San_Marcos.class);

                startActivity(i);

            }

        });



        SanLuisObispo=(Button)findViewById(R.id.SanLuisObispo);

        SanLuisObispo.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this, Cal_Poly_SLO.class);

                startActivity(i);

            }

        });



        Sacramento=(Button)findViewById(R.id.Sacramento);

        Sacramento.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this, CSU_Sacramento.class);

                startActivity(i);

            }

        });





        Pomona=(Button)findViewById(R.id.Pomona);

        Pomona.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this, Cal_Poly_Pomona.class);

                startActivity(i);

            }

        });



        SanFrancisco=(Button)findViewById(R.id.SanFrancisco);

        SanFrancisco.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this, CSU_San_Francisco.class);

                startActivity(i);

            }

        });



        SanDiego=(Button)findViewById(R.id.SanDiego);

        SanDiego.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this, CSU_SanDiego.class);

                startActivity(i);

            }

        });



        SanBernardino=(Button)findViewById(R.id.SanBernardino);

        SanBernardino.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this, CSU_San_Bernardino.class);

                startActivity(i);

            }

        });



        SanJose=(Button)findViewById(R.id.SanJose);

        SanJose.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this, CSU_SanJose.class);

                startActivity(i);

            }

        });



        Northridge=(Button)findViewById(R.id.Northridge);

        Northridge.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this, CSU_Northridge.class);

                startActivity(i);

            }

        });



        MonteryBay=(Button)findViewById(R.id.MonteryBay);

        MonteryBay.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this, CSU_MontereyBay.class);

                startActivity(i);

            }

        });



        LosAngeles=(Button)findViewById(R.id.LosAngeles);

        LosAngeles.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this, CSU_LosAngeles.class);

                startActivity(i);

            }

        });



        LongBeach=(Button)findViewById(R.id.LongBeach);

        LongBeach.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this, CSU_LongBeach.class);

                startActivity(i);

            }

        });



        Humboldt=(Button)findViewById(R.id.Humboldt);

        Humboldt.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this, Humboldt_State.class);

                startActivity(i);

            }

        });



        Fullerton=(Button)findViewById(R.id.Fullerton);

        Fullerton.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this, CSU_Fullerton.class);

                startActivity(i);

            }

        });



        Fresno=(Button)findViewById(R.id.Fresno);

        Fresno.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this, CSU_Fresno.class);

                startActivity(i);

            }

        });



        EastBay=(Button)findViewById(R.id.EastBay);

        EastBay.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this, CSU_EastBay.class);

                startActivity(i);

            }

        });



        DominguezHills=(Button)findViewById(R.id.DominguezHills);

        DominguezHills.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this, CSU_DominguezHills.class);

                startActivity(i);

            }

        });



        Chico=(Button)findViewById(R.id.Chico);

        Chico.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this, CSU_Chico.class);

                startActivity(i);

            }

        });



        ChannelIslands=(Button)findViewById(R.id.ChannelIslands);

        ChannelIslands.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this, CSU_ChannelIslands.class);

                startActivity(i);

            }

        });



        CalMaritime=(Button)findViewById(R.id.CalMaritime);

        CalMaritime.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this, CSU_CalMaritime.class);

                startActivity(i);

            }

        });



        Bakersfield=(Button)findViewById(R.id.Bakersfield);

        Bakersfield.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this, CSU_Bakersfield.class);

                startActivity(i);

            }

        });

    }



}
