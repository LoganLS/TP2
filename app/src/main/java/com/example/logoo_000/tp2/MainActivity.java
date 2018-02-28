package com.example.logoo_000.tp2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Livre monLivre = null;
    String titre="Les Misérables";
    String auteur="Victor Hugo";
    int nombrePages=700;
    String nouveauTitre;
    String nouveauAuteur;
    int nouveauNombrePages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button suivant =(Button)(findViewById(R.id.suivant));

        suivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                startActivity(intent);
            }
        });

        Toast.makeText(this, "onCreate MainActivity", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "onStart MainActivity", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "onResume MainActivity", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        Toast.makeText(this, "onSaveInstanceState MainActivity", Toast.LENGTH_SHORT).show();
        outState.putString("titre",titre);
        outState.putString("auteur",auteur);
        outState.putInt("nombrePages",nombrePages);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        nouveauTitre = savedInstanceState.getString("titre");
        nouveauAuteur = savedInstanceState.getString("auteur");
        nouveauNombrePages = savedInstanceState.getInt("nombrePages");

        monLivre=new Livre(nouveauTitre,nouveauAuteur,nouveauNombrePages);

        Toast.makeText(this, "onRestoreInstanceState MainActivity", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "onPause MainActivity", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "onStop MainActivity", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this, "onRestart MainActivity", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "onDestroy MainActivity", Toast.LENGTH_SHORT).show();
    }

}
