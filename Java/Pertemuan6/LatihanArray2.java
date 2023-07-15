/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author ACER
 */
public class LatihanArray2 {
    public static void main(String[] args) {
        int i, j;
        double[] nilai_akhir = {56.5, 66.7, 87.6, 98.5, 78.9, 85.4};
        
        System.out.println(" Data yang di input dalam elemen array");
        // menampilkan data dari elemen array
        
        for (i = 0; i<6; i++){
            System.out.print("Nilai Akhir Index"+ i);
            System.out.println(" = "+ nilai_akhir[i]);
        }
    }
}
