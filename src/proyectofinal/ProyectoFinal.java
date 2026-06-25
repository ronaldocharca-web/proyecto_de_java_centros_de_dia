
package proyectofinal;
public class ProyectoFinal {


    public static void main(String[] args) {
        
        System.out.println("\t\t INGRESO DE LOS NIÑOS EN LAS CENTROS DE DIA" );
        System.out.println("\t-----------------------------------------------------------");
        PilaDN A1=new PilaDN();
        A1.adicionar(new DatoNino("Exalto", "Marcela", "Cesar", "Condori", "Mamani", 111, 9));
        A1.adicionar( new DatoNino("Juan", "María", "Carlos", "García", "Pérez",222,10));
        A1.adicionar( new DatoNino("Pedro", "Ana", "Sofía", "Rodríguez", "López",333,10));
        A1.adicionar( new DatoNino("Diego", "Elena", "Javier", "Martínez", "Sánchez",444,11));
        A1.adicionar( new DatoNino("Alejandro", "Laura", "Luis", "Gómez", "Fernández",555,11));
        A1.adicionar( new DatoNino("Santiago", "Andrea", "Gabriel", "Hernández", "Díaz",112,9));
        A1.adicionar( new DatoNino("Daniel", "Carolina", "David", "Moreno", "Jiménez",113,7));
        A1.adicionar( new DatoNino("Miguel", "Beatriz", "Samuel", "Vargas", "Dominguez",114,8));
        A1.adicionar( new DatoNino("Javier", "Carla", "Luz", "Rojas", "Herrera",115,9));
        A1.adicionar( new DatoNino("Gonzalo", "Fernanda", "Matías", "Fuentes", "Navarro",116,11));
        A1.adicionar( new DatoNino("Martín", "Natalia", "Benjamín", "Cabrera", "Guerrero",117,12));
        PilaDN A2=new PilaDN();
        A2.adicionar( new DatoNino("Francisco", "Valentina", "Niki", "Giménez", "Torres",118,9));
        A2.adicionar( new DatoNino("Ricardo", "Julia", "Alexander", "Santos", "Flores",221,9));
        A2.adicionar(new DatoNino("Roberto", "Camila", "Sebastián", "Mendoza", "Castillo",223,10));
        A2.adicionar( new DatoNino("Emilio", "Patricia", "Marcelina", "Luna", "Rivas",673,8));
        A2.adicionar( new DatoNino("Hugo", "Isabel", "Juan Pablo", "Silva", "Orozco",142,8));
        A2.adicionar( new DatoNino("Álvaro", "Antonella", "Lucinita", "Herrera", "Araya",973,9));
        A2.adicionar( new DatoNino("Sebastián", "Daniela", "Iker", "Castro", "Valenzuela",997,10));
        A2.adicionar(new DatoNino("Fernando", "Paula", "Renato", "Díaz", "Salazar",995,11));
        PilaDN A3=new PilaDN();
        A3.adicionar( new DatoNino("Agustín", "Constanza", "Emiliano", "Álvarez", "Vargas",993,9));
        A3.adicionar( new DatoNino("Simón", "Laura", "José Ignacio", "Gutiérrez", "Cortés",991,11));
        A3.adicionar( new DatoNino("Eduardo", "Micaela", "Leandro", "Pérez", "Torres",342,10));
        A3.adicionar( new DatoNino("Iván", "Florencia", "Mariano", "Romero", "Ríos",448,8));
        A3.adicionar( new DatoNino("Juan Pablo", "Valeria", "Maximiliano", "Ruiz", "Hernández",674,11));
        A3.adicionar( new DatoNino("Ignacio", "Agustina", "Tobías", "Alvarez", "Sosa",421,11));
        A3.adicionar( new DatoNino("Matías", "Marina", "Tomás", "Vega", "García",432,9));
        A3.adicionar( new DatoNino("Joaquín", "Catalina", "Ignacia", "Méndez", "Muñoz",521,11));
        PilaDN A4=new PilaDN();
        A4.adicionar( new DatoNino("Felipe", "Josefina", "Lucas", "Moreno", "Molina",551,10));
        A4.adicionar( new DatoNino("Diego", "Romina", "Juan Ignacio", "González", "Álvarez",998,11));
        A4.adicionar( new DatoNino("Pedro Pablo", "Bárbara", "Felipe", "Rivas", "Campos",881,9));
        A4.adicionar( new DatoNino("Nicolás", "Cecilia", "Ángel", "Soto", "Castro",773,11));
        A4.adicionar( new DatoNino("Tomás", "Antonia", "Santiago", "Martínez", "Pérez",771,11));
        A4.adicionar( new DatoNino("Gabriel", "Rocio", "Matías", "Fernández", "Gómez",449,11));
        A4.adicionar(new DatoNino("Rafael", "Camila", "Emmanuel", "Diaz", "Herrera",221,10));
        A4.adicionar(new DatoNino("Lucas", "Virginia", "Pedro", "Gutiérrez", "Muñoz",446,11));
        A4.adicionar(new DatoNino("Carlos", "Romina", "Daniel", "López", "Paz",442,9));
        A4.adicionar(new DatoNino("Andrés", "Abril", "David", "Ramírez", "Carrasco",441,11));
       
        MultiPilaFI B=new MultiPilaFI();
        B.setN(4);
        B.adicionar(1, new FechaInscrito("8:00 hasta 12:00", "11/01/2024", "Centro de Dia San Antonio", A1));
        B.adicionar(2, new FechaInscrito("12:00 hasta 18:00", "15/02/2024", "Centro de Dia San Juan", A2));
        B.adicionar(3, new FechaInscrito("10:00 hasta 12:00", "22/03/2024", "Centro de Dia San Pedro", A3));
        B.adicionar(4, new FechaInscrito("14:00 hasta 17:00", "28/07/2024", "Centro de Dia San Andres", A4));
        
        //B.mostrar();
        //System.out.println("   ");
       //System.out.println("-----------------------------------------------------------------------------------------------");
        //System.out.println("  ");
        CCircularCr C1=new CCircularCr();
        C1.adicionar(new Cronograma("8:00","10:00", "Lunes-Viernes", "Lectura"));
        CCircularCr C2=new CCircularCr();
        C2.adicionar(new Cronograma("10:00","12:00", "Lunes-Viernes", "Lenguaje"));
        CCircularCr C3=new CCircularCr();
        C3.adicionar(new Cronograma("12:00","14:00", "Lunes-Viernes", "Almuerzo"));
        CCircularCr C4=new CCircularCr();
        C4.adicionar(new Cronograma("14:00","16:00", "Lunes-Viernes", "Matematica"));
        CCircularCr C5=new CCircularCr();
        C5.adicionar(new Cronograma("16:00","18:00", "Lunes-Viernes", "Recreacion"));
    
        CCircularCu D1=new CCircularCu();
        D1.adicionar(new Cuidador("Juan", "Perrez", 22, 10001, "Centro de Dia San Atonio", C1));
        D1.adicionar(new Cuidador("Luis"," Rodriguez Ramirez",  26,12123998,"Centro de Dia San Antonio",C2));
        D1.adicionar(new Cuidador("Carlos"," Gomez Garcia",  25,12523998, "Centro de Dia San Antonio",C3));
        D1.adicionar(new Cuidador("Pedro ","Sanchez Valle",   25,12981236,"Centro de Dia San Antonio",C4));
        D1.adicionar(new Cuidador("Manue"," Cruz Ramirez",  29,22090909,"Centro de Dia San Antonio",C5));
        
        D1.adicionar(new Cuidador("Javier"," Ramirez Valle", 24, 60121911, "Centro de Dia San Juan",C1));
        D1.adicionar(new Cuidador("Roberto"," Garcia Sanchez", 23, 76729858, "Centro de Dia San Juan",C2));
        D1.adicionar(new Cuidador("Carlos ","Gomez Perez", 22, 60119010, "Centro de Dia San Juan",C3));
        D1.adicionar(new Cuidador("Manuel"," Valle Huaman", 32, 60090300, "Centro de Dia San Juan",C4));
        
        D1.adicionar(new Cuidador("Luna ","Rodriguez Ramirez", 22, 60101911, "Centro de Dia San Pedro",C1));
        D1.adicionar(new Cuidador("Carlos ","Gomez Garcia", 33, 76729858, "Centro de Dia San Pedro",C2));
        D1.adicionar(new Cuidador("Pedro ","Sanchez Valle", 23, 60119010, "Centro de Dia San Pedro",C3));
        D1.adicionar(new Cuidador("Manuel ","Cruz Ramirez", 20, 77771021, "Centro de Dia San Pedro",C4));
        
        D1.adicionar(new Cuidador("Roberto ","Ramirez Valle", 41, 60101911, "Centro de Dia San Andres",C1));
        D1.adicionar(new Cuidador("Lucas ","Garcia Sanchez", 45, 76729858, "Centro de Dia San Andres",C3));
        D1.adicionar(new Cuidador("Carlos"," Gomez Perez", 29, 60119010, "Centro de Dia San Andres",C2));
        D1.adicionar(new Cuidador("Manuel"," Velas Huaman", 31, 60090300, "Centro de Dia San Andres",C5));
        //D1.mostrar();
        //System.out.println("   ");
       // System.out.println("-----------------------------------------------------------------------------------------------");
      //  System.out.println("  ");
     
        LSimpleM E1=new LSimpleM();
        E1.adicionar(new Macrodistrito("San Antonio", "14-15-16-17"));
        LSimpleM E2=new LSimpleM();
        E2.adicionar(new Macrodistrito("Max Paredes", "7-8-9-10"));
        LSimpleM E3=new LSimpleM();
        E3.adicionar(new Macrodistrito("Centro", "1-2"));
        LSimpleM E4=new LSimpleM();
        E4.adicionar(new Macrodistrito("Mallasa", "20"));

        LDCircularZ F1=new LDCircularZ();
        F1.adicionar(new Zona("Zona San antonio", E1));
        LDCircularZ F2=new LDCircularZ();
        F2.adicionar(new Zona("Zona Max Paredes", E2));
        LDCircularZ F3=new LDCircularZ();
        F3.adicionar(new Zona("Zona Central", E3));
        LDCircularZ F4=new LDCircularZ();
        F4.adicionar(new Zona("Zona Mallasila", E4));
        
        System.out.println("\t\t"+"CENTROS DE DIA DE ATENCIONA A NIÑOS Y NIÑAS");
        
        MLDobleC G=new MLDobleC();
       G.adicionar(new Centro("Centro de Dia San Atonio", F1)); 
       G.adicionar(new Centro("Centro de Dia San Juan", F2));
       G.adicionar(new Centro("Centro de Dia San Pedro", F3));
       G.adicionar(new Centro("Centro de Dia San Andres", F4));
    //    G.mostrar();
        
        System.out.println("\t\t DIAS FERIADOS");
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println(" ");
        LMultipleSimpleA H=new LMultipleSimpleA();
        H.adicionar("01/01/2025", new Atencion("Pedro", "Año nuevo"));
        H.adicionar("01/01/2025", new Atencion("Andres", "Año nuevo"));
        H.adicionar("01/01/2025", new Atencion("Juan", "Año nuevo"));
        H.adicionar("01/01/2025", new Atencion("Antonio", "Año nuevo"));
        H.adicionar("01/05/2025", new Atencion("Pedro", "Dia del trabajo"));
        H.adicionar("01/05/2025", new Atencion("Andres", "Dia del trabajo"));
        H.adicionar("01/05/2025", new Atencion("Juan", "Dia del trabajo"));
        H.adicionar("01/05/2025", new Atencion("Antonio", "Dia del trabajo"));
       // H.mostrar();
        
        
        
        
        
        
        
        System.out.println("----------------------------PREGUNTAS DE LOS CENTROS DE DIA -----------------------------------");
        // 1. Mostrara al cuidador X  con los niños menores  a Y
        System.out.println("----------------EJERCCIO N.1-----------------------------");
          System.out.println( CuidadoresXY(B,D1,"Luis",11));
         
    
    //2. Determinar y mostrar el centro con el mayor número de niños
   //  System.out.println("Centro con mayor número de niños: " );
   System.out.println("----------------EJERCCIO N.2-----------------------------");
       System.out.println("El centro con mas niños es: "+mayorC(B));
    
    // 3. Mostrar a los Cuidadores que entres a las Y
       // System.out.println("");
        //System.out.println("Los cuidadores son :  ");
        System.out.println("----------------EJERCCIO N.3-----------------------------");
        System.out.println(mostrarCuidadoresCentro(D1,"8:00"));
    
   
     // 4 Buscar Del Centro C y Eliminar el Feriado F
     System.out.println("----------------EJERCCIO N.4-----------------------------");
        System.out.println(mostrarH(H));
        System.out.println( borrarFeriados(H,"Juan","Año nuevo"));
        System.out.println(mostrarH(H));
        System.out.println("----------------EJERCCIO N.5-----------------------------");
    //5. De los centros de dia eliminar a los niños mayores a Y
         System.out.println( mostrarB(B));
        System.out.println(eliminar11(B,11));
       
        System.out.println("aaaaaaaaa "+ mostrarB(B));
        
    
    

    }
    
