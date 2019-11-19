/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tizenharmadikfeladat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.SortedMap;

/**
 *
 * @author Nagy Róbert
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Parkolo> parkolo = new ArrayList();
        
        int n = sc.nextLine().length();
        System.out.println(n);
        int rcount = 0;

        while (sc.hasNextLine()) {
            
            String[] sor = sc.nextLine().split(";");
            String[] rendszamok = new String[sor.length];
            
            if (sor.length > 2) {
                for (int i = 3; i < sor.length; i++) {
                    rendszamok[i] = sor[i];
                    rcount = rendszamok.length;
                }
            }

            if (sor.length == 1) {
                break;
            }

            Parkolo p = new Parkolo(sor[0], Double.parseDouble(sor[1]), Integer.parseInt(sor[2]), rendszamok);

            if (parkolo.contains(p)) {
                int ind = parkolo.indexOf(p);
                parkolo.get(ind).setKapacitas(parkolo.get(ind).getKapacitas() + Integer.parseInt(sor[2]));
            } else {
                parkolo.add(p);
            }
        }
        Collections.sort(parkolo);

        for (Parkolo i : parkolo) {
            if(i.getKapacitas() > 3){
                i.setKapacitas(i.getKapacitas() - rcount);
                System.out.println(i);
                
            }
            
        }
    }
}

class Parkolo implements Comparable<Parkolo> {

    private String cim;
    private double terulet;
    private int kapacitas;
    private String[] rendszam;

    public Parkolo(String cim, double terulet, int kapacitas, String[] rendszam) {
        this.cim = cim;
        this.terulet = terulet;
        this.kapacitas = kapacitas;
        this.rendszam = rendszam;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public void setTerulet(double terulet) {
        this.terulet = terulet;
    }

    public void setKapacitas(int kapacitas) {
        this.kapacitas = kapacitas;
    }

    public void setRendszam(String[] rendszam) {
        this.rendszam = rendszam;
    }

    public String getCim() {
        return cim;
    }

    public double getTerulet() {
        return terulet;
    }

    public int getKapacitas() {
        return kapacitas;
    }

    public String[] getRendszamok() {
        return rendszam;
    }

    @Override
    public String toString() {
        return cim + ": " + kapacitas + " szabad hely";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Parkolo)) {
            return false;
        }
        Parkolo p = (Parkolo) obj;
        return this.cim.equals(p.getCim());
    }

    @Override
    public int compareTo(Parkolo o) {
        if (this.kapacitas == o.getKapacitas()) {
            return this.cim.compareTo(o.getCim());
        } else {
            return (-1) * Integer.compare(this.kapacitas, o.getKapacitas());
        }
    }

}
