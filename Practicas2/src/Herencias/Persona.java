/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencias;

import java.util.Scanner;

/**
 *
 * @author frank
 */
public class Persona {
    
    String nombre;
    int edad;
    String sexo;
    int dni;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public static void main(String []args){
        Persona p=new Persona();
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese su Nombre : ");
        p.setNombre(sc.nextLine());
        
         System.out.print("Ingrese su Edad : ");
        p.setEdad(sc.nextInt());
        
         System.out.print("Ingrese su sexo : ");
        p.setSexo(sc.nextLine());
        
         System.out.print("Ingrese su Dni : ");
        p.setDni(sc.nextInt());
        
        System.out.println(p.tostring());
        
        
        
    }
    
    String tostring(){
        return this.nombre+"\n"+this.edad+"\n"+this.sexo+"\n"+this.dni;
    }
    
    
    
}
