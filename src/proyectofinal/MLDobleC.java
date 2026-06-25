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
public class MLDobleC {
     private NodoC p;

    public MLDobleC() {
    p=null;
    }

    public NodoC getP() {
        return p;
    }

    public void setP(NodoC p) {
        this.p = p;
    }
     public void adicionar(Centro a)
    {
        NodoC nue=new NodoC();      
        nue.setC(a);
        if(null==getP())
        { 
            setP(nue);
            
        }else
        {
            NodoC r=getP();
            while(r.getSig()!=null)
            {
                r=r.getSig();
            }
            r.setSig(nue);

        }
    
    }
    public void mostrar()
    {
        NodoC r=getP();
        while(r!=null)
        {
            r.getC().mostrar();
            
            r=r.getSig();
        }
    }

    
}
