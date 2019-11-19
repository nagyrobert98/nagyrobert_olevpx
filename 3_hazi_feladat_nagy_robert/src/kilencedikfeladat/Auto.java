/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kilencedikfeladat;

import java.util.Objects;

/**
 *
 * @author Nagy Róbert
 */
public class Auto implements Osszehasonlithato<Auto> {
    private String rendszam;
    private int teljesitmeny;
    private boolean automata;

    public Auto(String rendszam, int teljesitmeny, boolean automata) {
        this.rendszam = rendszam;
        this.teljesitmeny = teljesitmeny;
        this.automata = automata;
    }

    public String getRendszam() {
        return rendszam;
    }

    public int getTeljesitmeny() {
        return teljesitmeny;
    }

    public boolean isAutomata() {
        return automata;
    }

    @Override
    public String toString() {
        return "Auto: rendszam= " + rendszam + ", teljesitmeny= " + teljesitmeny + ", automata= " + automata;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Auto))
        {
            return false;
        }
        Auto a = (Auto) obj;
        return this.rendszam.equals(a.getRendszam());
    }

    @Override
    public int compareTo(Auto a) {
        if(this.teljesitmeny > a.teljesitmeny)
            return 1;
        else if(this.teljesitmeny < a.teljesitmeny)
            return -1;
        else return 0;
    }
    
    public boolean redszam(Auto a){
        if(this.rendszam.matches("^[a-zA-Z]*3") && this.rendszam.matches("^[1-9]*3"))
            return true;
        else return false;
    }
}
