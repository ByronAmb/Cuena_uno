package com.mycompany.cuena_uno;
public class Cuenta_dos {
    //atributos
    
    float saldo;
//Constructor
    public Cuenta_dos(float saldo) {
        this.saldo = saldo;
    }

  public void mostrar(){
            System.out.println(" El saldo es: " +this.saldo);
}
//Métodos
public void abonar(float dinero){
this.saldo += dinero;

}    
    
    public void debitar(float dinero){
    
        this.saldo +=dinero;
    }

    void saldo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
