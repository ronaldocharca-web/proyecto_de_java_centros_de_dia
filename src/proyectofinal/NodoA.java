package proyectofinal;
public class NodoA {
    public Atencion a;
    public NodoA sig;
    public NodoFeriado aba;

    public NodoA() {
    sig=null;
    }

    public Atencion getA() {
        return a;
    }

    public void setA(Atencion a) {
        this.a = a;
    }

    public NodoA getSig() {
        return sig;
    }

    public void setSig(NodoA sig) {
        this.sig = sig;
    }

    public NodoFeriado getAba() {
        return aba;
    }

    public void setAba(NodoFeriado aba) {
        this.aba = aba;
    }

   

}
