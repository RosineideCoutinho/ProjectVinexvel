package com.rosineidecout.vinexvel.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.rosineidecout.vinexvel.Fragmentos.FragAdmi;
import com.rosineidecout.vinexvel.Fragmentos.FragHome;
import com.rosineidecout.vinexvel.Fragmentos.FragServicos;
import com.rosineidecout.vinexvel.R;

public class TelaServicosFrat extends AppCompatActivity {

    private Button btn_Home,btn_Serviços,btn_Admi;
    private FragHome fragHome;
    private FragAdmi fragAdmi;
    private FragServicos fragServicos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_servicos_frat);

        btn_Home = findViewById(R.id.btn_Home);
        btn_Admi = findViewById(R.id.btn_Admi);
        btn_Serviços = findViewById(R.id.btn_Serviços);

        fragHome = new FragHome();

    // Configurar o fragmento
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction() ;
        transaction.add(R.id.frame_Conteudo, fragHome );
        transaction.commit();

        btn_Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction() ;
                transaction.add(R.id.frame_Conteudo, fragHome );
                transaction.commit();

            }
        });

        btn_Admi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragAdmi = new FragAdmi();


                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.add(R.id.frame_Conteudo, fragAdmi);
                transaction.commit();

            }
        });

        btn_Serviços.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragServicos = new FragServicos();


                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.add(R.id.frame_Conteudo, fragServicos);
                transaction.commit();

            }
        });


    }
}