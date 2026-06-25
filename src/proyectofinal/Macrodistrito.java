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
public class Macrodistrito {
    private String nombre;
    private String distrito;

    public Macrodistrito(String a,String b) {
    nombre=a;
    distrito=b;
    }
    public void mostrar()
    {
        System.out.println(nombre+" "+distrito);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDistritos() {
        return distrito;
    }

    public void setDistritos(String distritos) {
        this.distrito = distritos;
    }
    
    
}
