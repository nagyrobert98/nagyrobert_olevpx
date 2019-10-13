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
public class Fejesek2Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] tmp = sc.nextLine().split(";");

        Fejesek2[] d = new Fejesek2[Integer.parseInt(tmp[0])];

        d[0] = new Fejesek2(tmp[1], "", "piros");

        String kit = tmp[2];

        for (int i = 1; i < d.length; i++) {

            String[] sor = sc.nextLine().split(";");
            d[i] = new Fejesek2(tmp[0], tmp[1], "");
        }

        for (int i = 1; i < d.length; i++) {
            int k = i;
            while (k < d.length) {
                if (d[k].getElozo().equals(d[i - 1].getNev())) {
                    if (d[i - 1].getSapka().equals("piros")) {
                        d[k].setSapka("kek");
                    } else {
                        d[k].setSapka("piros");
                    }

                    Fejesek2 tmp2 = d[i];
                    d[i] = d[k];
                    d[k] = tmp2;

                    break;
                }
                k++;
            }
        }

        int piros = 0;
        int kek = 0;

        for (int i = 0; i < d.length; i++) {
            if (d[i].getNev().equals(kit)) {
                System.out.println(piros + " " + kek);
                break;
            }
            if ((i + 1) % 2 == 0) {
                piros++;
            } else {
                kek++;
            }
        }

    }
}
