/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class IFClassAksi {
    public static void main(String[] args) {
        double tot_beli;
        Scanner input = new Scanner(System.in);
        IFClass fungsiif = new IFClass();
        
        System.out.print("Total Pembelian Rp. ");
        fungsiif.TotalBeli = input.nextDouble();
        
        System.out.println("Besarnya Potongan Rp. "+ fungsiif.getPotongan());
        System.out.println("Jumlah yang harus dibayarkan Rp."+ fungsiif.getJumlahBayar());
    }
}
