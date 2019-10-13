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
public class Etterem extends VendeglatoipariEgyseg {

    String[] etlap;

    public Etterem(String[] etlap, String nev, int ferohely, boolean dohanyzo) {
        super(nev, ferohely, dohanyzo);
        this.etlap = etlap;
    }

    public String[] getEtlap() {
        return etlap;
    }

    @Override
    public String toString() {
        return super.getNev() + " etlap= " + Arrays.toString(this.etlap);
    }
    
    

}
