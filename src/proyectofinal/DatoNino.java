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
public class DatoNino {
    private String nomPat,nomMat,nomNino,apePat,apeMat;
    private int ci,edad;
    public DatoNino(String a,String b,String c,String d,String e ,int f,int g)
    {
        nomPat=a;
        nomMat=b;
        nomNino=c;
        apePat=d;
        apeMat=e;
        ci=f;
        edad=g;
    }
    public void mostrar()
    {
        System.out.println("\t\t"+nomPat+" "+nomMat+" "+nomNino+" "+apePat+" "+apeMat+" "+ci+" "+edad);
    }

    public String getNomPat() {
        return nomPat;
    }

    public void setNomPat(String nomPat) {
        this.nomPat = nomPat;
    }

    public String getNomMat() {
        return nomMat;
    }

    public void setNomMat(String nomMat) {
        this.nomMat = nomMat;
    }

    public String getNomNino() {
        return nomNino;
    }

    public void setNomNino(String nomNino) {
        this.nomNino = nomNino;
    }

    public String getApePat() {
        return apePat;
    }

    public void setApePat(String apePat) {
        this.apePat = apePat;
    }

    public String getApeMat() {
        return apeMat;
    }

    public void setApeMat(String apeMat) {
        this.apeMat = apeMat;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
