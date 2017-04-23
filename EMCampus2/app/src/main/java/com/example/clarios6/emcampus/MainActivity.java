package com.example.clarios6.emcampus;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
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


    /**
     *@param phoneNumber an 11 integer phone number without parenthesis or dashes
     *
     */
    private void  dialContactPhone(final String phoneNumber) {
        //startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
        String uri = "tel:" + phoneNumber.trim();
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse(uri));
        startActivity(intent);
    }
}
