/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NyolcadikFeladat;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nagy Róbert
 */
public class KoPapirOllo {

    private static final int KO = 0;
    private static final int PAPIR = 1;
    private static final int OLLO = 2;

    public static int fordit(String args) throws Exception {
        switch (args) {
            case "ko":
                return KO;
            case "papir":
                return PAPIR;
            case "ollo":
                return OLLO;
            case "vege":
                throw new GameOverException();
            default:
                throw new Exception();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int sajat;
        int gep;

        while (true) {
            try {
                sajat = fordit(sc.nextLine());
            } catch (GameOverException e) {
                System.out.println("Köszönöm a játékot!");
                break;
            } catch (Exception e) {
                System.out.println("Hibás bemenet!");
                break;
            }

            gep = rand.nextInt(3);

            System.out.println("Jatekos: " + sajat);
            System.out.println("Gep: " + gep);

            if (sajat == gep) {
                System.out.println("Dontetlen!");
            } else if ((gep + 1) % 3 == sajat) {
                System.out.println("A jatekos nyert!");
            } else {
                System.out.println("A gep nyert!");
            }
        }
    }
}
