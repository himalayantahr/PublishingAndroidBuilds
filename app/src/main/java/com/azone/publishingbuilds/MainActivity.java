package com.azone.publishingbuilds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.azone.libfirstpublish.GetCountriesData;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtPrintStates = (TextView) findViewById(R.id.txtPrintStates);
        String[] arrStates = new GetCountriesData().getCountries();
        for (String state: arrStates ) {
            txtPrintStates.append(state +" \n");
        }
    }
}
