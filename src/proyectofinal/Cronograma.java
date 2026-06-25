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
public class Cronograma {
    private String horae,horas,dia,actividad;

    public Cronograma(String a,String b,String c,String d) {
    
        horae=a;
        horas=b;
        dia=c;
        actividad=d;
        
    }
    public void mostrar()
    {
        System.out.println("\t\t"+horae+horas+" "+dia+" "+actividad);
    }

    public String getHorae() {
        return horae;
    }

    public void setHorae(String horae) {
        this.horae = horae;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    

   
    
}
