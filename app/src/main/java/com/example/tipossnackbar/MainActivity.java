package com.example.tipossnackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnSnackBarShort, btnSnackBarLength, btnSnackBarIndefinide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSnackBarShort = findViewById(R.id.buttonSnackBarShort);
        btnSnackBarLength = findViewById(R.id.buttonSnackBarLength);
        btnSnackBarIndefinide = findViewById(R.id.buttonSnackBarIndefinite);


        btnSnackBarShort.setOnClickListener(this);
        btnSnackBarLength.setOnClickListener(this);
        btnSnackBarIndefinide.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonSnackBarShort) {
            Snackbar.make(v, "Mensaje de Tipo SnackBar Short", Snackbar.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.buttonSnackBarIndefinite) {
            Snackbar.make(v, "Mensaje de Tipo SnackBar Indefinite", Snackbar.LENGTH_INDEFINITE).show();
        } else {
            Snackbar.make(v, "Mensaje de Tipo SnackBar Long", Snackbar.LENGTH_LONG).show();
        }
    }
}