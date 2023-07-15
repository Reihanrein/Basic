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
public class AksiScanner extends ClassScanner{
    public static void main(String[] args) 
    {
        
        // membuat objek scanner
        ClassScanner scan = new ClassScanner();
        
        scan.inputscanner();
        System.out.println("\n Nama Anda: "+ scan.getnama());
        System.out.println(" Nilai Anda: "+ scan.rata());
    }
}
