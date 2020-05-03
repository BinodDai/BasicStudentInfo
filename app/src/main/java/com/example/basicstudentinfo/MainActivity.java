package com.example.basicstudentinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView phone,dob,govid,joineddate,leftdate,email,studenttype,status,ethnicgroup,house,disability,religion,mothertongue,registrationNumber,symbolNumber,familiarWithSmartPhone,reasonOfLeaving,createdDate,createdBy,modifiedDate,modifiedBy,Remarks,feeCategory;
    Spinner gender,bloodgroup;
    ScrollView scrollView;
    ImageView profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phone=findViewById(R.id.phone);
        dob=findViewById(R.id.dob);
        govid=findViewById(R.id.govid);
        joineddate=findViewById(R.id.joineddate);
        leftdate=findViewById(R.id.leftdate);
        email=findViewById(R.id.email);
        studenttype=findViewById(R.id.studenttype);
        status=findViewById(R.id.status);
        ethnicgroup=findViewById(R.id.ethnicgroup);
        house=findViewById(R.id.house);
        disability=findViewById(R.id.disability);
        religion=findViewById(R.id.religion);
        mothertongue=findViewById(R.id.mothertongue);
        registrationNumber=findViewById(R.id.registrationnumber);
        symbolNumber=findViewById(R.id.symbolnumber);
        familiarWithSmartPhone=findViewById(R.id.FWsmartPhones);
        reasonOfLeaving=findViewById(R.id.RFLiving);
        createdDate=findViewById(R.id.createdDate);
        createdBy=findViewById(R.id.createdBy);
        modifiedDate=findViewById(R.id.modifDate);
        modifiedBy=findViewById(R.id.modifyBy);
        feeCategory=findViewById(R.id.feecatogory);
        Remarks=findViewById(R.id.remarks);
        gender=findViewById(R.id.gender);
        bloodgroup=findViewById(R.id.bloodgroup);
        scrollView=findViewById(R.id.scrollview);
        profile=findViewById(R.id.profile_image);
        fetchData();

    }

    private void fetchData()
    {

      //Api hit



    }
}
