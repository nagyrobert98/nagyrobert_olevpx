/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasodikResz;

/**
 *
 * @author Nagy Róbert
 */
public class Nyilas extends Katona {

    private int lotav;

    public Nyilas(int tamadoero, int vedoero) {
        super(tamadoero, vedoero);
        tamadoero = this.lotav + tamadoero;
    }

    public int getLotav() {
        return lotav;
    }

    public void setLotav(int lotav) {
        this.lotav = lotav;
    }

    public Nyilas(int lotav) {
        this.lotav = lotav;
    }

    @Override
    public String toString() {
        return "Nyilas: TE " + this.getTamadoero() + ", VE "+this.getVedoero();
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
        final Nyilas other = (Nyilas) obj;
        if (this.lotav != other.lotav && this.getTamadoero() != other.getTamadoero() && this.getVedoero() != other.getVedoero()) {
            return false;
        }
        return true;
    }
    
    

}
