/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author daniel josias
 */
class aula{

String numero; 
int sillas; 

    public aula(String numero, int sillas) {
        this.numero = numero;
        this.sillas = 0;
        
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getSillas() {
        return sillas;
    }

    public void setSillas(int sillas) {
        this.sillas = sillas;
    }
    
    

    @Override
    public String toString() {
        return "numero: " + numero + " sillas: " + sillas;
    }
}
