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
public class ejercicio1 {
   
    private int N;
    private double A;
    char C;
    //Metodo constructor de la clase
    public ejercicio1 (int n,double a,char c)
    {
        this.A=a;
        this.N=n;
        this.C=c;
    }
    //metodo para calcular la suma 
    public double suma(){
        double suma;
        suma=A+N;
        return suma;
    }
    //metodo para calcular la resta
    public double resta(){
        double resta;
        resta= A-N;
        return resta;
        
    }
    public int Letra (){
        int L;
        L=C;
        return L;
    }

}

