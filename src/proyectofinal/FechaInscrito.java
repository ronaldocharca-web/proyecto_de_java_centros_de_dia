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
public class FechaInscrito {
    private String hora,fecha,nombreCentro;
    private PilaDN dn;

    public FechaInscrito(String a,String b,String c,PilaDN e) {
    hora=a;
    fecha=b;
    nombreCentro=c;
    dn=e;
    }
    public void mostrar()
    {
        System.out.println("");
        System.out.println(hora+" "+fecha+" "+nombreCentro );
        System.out.println("");
        System.out.println("\t Inscritos son:");
        dn.mostrar();
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCentro() {
        return nombreCentro;
    }

    public void setCentro(String centro) {
        this.nombreCentro = centro;
    }

    public PilaDN getDn() {
        return dn;
    }

    public void setDn(PilaDN dn) {
        this.dn = dn;
    }
    
    
}
