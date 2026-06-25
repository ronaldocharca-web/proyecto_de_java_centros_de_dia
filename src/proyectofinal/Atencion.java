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
public class Atencion {
    private String nombreCentro;
    private String razon;

    public Atencion(String a,String b) {
    nombreCentro=a;
    razon=b;
    }
    public void mostrar()
    {
        System.out.println("Centro de Dia San "+nombreCentro+"  --Rason de Feriado: "+razon);
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    public void setNombreCentro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

  
    
}
