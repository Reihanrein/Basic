/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class LatihanArray1 {
    public static void main(String[] args) {
        int i;
        int[] nilai_akhir;
        
        //        deklarasi variabel  array
        nilai_akhir = new int[6];
        Scanner input = new Scanner(System.in);
        
            for (i = 0; i < 6; i++){
                System.out.print("Masukkan Array ke "+ i +" = ");
                nilai_akhir[i] = input.nextInt();
            }
            System.out.println("\n\n Data yang di input ke elemen array \n");
            
             for (i = 0; i < 6; i++){
                 System.out.print("Nilai Akhir Index "+ i);
                 System.out.println(" = "+ nilai_akhir[i]);
             }
    }
}
