/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hatodikfeladat;

import java.util.Scanner;

/**
 *
 * @author Nagy Róbert
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int diak = Integer.parseInt(sc.nextLine());
        Hallgato[] h1 = new Hallgato[diak];
        
        for(int i = 0; i < diak; i++){
            String sor[] = sc.nextLine().split(" ");
            Hallgato h = new Hallgato(Integer.parseInt(sor[0]),Boolean.parseBoolean(sor[1]));
            h1[i] = h;
        }
        
        for(int i = 0; i < h1.length; i++){
            Dolgozat a = h1[i].dolgozatotIr();
            Dolgozat b = h1[i].dolgozatotIr();
            
            a.megfelelt();
            b.megfelelt();
            
            if(a.megfelelt() && b.megfelelt()){
                System.out.println("Megfelelt");
            }
            else System.out.println("Nem felelt meg");
        }
    }
}
