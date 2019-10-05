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
public class Pont {
    private double x;
    private double y;

    public Pont(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Pont()
    {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    

    @Override
    public String toString() {
        return "Pont{" + "x=" + x + ", y=" + y + '}';
    }
}
