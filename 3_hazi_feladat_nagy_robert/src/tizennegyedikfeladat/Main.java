/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tizennegyedikfeladat;

import java.util.Scanner;

/**
 *
 * @author Nagy Róbert
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] szamok = null;
        
        while(sc.hasNextLine()){
            int count = sc.nextLine().length();
            int szszam = sc.nextInt();
            
            for(int i = count; i > 0; i++){
                szamok[i] = szszam % 10;
                szszam -= szszam%10;
            }
            
        }
System.out.println(szamok);
    }
}
