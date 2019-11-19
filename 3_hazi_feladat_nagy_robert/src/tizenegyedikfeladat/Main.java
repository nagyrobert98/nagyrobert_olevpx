/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tizenegyedikfeladat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Nagy Róbert
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Osztalypenz> lista = new ArrayList();

        while (sc.hasNextLine()) {
            String[] sor = sc.nextLine().split(";");
            if (sor.length == 1) {
                break;
            }
            Osztalypenz o = new Osztalypenz(sor[0], Integer.parseInt(sor[1]));

            if (lista.contains(o)) {
                int ind = lista.indexOf(o);
                lista.get(ind).setMennyi(lista.get(ind).getMennyi() + Integer.parseInt(sor[1]));
            } else {
                lista.add(o);
            }
        }
        Collections.sort(lista);

        for (Osztalypenz i : lista) {
            System.out.println(i);
        }
    }
}

class Osztalypenz implements Comparable<Osztalypenz> {

    private String ki;
    private int mennyi;

    public Osztalypenz(String ki, int mennyi) {
        this.ki = ki;
        this.mennyi = mennyi;
    }

    public String getKi() {
        return ki;
    }

    public void setKi(String ki) {
        this.ki = ki;
    }

    public int getMennyi() {
        return mennyi;
    }

    public void setMennyi(int mennyi) {
        this.mennyi = mennyi;
    }

    @Override
    public String toString() {
        return ki + ";" + mennyi;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Osztalypenz)) {
            return false;
        }
        Osztalypenz o = (Osztalypenz) obj;
        return this.ki.equals(o.getKi());
    }

    @Override
    public int compareTo(Osztalypenz o) {
        if (this.mennyi == o.getMennyi()) {
            return this.ki.compareTo(o.getKi());
        } else {
            return (-1) * Integer.compare(this.mennyi, o.getMennyi());
        }
    }
}
