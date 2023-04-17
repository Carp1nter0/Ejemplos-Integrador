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
public class Cadena {
    private String frase;
    private int longitudFrase;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longitudFrase= frase.length();
        
        
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitudFrase() {
        
        return longitudFrase;
    }

    public void setFrase(String frase) {
        this.longitudFrase= frase.length();
        this.frase = frase;
    }

    public void setLongitudFrase(int longitudFrase) {
        this.longitudFrase = longitudFrase;
    }
    
    
    
    
}
