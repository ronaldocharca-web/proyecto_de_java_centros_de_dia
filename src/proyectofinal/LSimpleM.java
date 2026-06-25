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
public class LSimpleM {
    private NodoM p;

    public LSimpleM() {
    p=null;
    }

    public NodoM getP() {
        return p;
    }

    public void setP(NodoM p) {
        this.p = p;
    }
    public void adicionar(Macrodistrito a)
    {
        NodoM aux=new NodoM();
        aux.setMa(a);
        setP(aux);
        
    }
    public void mostrar()
    {
        NodoM r=getP();
        while(r!=null)
        {
            r.getMa().mostrar();
            r=r.getSig();
        }
    }
}
