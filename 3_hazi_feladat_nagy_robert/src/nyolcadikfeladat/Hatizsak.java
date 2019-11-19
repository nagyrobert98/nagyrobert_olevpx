/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyolcadikfeladat;

/**
 *
 * @author Nagy Róbert
 */
public class Hatizsak implements Comparable<Hatizsak>{
    private String marka;
    private double urtartalom;
    private int zsebekszama;
    private boolean vizhatlan;

    public Hatizsak(String marka, double urtartalom, int zsebekszama, boolean vízhatlan) {
        this.marka = marka;
        this.urtartalom = urtartalom;
        this.zsebekszama = zsebekszama;
        this.vizhatlan = vízhatlan;
    }

    public String getMarka() {
        return marka;
    }

    public double getUrtartalom() {
        return urtartalom;
    }

    public int getZsebekszama() {
        return zsebekszama;
    }

    public boolean isVizhatlan() {
        return vizhatlan;
    }

    @Override
    public String toString() {
        return "Hatizsak: marka= " + marka + ", urtartalom= " + urtartalom + ", zsebekszama= " + zsebekszama + ", vizhatlan= " + vizhatlan + '}';
    }

    @Override
    public int compareTo(Hatizsak h) {
        if(this.marka.equals(h.getMarka()))
            if(this.zsebekszama > h.getZsebekszama())
                return -1;
            else if(this.zsebekszama < h.getZsebekszama())
                return 1;
            else return 0;
        return 0;
    }
}
