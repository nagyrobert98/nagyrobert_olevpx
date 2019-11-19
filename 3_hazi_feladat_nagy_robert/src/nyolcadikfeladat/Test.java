/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyolcadikfeladat;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nagy Róbert
 */
public class Test {
    public static void main(String[] args) {
        List<Hatizsak> hatizsakok = new ArrayList<Hatizsak>();
        
        hatizsakok.add(new Hatizsak("Nike",20,2,false));
        hatizsakok.add(new Hatizsak("Adidas",15,4,false));
        hatizsakok.add(new Hatizsak("Fila",20,2,false));
        hatizsakok.add(new Hatizsak("Xiaomi",25,3,true));
        hatizsakok.add(new Hatizsak("Puma",10,4,false));
        hatizsakok.add(new Hatizsak("Gucci",5,4,false));
        hatizsakok.add(new Hatizsak("Nike",40,6,true));
        hatizsakok.add(new Hatizsak("Adidas",30,2,true));
        hatizsakok.add(new Hatizsak("Puma",15,1,false));
        hatizsakok.add(new Hatizsak("Xiaomi",40,5,true));
        
    }
    
//    public List<Hatizsak> kiir(List h){
//        
//    }
}
