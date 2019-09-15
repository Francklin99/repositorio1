/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DIEGO
 */
public class metodosOficina {
    ArrayList<Oficina> oficinas=new ArrayList<>();
    
    public void añadirOficina(){
        Scanner sc=new Scanner(System.in);
        
//        sc.nextLine();
        System.out.println("\nIngrese nombre:");
        String nombre=sc.nextLine();
        System.out.println("Ingrese numero:");
        int numero=sc.nextInt();
        
        Oficina ofi=new Oficina(nombre, numero);
        
        if(!exitste(ofi)){
            oficinas.add(ofi);
        }else{
            System.out.println("La oficina ya existe");
        }
    }
    
    public void eliminarOficina(int n){
        for (int i = 0; i < oficinas.size(); i++) {
            if(oficinas.get(i).getNumero()==n){
                oficinas.remove(i);
                System.out.println("Eliminado correctamente");
                break;
            }
            System.out.println("No se encuentra la oficina");
        }
    }
    
    public boolean exitste(Oficina of){
        for (int i = 0; i < oficinas.size(); i++) {
            if(of.getNombre().equals(oficinas.get(i).getNombre())){
                
                return true;
            }else if (of.getNumero()==oficinas.get(i).getNumero()) {
               
                return true;
            }
        }
        return false;
    }
    
    public void listar(){
        if(oficinas.size()>0){
            for (int i = 0; i < oficinas.size(); i++) {
            System.out.println(oficinas.get(i).toString());
            }
        }else System.out.println("La lista está vacía");    
    }
}
