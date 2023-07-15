/* 
NIM: 17210563
NAMA: REIHAN DARUSSALAM
KELAS: 17.2A.11
*/
package Pertemuan3;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class LatScanner {
    public static void main(String[] args) {
        // Membuat Objek Scanner/input
        Scanner input = new Scanner (System.in);
        // Variable Declaration
        String nama;
        double nilai1, nilai3;
        int nilai2;
        System.out.print("Masukkan Nama Anda : ");
        nama = input.nextLine();
        
        System.out.print("Masukkan Nilai 1 : ");
        nilai1 = input.nextDouble();
        
        System.out.print("Masukkan Nilai 2 : ");
        nilai2 = input.nextInt();
        
        nilai3 = nilai1 + nilai2;
        System.out.println("\n Nama Anda : "+ nama);
        System.out.println(" Total Nilai Anda: "+ nilai3);
    }
}
