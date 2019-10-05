/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasodikFeladat;

/**
 *
 * @author Nagy Róbert
 */
public class Test {
    public static void main(String[] args) {
        RegularPolygon rp1 = new RegularPolygon();
        RegularPolygon rp2 = new RegularPolygon(6,4);
        RegularPolygon rp3 = new RegularPolygon(10,4,5.6,7.8);
        
        System.out.println(rp1);
        System.out.println(rp2);
        System.out.println(rp3);
    }
}
