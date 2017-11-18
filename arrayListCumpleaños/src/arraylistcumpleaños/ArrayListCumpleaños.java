/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistcumpleaños;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author andor
 */
public class ArrayListCumpleaños {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DEfinir arreglo de cumpleaños
        ArrayList<String> cumpleaños = new ArrayList ();
        // variable para introducir cumpleaños
        String bday;
        //variable para introducir o no los cumpleñaos
        int cont;
        //variable para mostrar los cumpleaños
        String daBday = "";
        //Introducir cumpleaños y guardarlos en el arreglo
          do {
               // Introduce un Nombre.
               bday = JOptionPane.showInputDialog(null, "Teclee su nombre y cumpleaños");
               cumpleaños.add(bday);
               // Pregunta si deseo mas.
               cont = JOptionPane.showConfirmDialog(null, "¿Deseas otro cumpleaños?", "Arreglo de Nombres", JOptionPane.YES_NO_OPTION);
               // comprueba SI/NO.
          } while (cont == JOptionPane.YES_NO_OPTION);
          
          // Desplegar los nombres del Arreglo.
          for (int i = 0; i < cumpleaños.size(); i++) {
               
               daBday +=  i + ". " + cumpleaños.get(i) + "\n";
               
          }
          
               JOptionPane.showMessageDialog(null, daBday);          
          
          
        
    }
    
}
