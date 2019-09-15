/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.util.Scanner;

/**
 *
 * @author DIEGO
 */
public class principalOficina {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        metodosOficina met=new metodosOficina();
        
        System.out.println("Cuántas oficinas quiere agregar?");
        int n=sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            met.añadirOficina();
        }
        sc.nextLine();
        System.out.println("Desea eliminar una oficina? (s/n)");
        String respuesta=sc.nextLine();
        if(respuesta.equalsIgnoreCase("s")){
            System.out.println("Lista de oficinas");
            met.listar();
            System.out.println("\nQué oficina quiere eliminar? (numero)");
            int o=sc.nextInt();
            met.eliminarOficina(o);
        }
        System.out.println("Lista de oficinas");
            met.listar();
    }
    
}
