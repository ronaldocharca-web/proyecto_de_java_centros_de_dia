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
public class Centro {
    private String nombreCentro;
    private LDCircularZ z;

    public Centro(String a,LDCircularZ b) {
    nombreCentro=a;
    z=b;
    }
    public void mostrar()
    {
        System.out.println("\t\t"+nombreCentro);
        z.mostrar();
        
    }

    public String getNombre() {
        return nombreCentro;
    }

    public void setNombre(String nombre) {
        this.nombreCentro = nombre;
    }

    public LDCircularZ getZ() {
        return z;
    }

    public void setZ(LDCircularZ z) {
        this.z = z;
    }
    
    
    
}
