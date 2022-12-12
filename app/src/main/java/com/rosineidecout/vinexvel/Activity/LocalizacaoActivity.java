package com.rosineidecout.vinexvel.Activity;


import android.app.Activity;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.RequiresApi;

import com.rosineidecout.vinexvel.R;


public class LocalizacaoActivity extends Activity {
    private LocationManager locationManager;
    private TextView latitude, longitude, provedor;


    @RequiresApi(api = Build.VERSION_CODES.R)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.localizacao);


    }}








