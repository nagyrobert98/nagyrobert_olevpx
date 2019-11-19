/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsofeladat;

/**
 *
 * @author Nagy Róbert
 */
public abstract class AlkoholosItal extends Ital implements Alkoholos{
    private String iz;
    private double alkoholos;

    public AlkoholosItal(String iz, double alkoholos) {
        this.iz = iz;
        this.alkoholos = alkoholos;
    }

    public static double getMennyialkoholtt() {
        return mennyialkoholtt;
    }
    
    public String getIz() {
        return iz;
    }

    public double getAlkoholos() {
        return alkoholos;
    }

    @Override
    public String toString() {
        return "AlkoholosItal iz= " + iz + ", alkoholos= " + alkoholos;
    }
    
    
}
