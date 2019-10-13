/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElsoFeladat;


/**
 *
 * @author Nagy Róbert
 */
public class Circle extends GeometricShape {
    
    double radius;
    
    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(double radius){
        return (radius*radius)*Math.PI;
    }
    
    public double getPerimeter(double radius){
        return (2*radius)*Math.PI;
    }
    
    public double getDiameter(double radius){
        return radius+radius;
    }

}
