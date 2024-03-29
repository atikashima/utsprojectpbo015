/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsnomer1;

/**
 *
 * @author ACER
 */
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    // Constructor 
    QuadraticEquation(double a, double b, double c) {
    	this.a = a;
	this.b = b;
	this.c = c;
    }

    // Accessor Methods
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
	return Math.pow(b, 2) - 4 * a * c;
    }
    
    public double getRoot1() {
	return getDiscriminant() < 0 ? 0 :
            ((-b) + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }
    
    public double getRoot2() {
	return getDiscriminant() < 0 ? 0 :
            ((-b) - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }
}
