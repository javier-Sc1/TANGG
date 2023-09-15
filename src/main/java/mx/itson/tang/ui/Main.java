
package mx.itson.tang.ui;

import java.util.Scanner;

/**
 *Esta clase sirve para iniciar el programa y determina el punto de partida de su ejecucion
 * @author javier soto 
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("ingrese numeros a evaluar:");
        
        Scanner entrada = new Scanner(System.in);
        String numeros = entrada.nextLine();
      
        int numerosTijuana = 0;
        int numerosHermosillo = 0;
        int numerosGuaymas = 0;
        int numerosDesconocidos = 0;
        
        String [] tels = numeros.split(",");
        
        for(String g : tels){
            System.out.println(g);
        if(g.startsWith("622")){
           numerosGuaymas++;    
           
        }
        }
        
         for(String h : tels){
            System.out.println(h);
        if(h.startsWith("644")){
           numerosHermosillo++;    
           
        }
        }
        
        
       for(String t : tels){
            System.out.println(t);
        if(t.startsWith("664")){
           numerosHermosillo++;    
         
                   
        }
        
        
           System.out.println("hay " + numerosGuaymas + "numeros de guaymas");
           System.out.println("hay " + numerosHermosillo + "numeros de hermosillo");
           System.out.println("hay " + numerosTijuana + "numeros de tijuana");
           
         
       }
        
      /* 
        Scanner entrada = new Scanner(System.in);
        String oracion = entrada.nextLine();
        
        String nuevaOracion = oracion.replace("n", "x");
        System.out.println(nuevaOracion);
        
        
        
         boolean resultado = oracion.startsWith("a");
        if(resultado){
            System.out.println("si inicia con a");
        }else{
            System.out.println("no inicia con a");
            
        }
        
        
        
    
      
        //System.out.println(oracion.startsWith("a") ? "si inicia con a" : "no inicia con a");
       
      */
    }
}
