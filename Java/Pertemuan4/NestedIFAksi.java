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
public class NestedIFAksi {
    public static void main(String[] args) {
        NestedIFClass nestedif = new NestedIFClass();
        
        nestedif.Pendapatansales();
        nestedif.getPotongan();
        
        System.out.println("\nUang Jasa: "+ (int)nestedif.jasa);
        System.out.println("Uang Komisi: "+ (int)nestedif.komisi);
        System.out.println("=====================================");
        System.out.println("Uang Total: "+ (int)nestedif.total);
    }
}
