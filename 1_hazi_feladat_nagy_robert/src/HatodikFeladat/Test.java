/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HatodikFeladat;

/**
 *
 * @author Nagy Róbert
 */
public class Test {
    public static void main(String[] args) {
        LinearEquation le1 = new LinearEquation(2, 3, -2, -1, 1, -2);
        LinearEquation le2 = new LinearEquation(1, -2, 1, 2, 2, -3);
        LinearEquation le3 = new LinearEquation(1, 2, 3, 5, 6, 7);
        
        System.out.println(le1);
        System.out.println(le2);
        System.out.println(le3);
    }
}
