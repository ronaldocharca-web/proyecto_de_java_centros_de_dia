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
public class NodoFeriado {
     private String fechaferiado;

    public NodoFeriado(String a) {
    fechaferiado=a;
    }
    
    public String getFechaferiado() {
        return fechaferiado;
    }

    public void setFechaferiado(String fechaferiado) {
        this.fechaferiado = fechaferiado;
    }
    
}
