/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casodeestudio1;

import javax.swing.JOptionPane;

/**
 *
 * @author charliesalas
 */
public class user {
    
    /**
     * La data de todo el cliente es guardada en esta clase
     */
    
     String NameOfClient;
     String lecture;
        int idconvert;
        int iD;
        int iDOfBill;
        int amountOfBill;
        int moouth;
        int yearOfBill;
        int statudOfBill;
        
        public String getNameOfClient() {
            System.out.println("El nombre del clienet es:" + " " + NameOfClient);
            return NameOfClient;
        }

        public void setNameOfClient(String NameOfClient) {
            lecture = JOptionPane.showInputDialog("Digite el nombre: ");
            NameOfClient = lecture;
            
            this.NameOfClient = NameOfClient;
        }

        public int getiD() {
            System.out.println("El la ID del cliente es: " + " " + iD);
            return iD;
        }

        public void setiD(int iD) {
            lecture = JOptionPane.showInputDialog("Digite el numero de ID; ");
            idconvert = Integer.parseInt(lecture);
            iD = idconvert;
            this.iD = iD;
            
        }

        public int getiDOfBill() {
            System.out.println("Digite el numero de ID de la factura: " + " " + iDOfBill);
            return iDOfBill;
            
        }

        public void setiDOfBill(int iDOfBill) {
            lecture = JOptionPane.showInputDialog("Digite el numero de ID de la factura; ");
            idconvert = Integer.parseInt(lecture);
            iDOfBill = idconvert;
            this.iDOfBill = iDOfBill;
        }

        public int getAmountOfBill() {
            System.out.println("El monto de la factura es de: " + " " + amountOfBill);
            return amountOfBill;
        }

        public void setAmountOfBill(int amountOfBill) {
            lecture = JOptionPane.showInputDialog("Digite el monto de la factura: ");
            idconvert = Integer.parseInt(lecture);
            amountOfBill = idconvert;
            this.amountOfBill = amountOfBill;
        }

        public int getMoouth() {
            System.out.println("El numero del mes es: " + " " + moouth);
            return moouth;
        }

        public void setMoouth(int moouth) {
            lecture = JOptionPane.showInputDialog("Digite el numero del mes: ");
            idconvert = Integer.parseInt(lecture);
            moouth = idconvert;
            this.moouth = moouth;
        }

        public int getYearOfBill() {
            System.out.println("El anio es" + " " + yearOfBill);
            return yearOfBill;
        }

        public void setYearOfBill(int yearOfBill) {
            lecture = JOptionPane.showInputDialog("Digite el numero de anio: ");
            idconvert = Integer.parseInt(lecture);
            yearOfBill = idconvert;
            this.yearOfBill = yearOfBill;
       
        
    }
        
    
}
