/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *
 * @author ACER
 */
public class DeretPrima {
    public void Proses(){
        for (int i = 1; i <= 19; i++){
            int bil = 0;
        for ( int j = 1; j<=i; j++){
            if (i%j==0){
                bil+=1;
            }
        }
        if (bil==2){
            System.out.print(i+" ");
        }
        }
    }
}
