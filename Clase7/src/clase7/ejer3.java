


package clase7;

public class ejer3 {

    private double salarioManana[] = new double[4];
    private double salarioTarde[] = new double[4];

    public void AgregarSalarioManana(double sueldo) {
        int i;
        for (i= 0; i < salarioManana.length; i++) {
            if (salarioManana[i] == 0) {
                salarioManana[i] = sueldo;
                break;

            }
        }
    }
    
    public void AgregarSalarioTarde(double sueldo) 
    {
        int i;
        for (i = 0; i < salarioTarde.length; i++) {
            if (salarioTarde[i] == 0) {
                salarioTarde[i] = sueldo;
                break;

            }
        }
    }
    
    public String ImprimirGastos()
    {
    double sumaSalarioManana=0;
    double sumaSalarioTarde=0;
        int i;
    
    for (i = 0; i < salarioManana.length; i++){
        sumaSalarioManana+=salarioManana[i];
    }
    for (i = 0; i < salarioTarde.length; i++){
        sumaSalarioTarde+=salarioTarde[i]; 
         }
    return "El sallario en el turno de la mañana es"+sumaSalarioManana+"\n"+
           "El sallario en el turno de la mañana es"+sumaSalarioTarde; 
    }
    
}
