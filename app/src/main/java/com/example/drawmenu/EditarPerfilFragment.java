package com.example.drawmenu;

import android.content.Intent;
import android.graphics.Color;
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

import java.util.ArrayList;
import java.util.List;

import lecho.lib.hellocharts.model.Axis;
import lecho.lib.hellocharts.model.AxisValue;
import lecho.lib.hellocharts.model.Line;
import lecho.lib.hellocharts.model.LineChartData;
import lecho.lib.hellocharts.model.PointValue;
import lecho.lib.hellocharts.model.Viewport;
import lecho.lib.hellocharts.view.LineChartView;


public class EditarPerfilFragment extends Fragment {

    Button bact;
    private View paramView;
    LineChartView lineChartView;
    NavController navController;


    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup
            container, @Nullable Bundle savedInstanceState) {

        paramView = inflater.inflate(R.layout.fragment_editar_perfil, container, false);
        lineChartView = paramView.findViewById(R.id.chart);

        final ImageView button = (ImageView) paramView.findViewById(R.id.ojocontra);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView view = (TextView) paramView.findViewById(R.id.inputcontraseña);
                view.setHint("123-561!");
            }
        });
        final ImageView foto = (ImageView) paramView.findViewById(R.id.fotode_perfil);
        foto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(intent);
            }
        });
        return paramView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);

        bact = view.findViewById(R.id.boton_actualizar_perfil);
        bact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_editarPerfilFragment_to_perfilFragment);
            }
        });
    }
}