/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HarmadikFeladat;

/**
 *
 * @author Nagy Róbert
 */
public class VendeglatoipariEgyseg {
    private String nev;
    private int ferohely;
    private boolean dohanyzo = false;

    public VendeglatoipariEgyseg(String nev, int ferohely, boolean dohanyzo) {
        this.nev = nev;
        this.ferohely = ferohely;
        this.dohanyzo = dohanyzo;
    }

    public String getNev() {
        return nev;
    }
    
    public int getFerohely() {
        return ferohely;
    }

    public boolean isDohanyzo() {
        return dohanyzo;
    }

    public void setDohanyzo(boolean dohanyzo) {
        this.dohanyzo = dohanyzo;
    }

    @Override
    public String toString() {
        return "VendeglatoipariEgyseg " + "nev=" + nev + " ferohely= " + ferohely + " dohanyzo= " + dohanyzo;
    }
    
    
}
