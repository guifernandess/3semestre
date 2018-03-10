/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADOI;

/**
 *
 * @author guilherme.rocha
 */
public class No {
    private carros c;
    private No prox;
    
    public No(carros car){
        this.c = car;
        this.prox = null;
    }

    public carros getC() {
        return c;
    }

    public void setC(carros c) {
        this.c = c;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
    
}
