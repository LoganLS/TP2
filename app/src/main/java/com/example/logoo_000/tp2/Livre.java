package com.example.logoo_000.tp2;

/**
 * Created by logoo_000 on 28/02/2018.
 */

public class Livre {
    public String titre;
    public String auteur;
    public int nombrePages;

    public Livre(){}

    public Livre(String titre,String auteur,int nombrePages){
        this.titre=titre;
        this.auteur=auteur;
        this.nombrePages=nombrePages;
    }

    public String getTitre(){
        return this.titre;
    }

    public void setTitre(String titre){
        this.titre=titre;
    }

    public String getAuteur(){
        return this.auteur;
    }

    public void setAuteur(String auteur){
        this.auteur=auteur;
    }

    public int getNombrePages(){
        return this.nombrePages;
    }

    public void setNombrePages(int nombrePages){
        this.nombrePages=nombrePages;
    }
}
