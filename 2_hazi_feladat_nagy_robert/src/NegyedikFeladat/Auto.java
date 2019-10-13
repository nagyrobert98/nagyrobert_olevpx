/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NegyedikFeladat;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Nagy Róbert
 */
public class Auto {
    private String rendszam;
    private int motorTeljesitmeny;
    private Date gyartasiDatum;

    public Auto(String rendszam, int motorTeljesitmeny) {
        this.rendszam = rendszam;
        this.motorTeljesitmeny = motorTeljesitmeny;
    }

    public String getRendszam() {
        return rendszam;
    }

    public int getMotorTeljesitmeny() {
        return motorTeljesitmeny;
    }

    public Date getGyartasiDatum() {
        return gyartasiDatum;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    @Override
    public String toString() {
        return "\n"+rendszam + " teljesítmeny: " + motorTeljesitmeny;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Auto other = (Auto) obj;
        if (this.motorTeljesitmeny != other.motorTeljesitmeny) {
            return false;
        }
        if (!Objects.equals(this.rendszam, other.rendszam)) {
            return false;
        }
        if (!Objects.equals(this.gyartasiDatum, other.gyartasiDatum)) {
            return false;
        }
        return true;
    }
    
    
    
}
