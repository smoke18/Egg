
package Fuciones;

import Clases.Cafetera;
import java.util.Scanner;

public class ServiciosCafe {
    
    Scanner leer = new Scanner (System.in);
    
    Cafetera c1 = new Cafetera();
    
    /////////////////////funciones///////////////////////////////////
    
    public Cafetera LlenarCafetera(Cafetera c1){
        
        c1.setCapAct(c1.getCapMax());
        
        System.out.println("Se lleno la cafetera");
        
        return c1;
    }
    
    /////////////////////////////////////////////////////////////////
    
    public Cafetera VaciarCafetera(Cafetera c1){
        
        c1.setCapAct(0);
        
        System.out.println("Se vacio la cafetera");
        
        return c1;
    }
    
    //////////////////////////////////////////////////////////////////
    
    public Cafetera ServirTaza(Cafetera c1){
        
        int taza;
        
        System.out.println("Ingrese la cantidad de la taza");
        taza = leer.nextInt();
        
        if(c1.getCapAct() < taza){
            
            taza = c1.getCapAct();
            
            System.out.println("No se lleno la taza");
        }
        else{
            
            c1.setCapAct(c1.getCapAct() - taza);
            
            System.out.println("Se lleno la taza");
        }
        
        return c1;
    }
    
    ///////////////////////////////////////////////////////////////////
    
    public Cafetera AgregarCafe(Cafetera c1){
        
        int cafe;
        
        System.out.println("Ingrese la cantidad de cafe que desea ingresar");
        cafe = leer.nextInt();
        
        if(cafe > c1.getCapMax() - c1.getCapAct()){
            
            c1.setCapAct(c1.getCapMax());
            
            System.out.println("Se lleno hasta donde se pudo");
        }
        else{
            
            c1.setCapAct(c1.getCapAct() + cafe);
        }
        
        return c1;
    }
    
    //////////////////////////////////////////////////////////////////////
    
    public void MostrarOpciones(Cafetera c1){
        
        int opc;
        
        CrearCafetera(c1);
        
        do{
            System.out.println("");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Vaciar Cafetera");
            System.out.println("3. Servir Taza");
            System.out.println("4. Agregar Cafe");
            System.out.println("5. Datos de la cafetera");
            System.out.println("6. Salir"); 
            System.out.println("");
            
            System.out.println("Ingrese la opcion que desea: ");
            opc = leer.nextInt();
            
        }while (opc > 7 || opc < 0);
        
        while(opc != 6){
            
            if(opc == 1){
                System.out.println("1. Llenar cafetera");
                LlenarCafetera(c1);
            }
            else{
                if(opc == 2){
                    System.out.println("2. Vaciar Cafetera");
                    VaciarCafetera(c1);
                }
                else{
                    if(opc == 3){
                        System.out.println("3. Servir Taza");
                        ServirTaza(c1);
                    }
                    else{
                        if(opc == 4){
                            System.out.println("4. Agregar Cafe");
                            AgregarCafe(c1);
                        }
                        else{
                            if(opc == 5){
                                System.out.println("5. Datos de la cafetera");
                                
                                System.out.println("Capacidad Maxima: " + c1.getCapMax() + " Capacidad Actual: " + c1.getCapAct());
                            }
                            else{
                                System.out.println("6. Salir");
                            }
                        }
                    }
                }
            }
            
            do{
                System.out.println("");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Vaciar Cafetera");
            System.out.println("3. Servir Taza");
            System.out.println("4. Agregar Cafe");
            System.out.println("5. Datos de la cafetera");
            System.out.println("6. Salir");  
            System.out.println("");
            
            System.out.println("Ingrese la opcion que desea: ");
            opc = leer.nextInt();
            
            }while (opc > 7 || opc < 0);   
        }
    }
    
    ////////////////////////////////////////////////////////////////////
    
    public Cafetera CrearCafetera (Cafetera c1){
        
        System.out.println("Ingrese la capacidad maxima de la cafetera: ");
        c1.setCapMax(leer.nextInt());
        
        
        System.out.println("Ingrese la cantidad actual de cafe en la cafetera: ");
        c1.setCapAct(leer.nextInt());
        
        return c1;
    }
    
}
