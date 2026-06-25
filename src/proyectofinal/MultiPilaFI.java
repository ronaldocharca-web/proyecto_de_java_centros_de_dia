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
public class MultiPilaFI {
       private int n;
    private PilaFI v[]= new PilaFI[100];

    public MultiPilaFI()
    {
        for(int i=1;i<=99;i++)
            v[i]=new PilaFI();
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public boolean esvacia (int i)
    {
	if ( v[i].esvacia ())
	    return true;
	return false;
    }


    public boolean esllena (int i)
    {
	if (v[i].esllena ())
	    return true;
	return false;
    }


    public void adicionar (int i, FechaInscrito elem)
    {
	if (!v[i].esllena())
	    v[i].adicionar (elem);
	else
	    System.out.print ("Cola " + i + " esta llena");
    }


    public FechaInscrito eliminar (int i)
    {
	FechaInscrito e = null;
	if (!v [i].esvacia ())
	    e = v [i].eliminar ();
	else
	    System.out.print ("Cola " + i + " esta vacia");
	return e;
    }

    public void mostrar(int i)
    {
        v[i].mostrar();
    }

    public void mostrar ()
    {
	int i;
	for (i = 1 ; i <= getN() ; i++)
	{
	    v [i].mostrar ();
	}
    }

    public int nroElem (int i)
    {
	return (v [i].nroelem() );
    }
    public void vaciar(int i, PilaFI Z)
    {
        v[i].vaciar(Z);
    }
    public void vaciar(int i, int j)
    {
            
          v[i].vaciar(v[j]); 
    }  

    
    
}
