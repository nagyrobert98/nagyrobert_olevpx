/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HarmadikFeladat;

import java.util.Arrays;

/**
 *
 * @author Nagy Róbert
 */
public class Kocsma extends VendeglatoipariEgyseg{
    
    String[] sorlap;
    
    public Kocsma(String[] sorlap, String nev, int ferohely, boolean dohanyzo){
        super(nev, ferohely, dohanyzo);
        this.sorlap = sorlap;
    }

    public String[] getSorlap() {
        return sorlap;
    }

    @Override
    public String toString() {
        return super.getNev() + " sorlap= " + Arrays.toString(this.sorlap);
    }
    
}