    public static String CuidadoresXY(MultiPilaFI B, CCircularCu D1, String X, int Y) {
    String res="";
    PilaDN aux2 = new PilaDN();
    PilaFI aux1 = new PilaFI();
    
    for (int i = 1; i <= B.getN(); i++) {
        while (!B.esvacia(i)) {
            FechaInscrito f = B.eliminar(i);
            PilaDN fi = f.getDn();
            
            Cuidador m = buscarCuidador(D1, X);
            if (m != null && m.getCentro().equals(f.getCentro())) {
                res=res+"Nombre del Cuidador: "+m.getNombre()+", "+m.getCentro()+"\n";
                while (!fi.esvacia()) {
                    DatoNino dn = fi.eliminar();
                    if (dn.getEdad() < Y && m.getCentro().equals(f.getCentro()) ) {
                        
                      res=res+" "+dn.getNomNino()+" "+dn.getApePat()+" "+dn.getApeMat()+"\n";
                    }
                    aux2.adicionar(dn);
                }
                fi.vaciar(aux2);
            }
            aux1.adicionar(f);
        }
        B.vaciar(i, aux1);
    }
    
    return res;
}

public static Cuidador buscarCuidador(CCircularCu D1, String X) {
    if (!D1.esvacia()) {
        Cuidador m = D1.eliminar();
        Cuidador result = null;

        if (m.getNombre().equals(X)) 
        {
           result = m;
        } 
        else 
        {
        result = buscarCuidador(D1, X);
        }
        D1.adicionar(m);
        return result;
    }
    return null;
    
}
   public static String mayorC(MultiPilaFI B) 
  {
    int may = 0;
    String as = "";

    for (int i = 1; i <= B.getN(); i++) {
        PilaFI aux1 = new PilaFI();
        while (!B.esvacia(i)) {
            FechaInscrito f = B.eliminar(i);
            PilaDN p = f.getDn(); 
            if (sumaRecursiva(p)> may) {
                may = sumaRecursiva(p);
                as = f.getCentro();
            }
            aux1.adicionar(f);
        }
        B.vaciar(i, aux1);
    }
   return as;
   
}

public static int sumaRecursiva(PilaDN p) {
    if (!p.esvacia()) {
         DatoNino d = p.eliminar();
        int suma = 1 + sumaRecursiva(p);
        p.adicionar(d); // Restablece la pila original
        return suma;
        
    } else {
       return 0;
    }
}

public static String mostrarCuidadoresCentro(CCircularCu a, String x) {
    return recursiCui(a, x, "", a.nroelem());
}

private static String recursiCui(CCircularCu a, String x, String res, int n) {
    if (n!= 0) {
        Cuidador cu = a.eliminar();
        Cronograma md = cu.getCr().eliminar();
    if (md.getHorae().equals(x)) 
    {
        res=res+" "+cu.getNombre()+" "+cu.getApellido()+" "+md.getHorae()+"\n";
    }
    a.adicionar(cu);
    cu.getCr().adicionar(md);
    return recursiCui(a,x,res,n - 1); 
    }
    return res;
}

    

