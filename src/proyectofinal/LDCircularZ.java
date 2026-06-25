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
public class LDCircularZ {
    private NodoZ p;

    public LDCircularZ() {
    p=null;
    }

    public NodoZ getP() {
        return p;
    }

    public void setP(NodoZ p) {
        this.p = p;
    }
    public void adicionar(Zona z)
    {
        NodoZ aux=new NodoZ();
        aux.setZ(z);
        if(getP()==null)
        {
            setP(aux);
            aux.setSig(aux);
            aux.setAnt(aux);
        }
        else
        {
            NodoZ w=getP().getAnt();
            w.setSig(aux);
            aux.setAnt(w);
            aux.setSig(getP());
            getP().setAnt(aux);
          
        }
    }
    public void mostrar()
    {
        NodoZ z=getP();
        if(z==null)
        {
            System.out.println("No se encontro ninguna zona");
        }
        else
        {   
        while(z.getSig()!=getP())
        {
             z.getZ().mostrar();
            z=z.getSig();
        }
        z.getZ().mostrar();
        }
        
    }
    
}
