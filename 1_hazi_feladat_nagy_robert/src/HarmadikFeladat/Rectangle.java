/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HarmadikFeladat;

/**
 *
 * @author Nagy Róbert
 */
public class Rectangle {

    public double height;
    public double weight;

    public Rectangle() {
        this.height = 1.0;
        this.weight = 1.0;
    }

    public Rectangle(double h, double w) {
        this.height = h;
        this.weight = w;
    }

    public double getArea() {
        return this.weight * this.height;
    }

    public double getPerimeter() {
        return (this.height + this.weight) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle " + "weight: " + weight + ", height: " + height + " Area: " 
                + this.getArea() + " Perimeter: " + this.getPerimeter();
    }

}
