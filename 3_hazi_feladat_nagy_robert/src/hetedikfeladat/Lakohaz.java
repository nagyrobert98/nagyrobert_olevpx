/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hetedikfeladat;

/**
 *
 * @author Nagy Róbert
 */
public class Lakohaz implements Comparable<Lakohaz> {
    public static final double emeletmagassag = 3.2;
    private String cim;
    private int emeletekszama;
    private double alapterulet;

    public Lakohaz(String cim, int emeletekszama, double alapterulet) {
        this.cim = cim;
        this.emeletekszama = emeletekszama;
        this.alapterulet = alapterulet;
    }

    public String getCim() {
        return cim;
    }

    public int getEmeletekszama() {
        return emeletekszama;
    }

    public double getAlapterulet() {
        return alapterulet;
    }

    @Override
    public String toString() {
        return "Lakohaz: cim= " + cim + ", emeletekszama= " + emeletekszama + ", alapterulet= " + alapterulet;
    }
    
    public double legkobmeter(){
        return this.alapterulet*emeletmagassag*this.emeletekszama;
    }
    public int compareTo(Lakohaz l){
        if(this.legkobmeter() < l.legkobmeter())
            return -1;
        else if(this.legkobmeter() > l.legkobmeter())
            return 1;
        else return 0;
    }
}
