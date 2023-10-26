/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casodeestudio1;
import javax.swing.JOptionPane;

/**
 *
 * @author charliesalas
 */
public class CasoDeEstudio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String lecture;
        int userBills =0;
        int conver;
        double interst;
        
        
        lecture = JOptionPane.showInputDialog("Digite cuantas facturas desea digitar: ");
        userBills = Integer.parseInt(lecture);
        
        for (int i = 0; i < userBills; i++) {
            user nuevo = new user();
            StatusofBill nuevo1 = new StatusofBill();
            
            nuevo.setNameOfClient(null);
            nuevo.getNameOfClient();
            nuevo.setiD(i);
            nuevo.getiD();
            nuevo.setiDOfBill(i);
            nuevo.getiDOfBill();
            nuevo.setMoouth(i);
            nuevo.getMoouth();  
            nuevo.setYearOfBill(i);
            nuevo.getYearOfBill();
            nuevo.setAmountOfBill(i);
            nuevo.getAmountOfBill();
            
            nuevo1.setConvert(i);
            nuevo1.getConvert();
            
            
        }
        
        lecture = JOptionPane.showInputDialog("Quieres revisar si tienes facturas pendientes?: ");
        conver = Integer.parseInt(lecture);
        
        if (conver == 1){
            JOptionPane.showConfirmDialog(null,"Usted tiene: " + "Facturas pendientes");
        }else{
            JOptionPane.showConfirmDialog(null,"Usted no tiene niguna factura pendiente!");
        }
        
    }
    
}
    
