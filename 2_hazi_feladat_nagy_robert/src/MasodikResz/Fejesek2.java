/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasodikResz;

/**
 *
 * @author Nagy Róbert
 */
public class Fejesek2 {
        
    String nev;
    String elozo;
    String sapka;

    public Fejesek2(String nev, String elozo, String sapka) {
        this.nev = nev;
        this.elozo = elozo;
        this.sapka = sapka;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getElozo() {
        return elozo;
    }

    public void setElozo(String elozo) {
        this.elozo = elozo;
    }

    public String getSapka() {
        return sapka;
    }

    public void setSapka(String sapka) {
        this.sapka = sapka;
    }

    @Override
    public String toString() {
        return "Diak{" + "nev=" + nev + ", elozo=" + elozo + ", sapka=" + sapka + '}';
    }
}
