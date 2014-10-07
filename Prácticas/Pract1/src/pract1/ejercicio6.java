/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pract1;

/**
 *
 * @author Moya
 */
public class ejercicio6 {
    //Declaracion de variables
    private int N;
    //Metodo constructor
    public ejercicio6(int NpN){
        this.N=NpN;
    }
    //metodo para calcular si el numero es positivo o negativo
    public String tiponumero (){
        String P="Positivo";
        String N="Negativo";
        
        if(this.N<=0)return N;return P;
    } 
}


