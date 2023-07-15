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
public class Operatorperbandingan {
    public static void main(String[] args) {
        // Proses Penyebutan variable dan nilai
        int a=5,b=7,c=8,d=12,e=13, f=24;
        boolean aa, bb, cc, dd, ee, ff;
        aa = a==b;
        bb = b>c;
        cc = c<d;
        dd = d>=e;
        ee = e<=f;
        ff = b!=a;
        System.out.println("Apakah "+a+"== "+b+"? jawabannya "+aa);
        System.out.println("Apakah "+b+"> "+c+"? jawabannya "+bb);
        System.out.println("Apakah "+c+"< "+d+"? jawabannya "+cc);
        System.out.println("Apakah "+d+">= "+e+"? jawabannya "+dd);
        System.out.println("Apakah "+e+"<= "+f+"? jawabannya "+ee);
        System.out.println("Apakah "+b+"!= "+a+"? jawabannya "+ff);
    }
}
