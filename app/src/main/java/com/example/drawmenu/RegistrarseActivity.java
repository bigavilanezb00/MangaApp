package com.example.drawmenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.drawmenu.databinding.ActivityRegistrarseBinding;

public class RegistrarseActivity extends AppCompatActivity {

    ActivityRegistrarseBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((binding = ActivityRegistrarseBinding.inflate(getLayoutInflater())).getRoot());


        binding.botonDeRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });
    }

    public void openDialog() {
        DialogCorreo exampleDialog = new DialogCorreo();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }
}