/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HetedikFeladat;

import java.util.Scanner;

/**
 *
 * @author Nagy Róbert
 */
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nap = sc.nextLine();
        int szam = Integer.parseInt(sc.nextLine());
        Ora[] ujora = new Ora[szam];
        Orarend rend = new Orarend(nap);

        for (int i = 0; i < szam; i++) {
            nap = sc.nextLine();
            String[] tmp = nap.split(" ");
            ujora[i] = new Ora(Integer.parseInt(tmp[0]), tmp[1], Integer.parseInt(tmp[2]));
            if (rend.oratHozzaad(ujora[i])) {
                System.out.println("Hozaadtad");
            } else {
                System.out.println("Nem adtad hozzĂˇ.");
            }
        }
        rend.toString();

    }

}
