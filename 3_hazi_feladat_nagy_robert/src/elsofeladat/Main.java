/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsofeladat;

/**
 *
 * @author Nagy Róbert
 */
public class Main {
    
    private static void puttonyos(Bor[] b) {
        for(int i = 0; i<b.length;i++){
//            if(b[i].getPuttonyszam() < b[i+1].getPuttonyszam()){
//                Bor tmp = b[i];
//                b[i] = b[i+1];
//                b[i+1] = tmp;
//            }
        }
    }
    
    public static void main(String[] args) {
        Bor[] bor = new Bor[]{
        new Bor("fehér","Tokaj","édes",11.2),
        new Bor("fehér","Eger","félédes",11.2),
        new Bor("vörös","Debrecen","száraz",11.2),
        new Bor("fehér","Nyíregyháza","rozé",11.2),
        new Aszu(5,"fehér","Tokaj","rozé",11.2),
        new Aszu(6,"vörös","Eger","édes",11.2),
        new Aszu(3,"fehér","Pécs","félédes",11.2),
        new Aszu(5,"vörös","Tokaj","száraz",11.2)
        };
        
        puttonyos(bor);
    }
}

