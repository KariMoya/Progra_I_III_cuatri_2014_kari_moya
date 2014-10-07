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
public class ejercicio7 {
     //declaracion de variables
    int N;
    //metodo constructor
    public  ejercicio7(int Be){
        this.N=Be;
    }
    //metodo para saber si es positivo o negativo
    public String posinega (){
        String p="Positivo";
        String n="Negativo";
        if(this.N>=0)return p; return n;
    }
    //metodo para calcular si es par o impar
    public String parimp (){
        String p="Par";
        String n="Impar";
        if(this.N%2==0)return p; return n;
    }
    //metodo para calcular si es multiplo
    public String multiplo (){
        String M="Multiplo";
        String NM="No es multiplo";
        if(this.N%5==0&&this.N%10==0)return M; return NM;
    }
    //metodo para saber si es mayor o menor que cien
    public String mayormenor (){
        String Ma="Es mayor";
        String Me="Es menor";
        if(this.N>100) return Ma; return Me;
    }
}
