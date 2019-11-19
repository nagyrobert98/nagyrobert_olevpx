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
public class Bor extends AlkoholosItal implements Alkoholos {
    private String szolofajta;
    private String termoterulet;

    public Bor(String szolofajta, String termoterulet, String iz, double alkoholos) {
        super(iz, alkoholos);
        this.szolofajta = szolofajta;
        this.termoterulet = termoterulet;
    }

    public String getSzolofajta() {
        return szolofajta;
    }

    public String getTermoterulet() {
        return termoterulet;
    }

    @Override
    public String toString() {
        return "Bor szolofajta= " + szolofajta + ", termoterulet= " + termoterulet ;
    }

    @Override
    public String mibolkeszult() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String milyenizu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
}
