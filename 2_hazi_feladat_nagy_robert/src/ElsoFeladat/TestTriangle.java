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
public class TestTriangle {

    public static void main(String[] args) {

        Triangle t = new Triangle(1, 1.5, 1);

        t.setColor("yellow");
        t.setFilled(true);
        System.out.println("The triangle: area: " + t.getArea(t.side1, t.side2, t.side3)+"\n"
                + "perimeter: "+ t.getPerimeter(t.side1, t.side2, t.side3) + "\n"
                + "colour: "+t.getColor() + " filled: "+t.isFilled());
    }

}
