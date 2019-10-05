/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OtodikFeladat;

/**
 *
 * @author Nagy Róbert
 */
public class QuadraticEquation {

    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1() {
        if (getDiscriminant() == 0) {
            return 0;
        } else {
            return (-this.b + Math.abs(getDiscriminant())) / this.a * 2;
        }
    }

    public double getRoot2() {
        if (getDiscriminant() == 0) {
            return 0;
        } else {
            return (-this.b - Math.abs(getDiscriminant())) / this.a * 2;
        }
    }

    @Override
    public String toString() {
        if(getDiscriminant()>0)
        {
            return "Gyok 1: " + getRoot1() + " Gyok 2: " +getRoot2();
        }
        else if (getDiscriminant() == 0 && getRoot1() == getRoot2()){
            return "Kozos gyok: " + getRoot1();
        }
        else
            return "The equation has no root!";
    }
}
