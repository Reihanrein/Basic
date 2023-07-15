/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Deretgenap {
    int a; 
    int b;
    Scanner input = new Scanner(System.in);
    public void Proses(){
        System.out.println("-----");
        int a = 0; int b = 1;
        while(b<=20){
            if((b!=1)&&(b%2==0))
                a+=b;
            if((b!=1)&&(b%2==0))
                System.out.println(b);
                b++;
        }
        System.out.println("-----");
        System.out.print("Jumlah: "+ a);
    }
}