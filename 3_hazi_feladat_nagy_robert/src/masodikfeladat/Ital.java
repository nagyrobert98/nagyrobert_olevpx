/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masodikfeladat;

import java.util.Objects;

/**
 *
 * @author Nagy Róbert
 */
public class Ital implements Comparable<Ital> {

    protected String név;
    protected String kiszerelés;
    protected int ár;

    public Ital(String név, String kiszerelés, int ár) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.ár = ár;
    }

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public int getÁr() {
        return ár;
    }

    @Override
    public String toString() {
        return név + ", " + kiszerelés + ", " + ár + " Ft";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Ital)) {
            return false;
        }
        Ital i = (Ital) obj;
        return this.kiszerelés.equals(i.getKiszerelés()) && this.név.equals(i.getNév());
    }

    @Override
    public int compareTo(Ital o) {
        if(this.kiszerelés == o.getKiszerelés())
            return this.név.compareTo(o.getNév());
        else
            return (-1) * this.kiszerelés.compareTo(o.getKiszerelés());
    }
}

