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
public class Metodusok {

    public static void main(String[] args) {
        System.out.println("Novekvo sorrend:");
        Novekvo(9,7,2);

        System.out.println("");
        System.out.println("Minimum, abszolut maximum:");
        MinAbsMax(1.6,-5.4,3);

        System.out.println("");
        System.out.println("A, B, C, D sorrend:");
        Sorrend(1.5, 2.6, -3.4, -3.8);

        System.out.println("");
        System.out.println("Haromszog-e:");
        Haromszoge(1.5, 2.4, 6.8);

        System.out.println("");
        System.out.println("Szokoev szamolas:");
        Szokoev(1955, 1968);

        System.out.println("");
        System.out.println("Eredmeny:");
        Eredmeny(3);

        System.out.println("");
        System.out.println("Hanyados:");
        Osztas(90, 24);

        System.out.println("");
        System.out.println("Prim-e:");
        Prim(113);

        System.out.println("");
        System.out.println("Fibonacci sorozat:");
        Fibonacci(10);

        System.out.println("");
        System.out.println("Forditott szam:");
        ForditottSzam(123);

        System.out.println("");
        System.out.println("Faktorialis:");
        Faktorialis(5);

        System.out.println("");
        System.out.println("Oszthato:");
        OszthatoSzam(20, 50, 4);

        System.out.println("");
        System.out.println("Fibonacci kisebb szam:");
        FibonacciKisebb(10);

        System.out.println("");
        System.out.println("Szamjegy kob osszeg:");
        SzamjegyKob();
    }

    public static int Novekvo(int a, int b, int c) {

        int[] tomb;
        tomb = new int[3];
        
        tomb[0] = a;
        tomb[1] = b;
        tomb[2] = c;

        for (int i = 0; i < tomb.length - 1; i++) {
            for (int j = i + 1; j < tomb.length; j++) {
                if (tomb[i] > tomb[j]) {
                    int tmp = tomb[i];
                    tomb[i] = tomb[j];
                    tomb[j] = tmp;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(tomb[i] + " ");
        }
        System.out.println("");
        return a;
    }

    public static void MinAbsMax(double a, double b, double c) {

        double[] tomb;
        tomb = new double[3];
        tomb[0] = a;
        tomb[1] = b;
        tomb[2] = c;

        for (int i = 0; i < tomb.length - 1; i++) {
            for (int j = i + 1; j < tomb.length; j++) {
                if (tomb[i] > tomb[j]) {
                    double tmp = tomb[i];
                    tomb[i] = tomb[j];
                    tomb[j] = tmp;
                }
            }
        }
        double min = tomb[0];

        double[] tombabs;

        tombabs = new double[3];
        for (int i = 0; i < tombabs.length; i++) {
            tombabs[i] = Math.abs(tomb[i]);

        }
        for (int i = 0; i < tombabs.length - 1; i++) {
            for (int j = i + 1; j < tombabs.length; j++) {
                if (tombabs[i] < tombabs[j]) {
                    double tmp = tombabs[i];
                    tombabs[i] = tombabs[j];
                    tombabs[j] = tmp;
                }
            }
        }
        double max = tombabs[0];

        System.out.println("Min: " + min + " Abszolut ertekek maximuma: " + max);
    }

    public static double Sorrend(double a, double b, double c, double d) {

        System.out.println(a + " " + b + " " + c + " " + d);
        if (d >= 0) {
            System.out.println(a + " " + c + " " + b + " " + d);
            return a;
        } else {
            System.out.println(a + " " + c + " " + d + " " + b);
            return a;
        }
    }

    public static boolean Haromszoge(double a, double b, double c) {

        if (a - b < c && b - c < a && c - a < b) {
            System.out.println("igen");
            return true;
        } else {
            System.out.println("nem");
            return false;
        }
    }

    public static int Szokoev(int a, int b) {

        int count = 0;

        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        for (int i = a; i <= b; i++) {
            if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0)) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static void Eredmeny(int a) {

        final int ELEGTELEN = 1;
        final int ELEGSEGES = 2;
        final int KOZEPES = 3;
        final int JO = 4;
        final int JELES = 5;

        switch (a) {
            case 1:
                System.out.println("ELEGTELEN");
                break;
            case 2:
                System.out.println("ELEGSEGES");
                break;
            case 3:
                System.out.println("KOZEPES");
                break;
            case 4:
                System.out.println("JO");
                break;
            case 5:
                System.out.println("JELES");
                break;
        }
    }

    public static int Osztas(int a, int b) {
        int hanyados = 0;
        while (a >= b) {
            hanyados = hanyados + 1;
            a = a - b;
        }
        System.out.println(hanyados);
        return hanyados;
    }

    public static boolean Prim(int n) {
        int countoszto = 0;
        for (int oszto = 1; oszto <= n; oszto++) {
            if (n % oszto == 0) {
                countoszto++;
            }
        }
        if (countoszto == 2) {
            System.out.println("igaz");
            return true;
        } else {
            System.out.println("hamis");
            return false;
        }
    }

    public static int Fibonacci(int n) {
        int a = 1;
        int b = 0;

        for (int k = 1; k <= n; k++) {
            System.out.println(b);
            b = a + b;
            a = b - a;
        }
        return b;
    }

    public static int ForditottSzam(int n) {
        int ujszam = 0;
        while (n != 0) {
            ujszam = ujszam * 10 + (n % 10);
            n = n / 10;
        }
        System.out.println(ujszam);
        return ujszam;
    }

    public static float Faktorialis(int n) {
        int fakt = 1;

        for (int i = 1; i <= n; i++) {
            fakt *= i;
        }
        System.out.println(fakt);
        return fakt;
    }

    public static int OszthatoSzam(int n1, int n2, int k) {
        if (n1 > n2) {
            int tmp = n1;
            n1 = n2;
            n2 = tmp;
        }
        for (int i = n1; i < n2; i++) {
            if (i % k == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        return k;
    }

    public static int FibonacciKisebb(int n) {
        int a = 1;
        int b = 0;

        for (int k = 1; k <= n; k++) {
            if (b >= n) {
                System.out.println(b);
                break;
            }
            b = a + b;
            a = b - a;

        }
        return b;
    }
    //14. feladat első megoldas
    public static void SzamjegyKob() {
        int ujszam = 0;
        int n, m;
        int kob;
        int kobossz = 0;

        
        for (int szam = 1; szam < 1000; szam++) {
            m = szam;
            while (m != 0) {
                n = m % 10;
                kob = n * n * n;
                kobossz += kob;
                m = m/10;
            }
            if(kobossz == szam){
                System.out.println(szam);
            }
            kobossz = 0;
        }
    }
    //14. feladat masodik megoldas
    public static void SzamjegyKob2() {
        int a, b, c;
        int szam;
        int kob;

        for (a = 0; a <= 9; a++) {
            for (b = 0; b <= 9; b++) {
                for (c = 0; c <= 9; c++) {
                    szam = 100 * a + 10 * b + c;
                    kob = (a * a * a) + (b * b * b) + (c * c * c);
                    if(szam == kob){
                        System.out.println(szam);
                    }
                }
            }
        }
    }
}
