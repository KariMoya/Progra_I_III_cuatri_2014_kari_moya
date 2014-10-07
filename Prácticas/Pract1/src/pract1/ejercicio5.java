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
public class ejercicio5 {
    //declaracion de variables
    int N;
    //metodo constructor
    public ejercicio5(int ne5){
        this.N=ne5;
    }
    //metodo par/impar
    public String parimpar (){
        String P="Par";
        String I="Impar";
        if(this.N%2==0){
            return P;
        }else{
            return I;
        }
    }
}
