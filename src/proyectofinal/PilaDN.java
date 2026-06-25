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
public class PilaDN {
    private int max=200;
    private DatoNino v[]=new DatoNino[max+1];
    private int tope;
    
     public PilaDN() //crea pila vacia
    {
        tope=0;
    }
    public boolean esvacia ()
    {
	if (tope == 0)
	    return (true);
	return (false);
    }
    public boolean esllena ()
    {
	if (tope == max)
	    return (true);
	return (false);
    }
    public int nrelem ()
    {
	return (tope);
    }
    public void adicionar (DatoNino elem)
    {
	if (!esllena ())
	{
	    tope++;          //v[tope+1]=elem
	    v [tope] = elem; //tope=tope+1
	}
	else
	    System.out.println ("Pila llena");
    }
        DatoNino eliminar ()
       {
         DatoNino elem = null;
	if (!esvacia ())
	{
	    elem = v [tope];
	    tope--;
	}
	else
	    System.out.println ("Pila vacia");
	return (elem);
    }
    public void mostrar ()
    {
        DatoNino elem;
	if (esvacia ())
	    System.out.println ("Pila vacia");
	else
	{
            
	    PilaDN aux = new PilaDN ();
	    while (!esvacia ())
	    {
                elem=eliminar();
		aux.adicionar (elem);
                elem.mostrar();
	    }
             while (!aux.esvacia ())
	    {
                elem=aux.eliminar();
		adicionar (elem);
	    }
	}
    }
    public void vaciar (PilaDN a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar ());

    }
    
}
