
package Logica;

import IGU.Principal; //impota del otro paquete (IGU) a Principal

public class PracticaIGU {

    public static void main(String[] args) {
        
        Principal ventana = new Principal(); //crea varible ventana del tipo Principal, new nueva instancia (objeto)
        ventana.setVisible(true); //a mi ventana hacela visible
        ventana.setLocationRelativeTo(null); //pone la ventana en el centro
        
    }
    
}
