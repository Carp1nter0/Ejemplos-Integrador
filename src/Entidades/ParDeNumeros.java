/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author pc
 */
public class ParDeNumeros {
    private double numer1;
    private double numer2;

    public ParDeNumeros() {
        this.numer1=Math.random()*100;
        this.numer2=Math.random()*100;
    }

    public double getNumer1() {
        return numer1;
    }

    public double getNumer2() {
        return numer2;
    }

    public void setNumer1(double numer1) {
        this.numer1 = numer1;
    }

    public void setNumer2(double numer2) {
        this.numer2 = numer2;
    }
    
    
    
    
}
