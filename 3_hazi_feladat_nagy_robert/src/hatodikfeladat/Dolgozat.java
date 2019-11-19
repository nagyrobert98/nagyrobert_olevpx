/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hatodikfeladat;

/**
 *
 * @author Nagy Róbert
 */
public class Dolgozat implements Pontozhato {

    private int jegy;

    public Dolgozat(int jegy) {
        this.jegy = jegy;
    }

    public int getJegy() {
        return jegy;
    }

    public void setJegy(int jegy) {
        this.jegy = jegy;
    }

    @Override
    public String toString() {
        return "Dolgozat érdemjegye=" + jegy;
    }
    

    @Override
    public boolean megfelelt() {
        if (this.jegy > 35) {
            return true;
        } else {
            System.out.println("Nem írt");
            return false;
        }
    }

}
