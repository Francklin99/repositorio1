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
public class Alumno extends Persona{
    
    
    String cargo;
    float sueldo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    String string(){
        return this.cargo+"\n"+this.sueldo;
    }
    
    public static void main(String []args){
        Alumno a=new Alumno();
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Ingrese el cargo : ");
        a.setCargo(sc.nextLine());
        System.out.print("Ingrese el sueldo : ");
        a.setSueldo(sc.nextFloat());
        
        System.out.println(a.string());
        
        
        
        
        
        
    }
    
    
    
    
    
}
