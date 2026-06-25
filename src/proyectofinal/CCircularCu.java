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
public class CCircularCu {
     private int max=200;
     private Cuidador v[]=new Cuidador[max+1];
     private int ini,fin;
    public  CCircularCu()
    {
        ini=fin=0;
    }
    public boolean esvacia ()
    {
	if (ini == 0 && fin == 0)
	    return (true);
	return (false);
    }
    public boolean esllena ()
    {
	if (fin == max)
	    return (true);
	return (false);
    }
    public int nroelem ()
    {
	return (fin - ini);
    }
    public void adicionar (Cuidador m)
    {
        
	if (!esllena ())
	{
	    v[fin+1]=m;
	    fin++;
	}
	else
	    System.out.println ("Cola Simple llena");
    }
    public Cuidador eliminar ()
    {
        Cuidador m=null;
	if (!esvacia ())
	{
	    m=v[ini+1];
	   ini++;
           if(ini==fin)
               ini=fin=0;
           
	}
	else
	    System.out.println ("Cola Simple vacia");
	return(m);
    }
    
    public void mostrar ()
    {
        CCircularCu  aux=new CCircularCu();
        while (!esvacia()) {
            
           Cuidador m=eliminar();
            m.mostrar();
            aux.adicionar(m);
            
        }
        vaciar(aux);
    }
    public void vaciar (CCircularCu a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar ());
    }
    
}
