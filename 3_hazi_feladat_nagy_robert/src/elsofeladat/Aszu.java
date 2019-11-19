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
public class Aszu extends Bor {
    private int puttonyszam;

    public Aszu(int puttonyszam, String szolofajta, String termoterulet, String iz, double alkoholos) {
        super(szolofajta, termoterulet, iz, alkoholos);
        this.puttonyszam = puttonyszam;
    }

    public int getPuttonyszam() {
        return puttonyszam;
    }

    @Override
    public String toString() {
        return "Aszu puttonyszam=" + puttonyszam;
    }
    
    
    
}
