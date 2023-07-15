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
public class ClassGaji {
    // Deklarasi Variabel
    String nama;
    int Kode_Golongan;
    int Kode_Pendidikan;
    int Jam_Kerja;
    int honor_lembur;
    int honor_final;
    double Tunjangan_Golongan;
    double Tunjangan_Pendidikan;
    int Kode_Jabatan;
    int honor_tetap = 300000;
    // Pembuatan Objek Scan
    Scanner input = new Scanner (System.in);
    
    public int gethonor(){
        return honor_tetap;
    }
    public void nama_karyawan(){
        System.out.print("Nama Karyawan: ");
        nama = input.nextLine();
    }
    public String getName(){
        return nama;
    }
    public void Pemilihan_Golongan(){
        System.out.print("Golongan: ");
        Kode_Golongan = input.nextInt();
    }
    public void Proses_Golongan(){
        if (Kode_Golongan == 1){
           Tunjangan_Golongan = 0.5 * honor_tetap; 
        }
        else if (Kode_Golongan == 2){
           Tunjangan_Golongan = 0.10 * honor_tetap;
    }
        else if (Kode_Golongan == 3){
            Tunjangan_Golongan = 0.15 * honor_tetap;
        }
        else{
            System.out.print("Maaf Kode Golongan anda salah, Silahkan Coba lagi...");
        }
    }
        public double getGolongan(){
        return Tunjangan_Golongan;
    }
    public void Pemilihan_Pendidikan(){
        System.out.print("Pendidikan(SMU/D3/S1): ");
        Kode_Pendidikan = input.nextInt();
    }
    public void Proses_Pendidikan(){
        if (Kode_Pendidikan == 1){
            Tunjangan_Pendidikan = 2.5 + honor_tetap;
        }
        else if (Kode_Pendidikan == 2){
            Tunjangan_Pendidikan = 5.0 * honor_tetap;
    }
        else if (Kode_Pendidikan == 3){
            Tunjangan_Pendidikan = 7.5 * honor_tetap;
            
}
        else{
            System.out.print("Maaf Kode Pendidikan anda salah, Silahkan Coba lagi...");
        }
    }
        public double getPendidikan(){
        return Tunjangan_Pendidikan;
    }
    public void Durasi_Kerja(){
        System.out.print("Jumlah Jam Kerja: ");
        Jam_Kerja = input.nextInt();
    }
    public void Proses_JamKerja(){
        if (Jam_Kerja >8){
            honor_lembur = Jam_Kerja*=2500;
    }
    }
    public double getLembur(){
        return honor_lembur;
    }
    public void Proses_Akhir(){
        honor_final = (int) (honor_tetap + Tunjangan_Golongan + Tunjangan_Pendidikan + honor_lembur);
    }
    public int getHonor_Akhir(){
        return honor_final;
    }
}