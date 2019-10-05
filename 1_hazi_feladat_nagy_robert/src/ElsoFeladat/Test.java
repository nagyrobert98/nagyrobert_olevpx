/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ElsoFeladat;

/**
 *
 * @author Nagy Róbert
 */
public class Test {
    public static void main(String[] args) {
        
        Pont p1 = new Pont(4.3,3.2);
        Pont p2 = new Pont(5.6,2.2);
        Pont p3 = new Pont(3.4,0);
        Pont p4 = new Pont(0,1.1);
        
        p1.setY(p1.getY()+5);
        p2.setY(p2.getY()+5);
        p3.setX(p3.getX()-3.4);
        p4.setX(p4.getX()-3.4);
        
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        
        
    }
}
