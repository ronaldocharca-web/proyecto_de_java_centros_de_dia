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
public class LMultipleSimpleA {
    private NodoA p;

    public LMultipleSimpleA() {
    p=null;
    }

    public NodoA getP() {
        return p;
    }

    public void setP(NodoA p) {
        this.p = p;
    }
     public void adicionar(String  a,Atencion x)
    {
      
       NodoFeriado nue1=new NodoFeriado(a);
            nue1.setFechaferiado(a);
       NodoA nue3=new NodoA();
           
            nue3.setA(x);
            nue3.setAba(nue1);
       
     
       if(getP()==null)
       {
           setP(nue3);
       }
       else{
           NodoA r=getP();
           while(r.getSig()!=null)
           {
               r=r.getSig();
           }
           r.setSig(nue3);
       }
       
    }
    public void mostrar()
    {
        NodoA r=getP();
        while(r!=null)     
        {   
            NodoFeriado m1=r.getAba() ;
            if(m1!=null)
            {
                System.out.print(m1.getFechaferiado()+" ");
            }
            r.getA().mostrar();         
            r=r.getSig();
        }
    }
    
    
    
    
    
}
