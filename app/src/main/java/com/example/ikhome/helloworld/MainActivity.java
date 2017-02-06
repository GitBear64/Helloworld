package com.example.ikhome.helloworld;

import android.os.Bundle;
import android.util.Log;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String TAG="Laskin";



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void summaLasku(View view) {
        Log.d(TAG, "Laske-nappia painettiin");
        EditText editTextNumero1 = (EditText) findViewById(R.id.numero1);
        EditText editTextNumero2 = (EditText) findViewById(R.id.numero2);
        EditText editTextTulos = (EditText) findViewById(R.id.Tulos);

        //luetaan arvo ruudusta
        String arvo1 = editTextNumero1.getText().toString();

        //muunnetaan arvo kokonaisluvuksi
        int luku1 = Integer.parseInt(arvo1);

        //ja toiselle luvulle sama
        int luku2 = Integer.parseInt(editTextNumero2.getText().toString());

        Log.d(TAG, "numero1="+luku1+" ja numero2="+luku2);
        int tulos = luku1+luku2;

        //kirjoitetaan tulos näyttöön
        editTextTulos.setText(""+tulos);

    }

    public void vahennysLasku(View view) {
        Log.d(TAG, "Laske-nappia painettiin");
        EditText editTextNumero3 = (EditText) findViewById(R.id.numero3);
        EditText editTextNumero4 = (EditText) findViewById(R.id.numero4);
        EditText editTextTulos2 = (EditText) findViewById(R.id.Tulos2);

        //luetaan arvo ruudusta
        String arvo1 = editTextNumero3.getText().toString();

        //muunnetaan arvo kokonaisluvuksi
        int luku3 = Integer.parseInt(arvo1);

        //ja toiselle luvulle sama
        int luku4 = Integer.parseInt(editTextNumero4.getText().toString());

        Log.d(TAG, "numero3="+luku3+" ja numero4="+luku4);
        int tulos2 = luku3-luku4;

        //kirjoitetaan tulos näyttöön
        editTextTulos2.setText(""+tulos2);

    }

    public void kertoLasku(View view) {
        Log.d(TAG, "Laske-nappia painettiin");
        EditText editTextNumero5 = (EditText) findViewById(R.id.numero5);
        EditText editTextNumero6 = (EditText) findViewById(R.id.numero6);
        EditText editTextTulos3 = (EditText) findViewById(R.id.Tulos3);

        //luetaan arvo ruudusta
        String arvo1 = editTextNumero5.getText().toString();

        //muunnetaan arvo kokonaisluvuksi
        int luku5 = Integer.parseInt(arvo1);

        //ja toiselle luvulle sama
        int luku6 = Integer.parseInt(editTextNumero6.getText().toString());

        Log.d(TAG, "numero5="+luku5+" ja numero6="+luku6);
        int tulos3 = luku5*luku6;

        //kirjoitetaan tulos näyttöön
        editTextTulos3.setText(""+tulos3);

    }

    public void jakoLasku(View view) {
        Log.d(TAG, "Laske-nappia painettiin");
        EditText editTextNumero8 = (EditText) findViewById(R.id.numero8);
        EditText editTextNumero9 = (EditText) findViewById(R.id.numero9);
        EditText editTextTulos4 = (EditText) findViewById(R.id.Tulos4);

        //luetaan arvo ruudusta
        String arvo1 = editTextNumero8.getText().toString();

        //muunnetaan arvo kokonaisluvuksi
        int luku8 = Integer.parseInt(arvo1);

        //ja toiselle luvulle sama
        int luku9 = Integer.parseInt(editTextNumero9.getText().toString());

        Log.d(TAG, "numero8="+luku8+" ja numero9="+luku9);
        int tulos4 = luku8/luku9;

        //kirjoitetaan tulos näyttöön
        editTextTulos4.setText(""+tulos4);

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() - metodia kutsuttiin");

    }

    /*protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() - metodia kutsuttiin");*/

}

