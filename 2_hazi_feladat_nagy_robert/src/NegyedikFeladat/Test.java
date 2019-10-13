/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NegyedikFeladat;

import java.util.Arrays;

/**
 *
 * @author Nagy Róbert
 */
public class Test {

    private static Teherauto[] maxSzallitahato(Teherauto[] t) {
        for (int i = 0; i < t.length - 1; i++) {
            for (int j = i + 1; j < t.length; j++) {
                if (t[i].getMaxSzallithatoTeher() < t[j].getMaxSzallithatoTeher()) {
                    Teherauto tmp = t[i];
                    t[i] = t[j];
                    t[j] = tmp;
                }
            }
        }
        return t;
    }

    private static Auto[] maxMotor(Auto[] a) {
        
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                Auto au = (Auto) a[i];
                if (a[i].getMotorTeljesitmeny() < a[j].getMotorTeljesitmeny()) {
                    Auto tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        return a;
//        Tisztelt Tanár Úr! 
//        Nem tudom hogyan kell csak a maximum elemet kiírni. Ha minden igaz a rendezés megvan de a kiiratással baj van.
//        Tisztelettel:
//        Nagy Róbert
    }

    public static void main(String[] args) {
        Auto[] a = new Auto[]{
            new Auto("ABC-123", 100),
            new Auto("BCD-234", 90),
            new Auto("ACD-423", 150),
            new Auto("CDA-324", 80),
            new Auto("DBC-412", 50),
            new Teherauto("EFG-567", 120, 1000),
            new Teherauto("EGF-786", 180, 1500),
            new Teherauto("GHR-987", 130, 900),
            new Teherauto("KLB-200", 200, 2000),
            new Teherauto("JKL-456", 140, 1200)
        };
        Teherauto [] t = new Teherauto[]{
            new Teherauto("KLM-345", 130, 1200),
            new Teherauto("ZUI-567", 211, 3000),
            new Teherauto("GHJ-543", 100, 4210),
            new Teherauto("TRE-243", 196, 4321),
            new Teherauto("DSA-124", 187, 3211),
            new Teherauto("DSF-349", 157, 2131),
            new Teherauto("GFD-156", 195, 3101),
            new Teherauto("POI-354", 199, 1200),
            new Teherauto("ASD-841", 210, 919),
            new Teherauto("QWE-964", 121, 891)
        };
        
        Teherauto[] th;
        th = maxSzallitahato(t);
        System.out.println(Arrays.toString(th));
        
        Auto[] au;
        au = maxMotor(a);
        System.out.println(Arrays.toString(a));
    }
}
