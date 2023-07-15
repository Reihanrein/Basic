/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *
 * @author ACER
 */
public class GajiAksi extends ClassGaji {
    public static void main(String[] args) {
        // Create "scan" Object to call Method From ClassGaji.java
        ClassGaji scan = new ClassGaji();
        System.out.println("PT Dingin Damai Memberikan Tunjangan Honor");
        System.out.println("==========================================");
        System.out.println("Kode    Golongan    Tunjangan");
        System.out.println(" 1         1            5%");
        System.out.println(" 2         2           10%");
        System.out.println(" 3         3           15%");
        System.out.println("==========================================");
        
        System.out.println("Kode    Pendidikan    Tunjangan");
        System.out.println(" 1         SMU          2.5%");
        System.out.println(" 2         D3           5%");
        System.out.println(" 3         S1           7.5%");
        System.out.println("==========================================");
        // Calling Input/Output Method by Using "scan" Object
        scan.nama_karyawan();
        scan.Pemilihan_Golongan();
        scan.Proses_Golongan();
        scan.Pemilihan_Pendidikan();
        scan.Proses_Pendidikan();
        scan.Durasi_Kerja();
        scan.Proses_JamKerja();
        scan.Proses_Akhir();
        System.out.println("==========================================");
        
        System.out.println("Karyawan yang Bernama: "+scan.getName());
        System.out.println("Honor yang diterims ");
        System.out.println("Honor Tetap: Rp. "+scan.gethonor());
        System.out.println("Tunjangan Jabatan: Rp. "+scan.getGolongan());
        System.out.println("Tunjangan Pendidikan: Rp. "+scan.getPendidikan());
        System.out.println("Honor Lembur: Rp. "+scan.getLembur());
        System.out.println("=========================================+");
        System.out.println("Total Honor yang diterims: Rp. "+scan.getHonor_Akhir());
    }
}
