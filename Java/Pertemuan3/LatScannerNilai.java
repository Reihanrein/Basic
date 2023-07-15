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
public class LatScannerNilai {
    public String nama;
    public String nim;
    public int nilaiabsen;
    public double nilaitugas;
    public double nilaiuts;
    public double nilaiuas;
    
    Scanner input = new Scanner(System.in);
    
    // input nim value
    public void inputnim(){
        System.out.print("Masukkan NIM Anda: ");
        nim = input.nextLine();
    }
    
    // return nim value
    public String getnim(){
    return nim;
    }
    
    //input nama value
    public void inputnama(){
        System.out.print("Masukkan Nama Anda: ");
        nama = input.nextLine();
    }
    
    // return nama value
    public String getnama(){
    return nama;
    } 
    
    // input nilai absen value
    public void inputnilaiabsen(){
        System.out.print("Masukkan Nilai Absen: ");
        nilaiabsen = input.nextInt();
    }
    
    // retrun nilai absen value
    public int getnilaiabsen(){
    return nilaiabsen;
    }
    
    // input nilai tugas value
    public void inputnilaitugas(){
        System.out.print("Masukkan Nilai Tugas: ");
        nilaitugas = input.nextDouble();
    }
    
    // return nilai tugas value
    public double getnilaitugas(){
        return nilaitugas;
    }
    
    // input nilai uts value
    public void inputnilaiuts(){
        System.out.print("Masukkan Nilai UTS: ");
        nilaiuts = input.nextDouble();
    }
    
    // return nilai uts value
    public double getnilaiuts(){
        return nilaiuts;
    }
    
    // input nilai uas value 
    public void inputnilaiuas(){
        System.out.print("Masukkan Nilai UAS: ");
        nilaiuas = input.nextDouble();
    }
    
    // return nilai uas value
    public double getnilaiuas(){
        return nilaiuas;
    }
    // Processing and returning ALL OF THEM
    public double rata(){
        return ((0.10 * nilaiabsen)+(0.20 * nilaitugas)+(0.30 * nilaiuts)+(0.40 * nilaiuas));
    }
}