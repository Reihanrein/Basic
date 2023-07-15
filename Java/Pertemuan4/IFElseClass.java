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
public class IFElseClass {
    public String nama, Ket;
    public int Nilaiakhir;
    Scanner input = new Scanner (System.in);
    
    public void SetInputData(){
    System.out.print("Masukkan nama anda: ");   
    nama = input.nextLine();
    
    System.out.print("Masukkan nilai akhir: ");   
    Nilaiakhir = input.nextInt();
    }
    public String getKeterangan(){
        if ( Nilaiakhir > 70 ){
            Ket = "Lulus";
        }
        else {
            Ket = "Gagal";
        }
        return Ket;
    }
}