    public static String borrarFeriados(LMultipleSimpleA H, String N, String F) {
    NodoA m = H.getP();  
    NodoA aux = H.getP();    
    int mi=0;
    while (m != null) {
        if ( m.getA().getNombreCentro().equals(N)&& m.getA().getRazon().equals(F) ) {
            
                mi=1;
                
                if (m == H.getP()) { 
                    H.setP(m.getSig());
                } else {
                    while(aux.getSig()!=m)
                    {
                        aux=aux.getSig();
                    }

                    aux.setSig(m.getSig());
                    m.setSig(aux);
                }          
            }    
         m = m.getSig(); 
    }
     if(mi==1)
     {
          return "Se borró"; }
     else
     {
         return "No se boro";} 
}

    public static String mostrarH(LMultipleSimpleA H) {
        String h="";
        NodoA m=H.getP();
        while(m!=null)
        {
            h=h+" "+m.getAba().getFechaferiado()+" Centro de Dia San "+m.getA().getNombreCentro()+" "+m.getA().getRazon()+"\n";
            m=m.getSig();
        }
        return h;
    }

public static String eliminar11(MultiPilaFI B, int Y) {
   
           PilaDN aux = new PilaDN();
           PilaDN aux2 = new PilaDN();
           PilaFI aux3 = new PilaFI();
    
    // Itera sobre todas las pilas en B
    for (int i = 1; i <= B.getN(); i++) {
        while (!B.esvacia(i)) {
            FechaInscrito f = B.eliminar(i);
            PilaDN dn = f.getDn();
            while (!dn.esvacia()) {
                DatoNino d = dn.eliminar();
                if (d.getEdad() <=Y) {
                    
                    aux.adicionar(d);
                } else {
                    aux2.adicionar(d);
                }
            }
            dn.vaciar(aux);
            
            aux3.adicionar(f);
        }
       
        B.vaciar(i, aux3);
    }
    
        return "Se eliminaron los niños de mayores a  la edad : "+Y;
    }

  public static String mostrarB(MultiPilaFI B) {
    String h = "";
    PilaFI aux = new PilaFI();
    PilaDN aux2=new PilaDN();
    for (int i = 1; i <= B.getN(); i++) {
        
        
        while (!B.esvacia(i)) {
            FechaInscrito f = B.eliminar(i);
            PilaDN p = f.getDn();
            
            while (!p.esvacia()) {
                DatoNino dn = p.eliminar();
                h =h+" "+ dn.getNomPat() + " " + dn.getNomMat() + " " + dn.getNomNino() + " " + dn.getApePat() + " " + dn.getApeMat() + " " + dn.getCi() + " " + dn.getEdad() + "\n";
                aux2.adicionar(dn);
                
            }
            p.vaciar(aux2);
            
            aux.adicionar(f);
        }
        
        B.vaciar(i, aux);
    }
    
    return h;
 }
}