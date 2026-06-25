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
public class NodoM {
    private Macrodistrito ma;
    public NodoM sig;

    public NodoM() {
    sig=null;
    }

    public Macrodistrito getMa() {
        return ma;
    }

    public void setMa(Macrodistrito ma) {
        this.ma = ma;
    }

    public NodoM getSig() {
        return sig;
    }

    public void setSig(NodoM sig) {
        this.sig = sig;
    }
    
    
}
