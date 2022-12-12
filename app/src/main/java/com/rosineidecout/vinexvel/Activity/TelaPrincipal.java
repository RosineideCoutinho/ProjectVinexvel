package com.rosineidecout.vinexvel.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.rosineidecout.vinexvel.R;

public class TelaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        getActionBar().hide();

    }
}