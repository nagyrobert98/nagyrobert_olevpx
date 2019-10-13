/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OtodikFeladat;

import java.util.Random;

/**
 *
 * @author Nagy Róbert
 */
public class Kiegeszites {

    public static void main(String[] args) {
        Random rnd = new Random();
        int[] t = new int[30];
        for (int i = 0; i < t.length; i++) {
            t[i] = rnd.nextInt(10);
        }
        printArray(t);
        long timeStart = System.currentTimeMillis();
        insertionSort(t);
        long timeEnd = System.currentTimeMillis();
        printArray(t);
        System.out.println(timeEnd - timeStart);
        System.out.println(isConsecutiveFour(t));
    }

    static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int kulcs = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > kulcs) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = kulcs;
        }

    }

    public static boolean isConsecutiveFour(int[] a) {
        int i = 0;
        while (i < a.length-3) {
            if (a[i] == a[i + 1] && a[i + 1] == a[i + 2] && a[i + 2] == a[1 + 3] && a[i + 3] == a[i + 4]);
            {
                return true;
                
            }
        }
        return false;
    }
}
