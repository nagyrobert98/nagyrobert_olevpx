/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kilencedikfeladat;

/**
 *
 * @author Nagy Róbert
 */
public class Teherauto extends Auto {
    private int teherbiras;

    public Teherauto(String rendszam, int teljesitmeny, boolean automata,int teherbiras) {
        super(rendszam, teljesitmeny, automata);
        this.teherbiras = teherbiras;
    }

    @Override
    public String toString() {
        return "Teherauto teherbiras= " + teherbiras + " rendszam " + getRendszam() +" telj "+ getTeljesitmeny() + " automata "+ isAutomata();
    }
    
    
}
