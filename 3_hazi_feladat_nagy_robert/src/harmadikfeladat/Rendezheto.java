/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harmadikfeladat;

/**
 *
 * @author Nagy Róbert
 */
public interface Rendezheto<T>  {

    public boolean egyenlo(Object o);

    public boolean nagyobbMint(Object o);

    public boolean kisebbMint(Object o);
}
