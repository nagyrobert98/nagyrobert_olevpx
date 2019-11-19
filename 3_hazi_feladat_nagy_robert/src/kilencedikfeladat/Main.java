/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kilencedikfeladat;

import java.util.Scanner;

/**
 *
 * @author Nagy Róbert
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Auto a1 = new Auto(sc.nextLine(),100,true);
        
        System.out.println(a1);
        
        String[] sor = sc.nextLine().split(" ");
        
        Auto a2 = new Auto(sor[0],Integer.parseInt(sor[1]), Boolean.parseBoolean(sor[2]));
        
        sor = sc.nextLine().split(" ");
        Auto a3 = new Auto(sor[0],Integer.parseInt(sor[1]), Boolean.parseBoolean(sor[2]));
        
        sor = sc.nextLine().split(" ");
        Teherauto t1 = new Teherauto(sor[0],Integer.parseInt(sor[1]), Boolean.parseBoolean(sor[2]), Integer.parseInt(sor[3]));
        
        sor = sc.nextLine().split(" ");
        Teherauto t2 = new Teherauto(sor[0],Integer.parseInt(sor[1]), Boolean.parseBoolean(sor[2]), Integer.parseInt(sor[3]));
    }
}
