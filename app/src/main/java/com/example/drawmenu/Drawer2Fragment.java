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
import android.widget.ImageView;
import android.widget.TextView;


public class Drawer2Fragment extends Fragment {

    Button metodo;
    NavController navController;
    ImageView bmastercard;
    View mastercard;
    ImageView masterimg;
    TextView tmaster;
    TextView txt;
    TextView ntarjetamaster;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_drawer2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);


        metodo = view.findViewById(R.id.boton_de_añadir);
        metodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((DrawerActivity) getActivity()).openDialogMetodoPago();
            }
        });

        bmastercard = view.findViewById(R.id.eliminarMasterCard);
        mastercard = view.findViewById(R.id.view2);
        masterimg = view.findViewById(R.id.mastercard);
        txt = view.findViewById(R.id.textView2);
        ntarjetamaster = view.findViewById(R.id.ntarjetamaster);
        tmaster = view.findViewById(R.id.tmaster);
        bmastercard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bmastercard.getVisibility() == View.VISIBLE) {
                    bmastercard.setVisibility(View.INVISIBLE);
                    mastercard.setVisibility(View.INVISIBLE);
                    masterimg.setVisibility(View.INVISIBLE);
                    txt.setVisibility(View.INVISIBLE);
                    ntarjetamaster.setVisibility(View.INVISIBLE);
                    tmaster.setVisibility(View.INVISIBLE);
                } else {
                    bmastercard.setVisibility(View.VISIBLE);
                    mastercard.setVisibility(View.VISIBLE);
                    masterimg.setVisibility(View.VISIBLE);
                    txt.setVisibility(View.VISIBLE);
                    ntarjetamaster.setVisibility(View.VISIBLE);
                    tmaster.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}