package com.example.sokka.emcampus;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CSU_Bakersfield extends AppCompatActivity implements InfoTemplate {
    private final String SCHOOL_NAME = "CSU Bakersfield";
    private final String ADDRESS = "9001 Stockdale Highway, Bakersfield, CA 93311";
    private final String NUM_STRING = "(661) 654-2111";

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
        setContentView(R.layout.activity_csu__bakersfield); //change this one to the respective XML Layout

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
