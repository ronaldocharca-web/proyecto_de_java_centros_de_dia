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
public class Cuidador {
    private String nombre,apellido,nombreCentro;
    private int edad,ci;
    private CCircularCr cr;

    public Cuidador(String a,String b,int  c,int d,String  e,CCircularCr f) {
        nombre=a;
        apellido=b;
        edad=c;
        ci=d;
        nombreCentro=e;
        cr=f;
    }
    public void mostrar()
    {
        System.out.println(nombre+" "+apellido+" "+edad+" "+ci+" "+nombreCentro);
        cr.mostrar();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCentro() {
        return nombreCentro;
    }

    public void setCentro(String centro) {
        this.nombreCentro = centro;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public CCircularCr getCr() {
        return cr;
    }

    public void setCr(CCircularCr cr) {
        this.cr = cr;
    }
    
    
    
}
