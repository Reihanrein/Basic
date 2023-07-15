/* 
NIM: 17210563
NAMA: REIHAN DARUSSALAM
KELAS: 17.2A.11
*/
package Pertemuan3;

/**
 *
 * @author ACER
 */
public class AksiScannerNilai extends LatScannerNilai{
    public static void main(String[] args) {
        // Scanner Object
        LatScannerNilai scan = new LatScannerNilai();
        
        // Using "Scan" to call method from LatScannerNilai.hava
        
        scan.inputnim();
        scan.inputnama();
        scan.inputnilaiabsen();
        scan.inputnilaitugas();
        scan.inputnilaiuts();
        scan.inputnilaiuas();
        System.out.println("Proses: Rata= (10%*Nilai Absen)+(20%*Nilai Tugas)+(30%*Nilai UTS)+(40%*Nilai UAS)");   
        System.out.println("-----------------------------------------------------------------------------------");        

// Using "Scan" to Call the output
        System.out.println("PROGRAM NILAI MAHASISWA");
        System.out.println("-----------------------------------------------------------------------------------"); 
        System.out.println("NIM :"+ scan.getnim());
        System.out.println("Nama :"+ scan.getnama());
        System.out.println("Nilai Absen :"+ scan.getnilaiabsen());
        System.out.println("Nilai Tugas :"+ scan.getnilaitugas());
        System.out.println("Nilai UTS :"+ scan.getnilaiuts());
        System.out.println("Nilai UAS :"+ scan.getnilaiuas());
        System.out.println("-----------------------------------------------------------------------------------"); 
        System.out.println("Rata-rata :"+ scan.rata());
    }
}
