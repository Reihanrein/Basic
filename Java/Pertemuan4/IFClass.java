/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author ACER
 */
public class IFClass {
   public double TotalBeli, Potongan;
   
   public void setTotalBeli(double a){
       TotalBeli = a;
   }
   public double getPotongan(){
       if (TotalBeli >= 50000){    
       Potongan = 0.2 * TotalBeli;
       }
       return Potongan;
   }
   public double getJumlahBayar(){
       return(TotalBeli - Potongan);
    }
}
