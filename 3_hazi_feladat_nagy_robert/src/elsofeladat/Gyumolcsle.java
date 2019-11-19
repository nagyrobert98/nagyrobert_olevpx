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
public abstract class Gyumolcsle extends Ital {
    public String mibolfacsartak;
    public String mibolkeszult;
    public String milyenizu;

    public Gyumolcsle(String mibolfacsartak, String mibolkeszult, String milyenizu) {
        this.mibolfacsartak = mibolfacsartak;
        this.mibolkeszult = mibolkeszult;
        this.milyenizu = milyenizu;
    }

    @Override
    public String toString() {
        return "Gyumolcsle: mibolfacsartak= " + mibolfacsartak + ", mibolkeszult= " + mibolkeszult + ", milyenizu= " + milyenizu;
    }
}