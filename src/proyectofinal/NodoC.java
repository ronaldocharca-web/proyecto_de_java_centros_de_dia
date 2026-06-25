/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author LENOVO
 */
public class NodoC {
    private Centro c;
    private NodoC sig,ant;

    public NodoC() {
        sig=ant=null;
    }

    public Centro getC() {
        return c;
    }

    public void setC(Centro c) {
        this.c = c;
    }

    public NodoC getSig() {
        return sig;
    }

    public void setSig(NodoC sig) {
        this.sig = sig;
    }

    public NodoC getAnt() {
        return ant;
    }

    public void setAnt(NodoC ant) {
        this.ant = ant;
    }
    
    
}
