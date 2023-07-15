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
public class IFElseAksi {
    public static void main(String[] args) {
        IFElseClass ifclass = new IFElseClass();
        
        ifclass.SetInputData();
        ifclass.getKeterangan();
        
        System.out.println("\n           Hasil Akhir ");
        System.out.println("=======================================");
        System.out.println("Nama Siswa               :"+ifclass.nama);
        System.out.println("Nilai akhir yang di dapat:"+ifclass.Nilaiakhir);
        System.out.println("Keterangan               :"+ifclass.getKeterangan());
        System.out.println("=======================================");
    }
}
