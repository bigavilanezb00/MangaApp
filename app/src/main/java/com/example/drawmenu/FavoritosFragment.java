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
import android.widget.ImageView;
import android.widget.TextView;


public class FavoritosFragment extends Fragment {

    View xrp;
    ImageView star;
    NavController navController;
    ImageView logo;
    TextView txt1;
    TextView txt2;
    ImageView grafica;
    TextView valor;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favoritos, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);


        star = view.findViewById(R.id.fav3);
        xrp = view.findViewById(R.id.view4);
        logo = view.findViewById(R.id.imageView7);
        txt1 = view.findViewById(R.id.textView8);
        txt2 = view.findViewById(R.id.textView9);
        grafica = view.findViewById(R.id.imageView8);
        valor = view.findViewById(R.id.precio);
        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (star.getVisibility() == View.VISIBLE) {
                    star.setVisibility(View.INVISIBLE);
                    xrp.setVisibility(View.INVISIBLE);
                    logo.setVisibility(View.INVISIBLE);
                    txt1.setVisibility(View.INVISIBLE);
                    txt2.setVisibility(View.INVISIBLE);
                    grafica.setVisibility(View.INVISIBLE);
                    valor.setVisibility(View.INVISIBLE);
                } else {
                    star.setVisibility(View.VISIBLE);
                    xrp.setVisibility(View.VISIBLE);
                    logo.setVisibility(View.VISIBLE);
                    txt1.setVisibility(View.VISIBLE);
                    txt2.setVisibility(View.VISIBLE);
                    grafica.setVisibility(View.VISIBLE);
                    valor.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}