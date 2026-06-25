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
public class CCircularCr {
      private int max=100;
    private Cronograma v[]=new Cronograma[max+1];
    private int ini,fin;
    
    public CCircularCr()
    {
        ini=fin=0;
    }
    public int nroelem ()
    {
        return ((max + fin - ini) % max);
    }
    public boolean esvacia ()
    {
        if (nroelem () == 0)
            return (true);
        return (false);
    }
    public boolean esllena ()
    {
        if (nroelem () == max)
            return (true);
        return (false);
    }


    public void adicionar (Cronograma elem)
    {
        if (!esllena ())
        {

            fin = (fin + 1) % max;
            v [fin] = elem;
        }
        else
            System.out.println ("Cola circular llena");
    }


    public Cronograma eliminar ()
    {
        Cronograma elem = null;
        if (!esvacia ())
        {
            ini = (ini + 1) % max;
            elem = v [ini];
            if (nroelem () == 0)
                ini = fin = 0;
        }
        else
            System.out.println ("Cola circular vacia");
        return (elem);
    }
    public void mostrar ()
    {
        Cronograma elem;
        if (esvacia ())
            System.out.println ("Cola vacia xxx");
        else
        {
            
            CCircularCr aux = new CCircularCr ();
            while (!esvacia ())
            {
               elem = eliminar ();
               aux.adicionar (elem);
               elem.mostrar();
            }
            vaciar(aux);
        }
    }
    
    public void vaciar (CCircularCr a)
    {
        while (!a.esvacia ())
            adicionar (a.eliminar ());
    }
    
}
