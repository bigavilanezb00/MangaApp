package com.example.drawmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.drawmenu.databinding.ActivityRegistrarseBinding;
import com.example.drawmenu.databinding.ActivityResetPasswordBinding;

public class ResetPasswordActivity extends AppCompatActivity {

    ActivityResetPasswordBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((binding = ActivityResetPasswordBinding.inflate(getLayoutInflater())).getRoot());


        binding.botonSolicitar.setOnClickListener(new View.OnClickListener() {
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