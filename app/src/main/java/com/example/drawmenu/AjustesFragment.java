package com.example.drawmenu;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class AjustesFragment extends Fragment {

    TextView dfd;
    TextView moneda;
    TextView divisa;
    TextView cache;
    TextView prueba;
    NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ajustes, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);


        dfd = view.findViewById(R.id.idioma);
        dfd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((DrawerActivity) getActivity()).showPopup(view);
            }
        });

        moneda = view.findViewById(R.id.moneda);
        moneda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((DrawerActivity) getActivity()).showPopupMoneda(view);
            }
        });

        divisa = view.findViewById(R.id.divisa);
        divisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((DrawerActivity) getActivity()).showPopupMoneda(view);
            }
        });

        cache = view.findViewById(R.id.limpiarcache);
        cache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((DrawerActivity) getActivity()).openDialogCache();
            }
        });

        prueba = view.findViewById(R.id.pruebadered);
        prueba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((DrawerActivity) getActivity()).openDialogPruebadered();
            }
        });
    }

}