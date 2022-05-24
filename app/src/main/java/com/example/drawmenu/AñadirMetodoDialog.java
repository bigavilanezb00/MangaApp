package com.example.drawmenu;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatDialogFragment;

public class AñadirMetodoDialog extends AppCompatDialogFragment {
    private EditText edittitular;
    private EditText editntarjeta;
    private EditText editcaduca;
    private EditText editcseguridad;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.anadir_metodo_layout, null);

        builder.setView(view)
                .setTitle("Añadir método de pago")
                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });

        edittitular = view.findViewById(R.id.titular);
        editntarjeta = view.findViewById(R.id.ntarjeta);
        editcaduca = view.findViewById(R.id.caduca);
        editcseguridad = view.findViewById(R.id.cseguridad);

        return builder.create();
    }
}