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

    public void summaLasku(View view){
        Log.d(TAG, "Laske-nappia painettiin");
        EditText editTextNumero1 =(EditText)findViewById(R.id.numero1);
        EditText editTextNumero2 =(EditText)findViewById(R.id.numero2);
        EditText editTextTulos =(EditText)findViewById(R.id.Tulos);

        String arvo1=editTextNumero1.getText().toString();

        int luku1=Integer.parseInt(arvo1);

        Log.d(TAG, "numero1="+luku1);

        editTextTulos.setText(""+luku1);

    }
}
