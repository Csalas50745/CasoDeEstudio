/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casodeestudio1;

/**
 *
 * @author charliesalas
 */
import javax.swing.JOptionPane;
public class StatusofBill {
    
    public int getConvert() {
        System.out.println("Status: " + " " + convert);
        return convert;
        
    }

    public void setConvert(int convert) {
        
        lecture = JOptionPane.showInputDialog("Si la factura esta paga digite 1, si no digite 2.");
        convert = Integer.parseInt(lecture);
        
        if (convert == 1){
            JOptionPane.showMessageDialog(null, "La factura esta paga. ");
        }else{
            JOptionPane.showMessageDialog(null, "La factura no esta paga. ");
        }
        
        this.convert = convert;
    }
    
    String lecture;
    int convert;
    
    
}
