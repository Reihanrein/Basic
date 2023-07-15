/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *
 * @author ACER
 */
public class DeretFibo {
    int n;
    int n1 = 1;
    int n2 = 10;
    public void Proses(){
        for (int i = 1; i <=n2; i++){
            System.out.print(n + " ");
            int sum = n + n1;
            n = n1;
            n1 = sum;
    }
}
}
