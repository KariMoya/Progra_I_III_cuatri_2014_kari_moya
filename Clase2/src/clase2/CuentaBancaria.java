/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

/**
 *
 * @author Greivin
 */
public class CuentaBancaria {
    //declaracion de variales
    
    private double saldoInicial;
    private boolean hayError;
    
    //Metodo constructor 
    public CuentaBancaria() {
        saldoInicial = 0;
        hayError = false;
    }
    //Metodo constructor para aumentar la cuenta de un usuario
    public void Deposito (double monto){
        setSaldoInicial(getSaldoInicial() + monto);
    }
    //Metodo constructor para retiro de dinero
    public void Retiro(double monto){
        if(getSaldoInicial()>=monto)
            setSaldoInicial(getSaldoInicial()- monto);
        else
            setHayError(true);
    }
    
    //metodos get y set
    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public boolean isHayError() {
        return hayError;
    }
    

    public void setHayError(boolean hayError) {
        this.hayError = hayError;
    }
    
    
}
