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
public class Test {
    public static void main(String[] args) {
        Ital i1 = new Ital("Coca-Cola", "5 dl");
        Ital i2 = new Ital("Coca-Cola", "5 dl");
        Ital i3 = new Ital("Fanta", "5 dl");
        
        i1.setAr(100);
        i2.setAr(200);
        i3.setAr(250);
        
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        
        System.out.println(i1.equals(i2));
        System.out.println(i1.equals(i3));
        
    }
}
