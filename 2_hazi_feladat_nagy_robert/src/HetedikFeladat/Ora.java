/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HetedikFeladat;

/**
 *
 * @author Nagy Róbert
 */
public class Ora {

    private int kod;
    private String nev;
    private int kezdes;

    public Ora(int kod, String nev, int kezdes) {
        this.kod = kod;
        this.nev = nev;
        if (this.kezdes >= 8 && this.kezdes <= 19) {
            this.kezdes = kezdes;
        }
        else if(this.kezdes < 8){
            this.kezdes = 8;
        }
        else this.kezdes = 19;
    }

    public int getKod() {
        return kod;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getKezdes() {
        return kezdes;
    }

    public void setKezdes(int kezdes) {
        this.kezdes = kezdes;
    }

    @Override
    public String toString() {
        return "Ora " + "kod=" + kod + ", nev=" + nev + ", kezdes=" + kezdes;
    }

}
