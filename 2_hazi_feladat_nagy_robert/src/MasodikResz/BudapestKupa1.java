/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasodikResz;

import java.util.Scanner;

/**
 *
 * @author Nagy Róbert
 */
public class BudapestKupa1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int ev, honap, nap;
        String tura_neve;
        int resztav;
        int[] resztavok = null;
        int count = 0;

        n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] sor = sc.nextLine().split(";");
            resztav = Integer.parseInt(sor[4]);
            for (int j = 5; j < sor.length; j++) {
                resztavok[i] = Integer.parseInt(sor[j]);
                if(resztavok.length > resztav)
                count += resztavok[i];
                
            }
        }
        
        

    }

}
