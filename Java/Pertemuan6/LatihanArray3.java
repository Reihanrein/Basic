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
public class LatihanArray3 {
    public static void main(String[] args) {
        int i, j;
        int [][] data_jual;
        
        data_jual = new int[3][3];
        
        Scanner input = new Scanner(System.in);
        
        for ( i = 0; i < 3; i++){
            for ( j = 0; j < 3; j++){
                System.out.print("Masukkan data jual["+i+"]["+j+"]= ");
                data_jual[i][j] = input.nextInt();
            }
            System.out.println();
        }
        System.out.println("\n\nData jual yang di inut ke elemen Array\n");
        
        for ( i = 0; i < 3; i++){
            for ( j = 0; j < 3; j++){
                System.out.print("Masukkan data jual["+i+"]["+j+"]");
                System.out.println(" = "+ data_jual[i][j]);
            }
            System.out.println();
        }

    }
}
