/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hetedikfeladat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Nagy Róbert
 */
public class Test{
    public static void main(String[] args) {
        List<Lakohaz> Lakohazak = new ArrayList<Lakohaz>();
        
        Lakohazak.add(new Lakohaz("Nagyerdei krt",4,100));
        Lakohazak.add(new Lakohaz("Egyetem sgr",5,2000));
        Lakohazak.add(new Lakohaz("Kassai u",3,500));
        Lakohazak.add(new Lakohaz("Rigo",2,250));
        Lakohazak.add(new Lakohaz("Kert köz",1,150));
        Lakohazak.add(new Lakohaz("Auguszta",10,200));
        Lakohazak.add(new Lakohaz("Debreceni ut",2,240));
        Lakohazak.add(new Lakohaz("Szechenyi ut",3,300));
        Lakohazak.add(new Lakohaz("Csapo",4,4000));
        Lakohazak.add(new Lakohaz("Gvadanyi",5,220));
        
        
    }
    
//    public List<Lakohaz> tagasLakohazak (List lista, double terfogat){
//        
//    }
//
//
//    @Override
//    public int compareTo(Lakohaz l) {
//        l.
//    }
}
