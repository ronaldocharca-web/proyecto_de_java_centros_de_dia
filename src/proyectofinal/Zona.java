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
public class Zona {
    private String nombreZ;
    private LSimpleM m;

    public Zona(String a,LSimpleM c) {
    nombreZ=a;
    m=c;
    }
    public void mostrar()
    {
        System.out.println(nombreZ);
        m.mostrar();
    }

    public String getNombreZ() {
        return nombreZ;
    }

    public void setNombreZ(String nombreZ) {
        this.nombreZ = nombreZ;
    }

    public LSimpleM getM() {
        return m;
    }

    public void setM(LSimpleM m) {
        this.m = m;
    }
    
}
