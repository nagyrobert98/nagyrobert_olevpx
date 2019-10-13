/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasodikResz;

/**
 *
 * @author Nagy Róbert
 */
public class Test {

    public static void main(String[] args) {
        Katona k1 = new Nyilas(3, 2);
        Katona k2 = new Nyilas(5, 1);
        Katona k3 = new Landzsas(2, 3);

        if (megkuzd(k1, k2) == 1) {
            if (megkuzd(k1, k3) == 1) {
                System.out.println(k1);
            } else {
                System.out.println(k3);
            }
        } else if (megkuzd(k1, k2) == 2) {
            if (megkuzd(k2, k3) == 1) {
                System.out.println(k2);
            } else {
                System.out.println(k3);
            }
        }

    }

    public static int megkuzd(Katona k, Katona kk) {
        if (k.getTamadoero() - kk.getVedoero() > 0) {
            System.out.println(k + " " + kk);
//            System.out.println("Nyertes: " + k);
            return 1;

        } else if (k.getTamadoero() - kk.getVedoero() < 0) {
            System.out.println(k + " " + kk);
//            System.out.println("Nyerte: " + kk);
            return 2;

        } else {
            System.out.println(k + " " + kk);
//            System.out.println("Nyertes: " + k);
            return 1;
        }
    }
}
