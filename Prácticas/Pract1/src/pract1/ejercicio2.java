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
public class ejercicio2 {
   
    //declaracion de variables de la clase
    private int X=0, Y=0;
    private double N=0, M=0;
    //metodo constructor
    public  ejercicio2 (int x, int y, double m, double n1){
        this.M=m;
        this.N=n1;
        this.X=x;
        this.Y=y;
    }
    public double suma(int x, int y){
        double suma1,suma2;
        suma1=X+Y;
        return suma1;
    }
    public double resta(int x, int y){
        double resta;
        resta=X-Y;
        return resta;
       
    }
    public double division (int x, int y){
        double division;
        division=X/Y;
        return division;
    }
    public double multiplicacion (int x, int y){
        double multi;
        multi=X*Y;
        return multi;
    }
    public double suma2(){
        double suma;
        suma=N+M;
        return suma;
    }
    public double resta2(){
        double resta;
        resta=M-N;
        return resta;
    }
    public double division2 (){
        double division;
        division=M/N;
        return division;
}
 public double multiplicacion2 (){
        double multi;
        multi=M*N;
        return multi;
 }
}
