package com.tecii.android.practica3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText txtDec;
    public TextView txtHora;
    public TextView txtMin;
    public TextView txtSeg;
    public TextView txtDeci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.txtDec = (EditText)findViewById(R.id.txtDec);
        this.txtHora = (TextView)findViewById(R.id.txtHora);
        this.txtMin = (TextView)findViewById(R.id.txtMin);
        this.txtSeg = (TextView)findViewById(R.id.txtSeg);
        this.txtDeci = (TextView)findViewById(R.id.txtDeci);
    }

    public void Convertidor (View view){
        String num = txtDec.getText().toString();
        int Horas, Minutos, Segundos, Decimos;
        double a = Double.parseDouble(num);
        Horas = (int)(a);
        Horas = Horas * 1 ;
        Minutos= Horas * 60;
        Segundos = Horas * 3600;
        Decimos = Horas * 36000;
        String re="Cantidad de Horas:" + Horas + "\n";
        String re2="Cantidad de Minutos:" + Minutos + "\n";
        String re3="Cantidad de Segundos:" + Segundos + "\n";
        String re4="Cantidad de Decimos:" + Decimos + "\n";
        txtHora.setText(re);
        txtMin.setText(re2);
        txtSeg.setText(re3);
        txtDeci.setText(re4);
    }
}
