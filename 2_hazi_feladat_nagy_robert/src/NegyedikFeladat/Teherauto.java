/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NegyedikFeladat;

/**
 *
 * @author Nagy Róbert
 */
public class Teherauto extends Auto {
    
    int maxSzallithatoTeher;
    
    public Teherauto(String rendszam, int motorTeljesitmeny, int maxSzallithatoTeher){
        super(rendszam, motorTeljesitmeny);
        this.maxSzallithatoTeher = maxSzallithatoTeher;
    }

    public int getMaxSzallithatoTeher() {
        return maxSzallithatoTeher;
    }

    @Override
    public String toString() {
        return super.toString() + " maxTeher= " + maxSzallithatoTeher;
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
        final Teherauto other = (Teherauto) obj;
        if (this.maxSzallithatoTeher != other.maxSzallithatoTeher) {
            return false;
        }
        return true;
    }
    
    
}
