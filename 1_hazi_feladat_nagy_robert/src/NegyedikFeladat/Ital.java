/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NegyedikFeladat;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Nagy Róbert
 */
public class Ital {

    protected String nev;
    protected String kiszereles;
    private static int ar = 10;
    protected Date gyartasiDátum;

    public Ital(String nev, String kiszereles) {
        this.nev = nev;
        this.kiszereles = kiszereles;
        this.gyartasiDátum = new Date();
    }

    public String getNev() {
        return nev;
    }

    public String getKiszerelés() {
        return kiszereles;
    }

    public static int getAr() {
        return ar;
    }

    public Date getGyartasiDátum() {
        return gyartasiDátum;
    }

    public static void setAr(int ar) {
        Ital.ar = ar;
    }

    public static int getArEuroban(){
        return ar/300;
    }

    @Override
    public String toString() {
        return nev + ", " + kiszereles + ", " + ar + " Ft";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if ( obj == null || !(obj instanceof Ital))
            return false;
        
        Ital i =(Ital)obj;
        if(Ital.ar != this.getAr())
        {
            return false;
        }
        return i.getNev().equals(this.nev) && i.getNev().equals(this.nev);
    } 

    
}
