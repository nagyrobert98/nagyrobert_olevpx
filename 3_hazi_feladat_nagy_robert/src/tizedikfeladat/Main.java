/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tizedikfeladat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author Nagy Róbert
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Hozzavalok> li = new ArrayList();

        while (sc.hasNextLine()) {

            String[] sor = sc.nextLine().split(";");
            if (sor.length == 1) {
                break;
            }
            Hozzavalok h = new Hozzavalok(sor[0], Integer.parseInt(sor[1]));

            if (li.contains(h)) {
                int ind = li.indexOf(h);
                li.get(ind).setMenny(li.get(ind).getMenny() + Integer.parseInt(sor[1]));
            } else {
                li.add(h);
            }

        }

        //Collections.sort(li);
        System.out.println("");

        for (Hozzavalok i : li) {
            System.out.println(i);
        }
    }
}

class Hozzavalok implements Comparable<Hozzavalok> {

    private String hozzavalo;
    private int menny;

    public Hozzavalok(String hozzavalo, int menny) {
        this.hozzavalo = hozzavalo;
        this.menny = menny;
    }

    public String getHozzavalo() {
        return hozzavalo;
    }

    public int getMenny() {
        return menny;
    }

    public void setMenny(int menny) {
        this.menny = menny;
    }

    @Override
    public int compareTo(Hozzavalok o) {
        if (this.menny == o.getMenny()) {
            return this.hozzavalo.compareTo(o.getHozzavalo());
        } else {
            return (-1) * Integer.compare(this.menny, o.getMenny());
        }
    }

    @Override
    public String toString() {
        return hozzavalo + ";" + menny;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Hozzavalok)) {
            return false;
        }
        Hozzavalok h = (Hozzavalok) obj;

        return this.hozzavalo.equals(h.getHozzavalo());
    }

}
