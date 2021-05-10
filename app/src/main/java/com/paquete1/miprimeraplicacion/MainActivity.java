package com.paquete1.miprimeraplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtSaludo;
    String[] frases;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtSaludo = (findViewById(R.id.txtSaludo));
    }

    public void funcionSaludo(View view) {
      txtSaludo.setText(generaFrase());
      frases = String[5];
      frases[0] = "Frase una";
      frases[1] = "Frase dos";
      frases[2] = "frase tres";
    }
    public void generaFrase(View view) {
       int x = (int)(Math.random)* 5);
       txtSaludo.setText(frases[x]);
    }
}