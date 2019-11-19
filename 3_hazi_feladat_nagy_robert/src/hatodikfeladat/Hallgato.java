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
public class Hallgato {
    private int mennyitkeszult;
    private boolean sokattanult;

    public Hallgato(int mennyitkeszult, boolean sokattanult) {
        this.mennyitkeszult = mennyitkeszult;
        this.sokattanult = sokattanult;
    }
    
    public Dolgozat dolgozatotIr(){
        Dolgozat d = new Dolgozat(0);
        if(sokattanult == true){
            int random = (int) Math.random()*3+4;
            random *= mennyitkeszult;
            d = new Dolgozat(random);
        }
        if(sokattanult == false){
            int random2 = (int) Math.random()*5;
            d = new Dolgozat(random2);
        }
        return d;
    }
}
