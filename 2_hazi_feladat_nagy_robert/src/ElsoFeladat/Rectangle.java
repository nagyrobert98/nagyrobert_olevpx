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
public class Rectangle extends GeometricShape{
    
    double height;
    double width;

    public Rectangle(double height, double width, String color, boolean filled) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getArea(double width, double height){
        return width*height;
    }
    
    public double getPerimeter(double width, double height){
        return 2*width+2*height;
    }   
}
