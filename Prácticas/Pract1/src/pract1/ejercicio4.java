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
public class ejercicio4 {
    
    //declaracion de variables
    private int A1,B1,C1,D1;
    //metodo constructor
    public ejercicio4  (int a1,int b1,int c1, int d1){
        this.A1=a1;
        this.B1=b1;
        this.C1=c1;
        this.D1=d1;
    }
    // metodos para realizar los cambios
    public int cambio (){
        int cambio;
        int g=this.B1;
        cambio=g=this.C1;
        return cambio;
    }
    public int cambio2(){
        int cambio2;
        cambio2=this.C1=this.A1;
        return cambio2;
    }
    public int cambio3 (){
        int cambio3;
        cambio3=this.A1=this.D1;
        return cambio3;
    }
    public int cambio4 (){
        int cambio4;
        int h=this.B1;
        cambio4=this.D1=h;
        return cambio4;
    }
}
