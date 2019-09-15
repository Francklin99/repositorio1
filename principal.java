/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Práctica1;

import java.util.Scanner;

/**
 *
 * @author frank
 */
class Persona {
    
    String oficina;
    String salon;
    String id;
    String tipo;
    
    public Persona(){
        
        int opcion;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Elige un cargo: ");
        System.out.println("1.Profesor ");
        System.out.println("2.empleado ");
        opcion=sc.nextInt();
        
        if(opcion==1){
            profesor p =new profesor();
            
        }
        if(opcion==2){
            empleado e=new empleado();
        }
    }
}
    
    
    
    class profesor{
        String salon;
        String id;
        String tipo;
        int opcion;
        
        public profesor(){
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Elige tipo del docente :");
         System.out.println("\n1.Titular\n2.Asociado\n3.Asistente");
         opcion=sc.nextInt();
         
         System.out.print("Ingrese el numero de salon :");
         salon=sc.next();
         
         System.out.print("Ingrese su id :");
         id=sc.next();
         
         
         
         switch(opcion){
             case 1:
                 tipo="Titular";
             
             case 2:
                 tipo="Asociado";
                 
             case 3:
                 tipo="Asistente";
         }
         
         System.out.println("Información del profesor : ");
         System.out.println("Tipo : "+tipo);
          System.out.println("N° salon : "+salon);
           System.out.println("Id : "+id);
        
    }
    }
    
    class empleado{
        String salon;
        String id;
        
        public empleado(){
        Scanner sc=new Scanner(System.in);
         System.out.print("Ingrese el numero de oficina :");
         salon=sc.next();
         
         System.out.print("Ingrese su id :");
         id=sc.next();
         
         System.out.println("Información del empleado : ");
        
         System.out.println("N° oficina : "+salon);
         System.out.println("Id : "+id);
        
    }
    }

    public class principal{
        
    public static void main(String args[]){
        Persona p=new Persona();
       
        
       
        
    }
    
}
