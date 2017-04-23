package com.example.sokka.emcampus;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CSU_Chico extends AppCompatActivity implements InfoTemplate {
    private final String SCHOOL_NAME = "CSU Chico";
    private final String ADDRESS = "CSU, Chico Police Department Chico, CA 95929-0133";
    private final String NUM_STRING = "911";

    private TextView cSUName;
    private TextView contactInfo;
    private Button callButton;
    private Button call911;

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
        setContentView(R.layout.activity_csu__chico); //change this one to the respective XML Layout

        cSUName = (TextView) findViewById(R.id.schoolName);
        cSUName.setText(getSchoolName());

        contactInfo = (TextView) findViewById(R.id.schoolDetail);
        contactInfo.setText(getAddress() + "\n" + getNumString());

        callButton = (Button) findViewById(R.id.callCampPol);
        callButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                dialContactPhone(getNumString());
            }
        });

        call911 = (Button) findViewById(R.id.call911);
        call911.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                dialContactPhone("911");
            }
        });

    }

    private void dialContactPhone(final String phoneNumber) {
        //startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
        String uri = "tel:" + phoneNumber.trim();
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse(uri));
        startActivity(intent);
    }
}
