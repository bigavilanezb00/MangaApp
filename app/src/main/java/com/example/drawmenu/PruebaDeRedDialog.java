package com.example.drawmenu;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class PruebaDeRedDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Prueba de red")
                .setMessage("Lengua: Español\n"+
                        "UserAgent: Mozilla/5.0\n"+
                        "Plaraforma: Android 6.0\n"+
                        "Explorador: WkWebView\n"+
                        "API Velocidad de respuesta: 274ms\n"+
                        "IP: 88.56.25.98\n"+
                        "Localización: España/Madrid")
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        return builder.create();
    }
}