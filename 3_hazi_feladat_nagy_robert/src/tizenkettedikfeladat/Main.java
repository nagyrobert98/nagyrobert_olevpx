/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tizenkettedikfeladat;

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
        List<ZarhelyiEredmenyek> lista = new ArrayList();
        
        while(sc.hasNextLine()){
            String[] sor = sc.nextLine().split(";");
            
            if(sor.length == 1)
                break;
            
            ZarhelyiEredmenyek zh = new ZarhelyiEredmenyek(sor[0], Integer.parseInt(sor[1]));
            
            if(lista.contains(zh)){
                int ind = lista.indexOf(zh);
                lista.get(ind).setEredmeny(lista.get(ind).getEredmeny() + Integer.parseInt(sor[1]));
            }
            else
                lista.add(zh);
            
        }
        
        Collections.sort(lista);
        
        for(ZarhelyiEredmenyek i : lista)
            System.out.println(i);
    }
}

class ZarhelyiEredmenyek implements Comparable<ZarhelyiEredmenyek> {

    private String ki;
    private int eredmeny;

    public ZarhelyiEredmenyek(String ki, int eredmeny) {
        this.ki = ki;
        this.eredmeny = eredmeny;
    }

    public String getKi() {
        return ki;
    }

    public void setKi(String ki) {
        this.ki = ki;
    }

    public int getEredmeny() {
        return eredmeny;
    }

    public void setEredmeny(int eredmeny) {
        this.eredmeny = eredmeny;
    }

    @Override
    public String toString() {
        return ki + ": " + eredmeny + " pont";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ZarhelyiEredmenyek)) {
            return false;
        }
        ZarhelyiEredmenyek zh = (ZarhelyiEredmenyek) obj;
        return this.ki.equals(zh.getKi());
    }

    @Override
    public int compareTo(ZarhelyiEredmenyek o) {
        if(this.eredmeny == o.getEredmeny())
            return this.ki.compareTo(o.getKi());
        else
            return (-1) * Integer.compare(this.eredmeny, o.getEredmeny());
    }

}
