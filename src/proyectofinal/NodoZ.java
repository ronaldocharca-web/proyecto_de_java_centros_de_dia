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
public class NodoZ {
    private Zona z;
    private NodoZ sig,ant;

    public NodoZ() {
        sig=ant=null;
    }

    public Zona getZ() {
        return z;
    }

    public void setZ(Zona z) {
        this.z = z;
    }

    public NodoZ getSig() {
        return sig;
    }

    public void setSig(NodoZ sig) {
        this.sig = sig;
    }

    public NodoZ getAnt() {
        return ant;
    }

    public void setAnt(NodoZ ant) {
        this.ant = ant;
    }
    
    
    
}
