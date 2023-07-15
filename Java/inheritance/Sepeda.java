/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author ACER
 */
class Sepeda {
// nilai
int kecepatan = 0;
int gir = 0;

// method
void UbahGir(int PertambahanGir) {
gir = gir +PertambahanGir;
    System.out.println("Gir:"+gir);
    
}
void TambahKecepatan(int PertambahanKecepatan) {
kecepatan = kecepatan+PertambahanKecepatan;
    System.out.println("Kecepatan:"+kecepatan);    
}

}
