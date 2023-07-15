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
public class ClassScanner {
    public String nama;
    public double nilai1;
    public int nilai2, nilai3;
    
    Scanner input = new Scanner (System.in);
    
    public String getnama(){
        return nama;
    }
    public void inputscanner(){
        System.out.print("Masukkan Nama Anda: ");
        nama = input.nextLine();
        
        System.out.print("Masukkan Nilai 1 : ");
        nilai1 = input.nextDouble();
        
        System.out.print("Masukkan Nilai 2: ");
        nilai2 = input.nextInt();
    }
    public double rata(){
        return ((nilai1 + nilai2)/2);
    }
}
