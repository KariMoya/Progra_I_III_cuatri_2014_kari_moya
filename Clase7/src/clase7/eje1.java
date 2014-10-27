/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase7;

/**
 *
 * @author Toshiba
 */
public class eje1 {

    double[] salarios = new double[5];

    public void AgregarSalario(double salario) {
        for (int i = 0; i < salarios.length; i++) {
            if (salarios[i] == 0) {
                salarios[i] = salario;
                break;
            }
        }
    }
     public String ImprimirSueldos(){
       String imprimir="";
       for(int i=0;i<salarios.length;i++){
   imprimir+="El salario del trabajador # "+(i+i)+ "es de "+ salarios[i]+"\n";
       }
       return imprimir;
   }

    boolean imprimirSalarios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
   
