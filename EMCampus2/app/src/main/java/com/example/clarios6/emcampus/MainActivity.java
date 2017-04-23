package com.example.clarios6.emcampus;

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
                Intent i=new Intent(MainActivity.this, CSU_SanJose.class);
                startActivity(i);
            }
        });

        Sonoma=(Button)findViewById(R.id.Sonoma);
        Sonoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_SanJose.class);
                startActivity(i);
            }
        });

        SanMarcos=(Button)findViewById(R.id.SanMarcos);
        SanMarcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_SanJose.class);
                startActivity(i);
            }
        });

        SanLuisObispo=(Button)findViewById(R.id.SanLuisObispo);
        SanLuisObispo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_SanJose.class);
                startActivity(i);
            }
        });

        Sacramento=(Button)findViewById(R.id.Sacramento);
        Sacramento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_SanJose.class);
                startActivity(i);
            }
        });


        Pomona=(Button)findViewById(R.id.Pomona);
        Pomona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_SanJose.class);
                startActivity(i);
            }
        });

        SanFrancisco=(Button)findViewById(R.id.SanFrancisco);
        SanFrancisco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_SanJose.class);
                startActivity(i);
            }
        });

        SanDiego=(Button)findViewById(R.id.SanDiego);
        SanDiego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_SanJose.class);
                startActivity(i);
            }
        });

        SanBernardino=(Button)findViewById(R.id.SanBernardino);
        SanBernardino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_SanJose.class);
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
                Intent i=new Intent(MainActivity.this, CSU_SanJose.class);
                startActivity(i);
            }
        });

        MonteryBay=(Button)findViewById(R.id.MonteryBay);
        MonteryBay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_SanJose.class);
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
                Intent i=new Intent(MainActivity.this, CSU_SanJose.class);
                startActivity(i);
            }
        });

        Humboldt=(Button)findViewById(R.id.Humboldt);
        Humboldt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_SanJose.class);
                startActivity(i);
            }
        });

        Fullerton=(Button)findViewById(R.id.Fullerton);
        Fullerton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CSU_SanJose.class);
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

     /*
     CSUSanJose csuJS = new CSUSanJose();
    Button callButton;
    TextView schoolName;
    TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        schoolName = (TextView) findViewById(R.id.schoolName);
        schoolName.setText(csuJS.getSchoolName());

        info = (TextView) findViewById(R.id.schoolDetail);
        info.setText(csuJS.getAddress() + "\n" + csuJS.getNumString());


        callButton = (Button) findViewById(R.id.callCampPol);
        callButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                dialContactPhone(csuJS.getNumString());
            }
        });
    }

    private void  dialContactPhone(final String phoneNumber) {
        //startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
        String uri = "tel:" + phoneNumber.trim();
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse(uri));
        startActivity(intent);
    }
    */
}
