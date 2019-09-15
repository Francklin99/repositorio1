
package universidad;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Universidad {
    
    
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        int opcion;
        opcion=Integer.parseInt(JOptionPane.showInputDialog("ingrese una opcion:\n"+"1.aulas\n"+"2.oficinas\n"));
        
   
                
        switch(opcion){
            case 1:
                aulas a1=new aulas();
                a1.setNumeroSalon(5);
                a1.setNumero_asientos("50 asientos");
                a1.datos();
                break;
                
            case 2:
                oficina o1=new oficina();
                o1.SetnumeroOficina("oficina 1");
                o1.datosOficina();
                break;
            default:
                System.out.println("opcion no reconocida");
                
        }
   
    }
      
}
class aulas{
    
    String numero_asientos;
    int numeroSalon;

    public aulas(){
        this.numero_asientos=numero_asientos;
        this.numeroSalon=numeroSalon;
    }

   

    public void setNumero_asientos(String numero_asientos) {
        this.numero_asientos = numero_asientos;
    }

    public String getNumero_asientos() {
        System.out.println("ingrese numero de asientos");
        
        return numero_asientos;
    }

    public int getNumeroSalon() {
        return numeroSalon;
    }

    

    public void setNumeroSalon(int numeroSalon) {
        this.numeroSalon = numeroSalon;
    }

    public void datos(){
        System.out.println("el numero del salon es "+numeroSalon+" y la capacidad del salon es de "+numero_asientos);
    }
    
    
}

class oficina{
    
    String numeroOficina;
    public oficina(){
        this.numeroOficina=numeroOficina;
    }
    public void SetnumeroOficina(String numeroOficina){
        this.numeroOficina=numeroOficina;
    }
    
    public void datosOficina(){
        System.out.println("el numero de la oficina es "+numeroOficina);
    }
    
}


