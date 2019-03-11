/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4btema2;

/**
 *
 * @author Edoardo
 */
public class IteracionPuntoFijo {
    
    private int i;
    private double xi;
    private double fxi;
    private double error;
    
    public int getI() {
        return i;
    }
    
    public void setI(int i) {
        this.i = i;
    }

    public double getXi() {
        return xi;
    }

    public void setXi(double xi) {
        this.xi = xi;
    }
    
    public double getError() {
        return error;
    }

    public void setError(double error) {
        this.error = error;
    }
    
    public double getFxi() {
        return fxi;
    }

    public void setFxi(double fxi) {
        this.fxi = fxi;
    }
    
    @Override
    public String toString() {
        return "IteracionPuntoFijo{" + "i=" + i + ", xi=" + xi + ", error=" + error + '}';
    }
    
    
}
