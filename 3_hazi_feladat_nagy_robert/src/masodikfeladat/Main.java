/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masodikfeladat;

/**
 *
 * @author Nagy Róbert
 */
public class Main {
    public static void maxalkohol(Ital[] t){
        if(t.length < 3);
        else for(int j = 0; j < t.length; j++){
            if(t[j].compareTo(t[j+1]) == 1)
            {
                Ital tmp = t[j];
                t[j] = t[j+1];
                t[j+1] = tmp;
            }
        }
    }
    
    public static void main(String[] args) {
        Ital[] ital = new Ital[]{
            new Ital("Cola","5 dl",300),
            new Ital("Fsnta","1 dl",100),
            new Ital("Cappy","2 dl",150),
            new Ital("Sprite","1 l",450),
            new Ital("XIXO","1,5 l",350),
            new SzeszesItal(11.5,"Bor","7 dl",700),
            new SzeszesItal(4.5,"Borsodi","5 dl",380),
            new SzeszesItal(6.5,"Csiki","5 dl",550),
            new SzeszesItal(3.2,"Kőbányai","5 dl",280),
            new SzeszesItal(37.2,"Zubrowka","5 dl",3500)
        };
        
        maxalkohol(ital);
        
        for(int i = ital.length-3; i <ital.length;i++)
        System.out.println(ital[i] + " " + ital[i] + " " + ital[i] + " " );
        
        System.out.println("");
        
        for(int j = 0; j < ital.length; j++){
            System.out.println(ital[j]);
        }
    }
}
