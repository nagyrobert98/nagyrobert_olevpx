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
public class Teszt {

    private static Kocsma[] AdottItalKinaloKocsmak(String sor, VendeglatoipariEgyseg[] ve) {
        int p = 0;
        for (int i = 0; i < ve.length; i++) {
            if (ve[i] instanceof Kocsma) {
                Kocsma k = (Kocsma) ve[i];
                for (int j = 0; j < k.getSorlap().length; j++) {
                    if (k.getSorlap()[j].equals(sor)) {
                        p++;
                        break;
                    }
                }
            }
        }
        Kocsma[] kocsma = new Kocsma[p];
        p = 0;
        for (int i = 0; i < ve.length; i++) {
            if (ve[i] instanceof Kocsma) {
                Kocsma k = (Kocsma) ve[i];
                for (int j = 0; j < k.getSorlap().length; j++) {
                    if(k.getSorlap()[j].equals(sor)){
                        kocsma[p] = k;
                        p++;
                    }
                }
            }
        }
        return kocsma;
    }

    public static void main(String[] args) {
        VendeglatoipariEgyseg[] v = new VendeglatoipariEgyseg[]{
            new Kocsma(new String[]{"Csíki", "Heineken", "Soproni"}, "Bástya", 50, true),
            new Kocsma(new String[]{"Borsodi", "Kőbányai", "Soproni"}, "Amnesia", 20, false),
            new Kocsma(new String[]{"Dreher", "Heineken", "Fácán"}, "Yes", 30, true),
            new Kocsma(new String[]{"HB", "Heineken", "Kőbányai"}, "Szmog", 60, true),
            new Kocsma(new String[]{"Csíki", "Borsodi", "Soproni"}, "Furedi", 100, true),
            new Etterem(new String[]{"grill csírke", "steak", "papcsinta"}, "Colorado", 40, false),
            new Etterem(new String[]{"grill csírke", "pizza", "papcsinta"}, "La terazza", 50, true),
            new Etterem(new String[]{"spagetti", "steak", "hamburger"}, "McDonalds", 150, false),
            new Etterem(new String[]{"fagyi", "steak", "rántotthús"}, "Széchenyi", 60, false),
            new Etterem(new String[]{"gnocchi", "steak", "csokitorta"}, "Nem tudok többet", 200, true)
        };

        Kocsma[] kk = AdottItalKinaloKocsmak("Soproni", v);
        System.out.println(Arrays.toString(kk));
    }
}
