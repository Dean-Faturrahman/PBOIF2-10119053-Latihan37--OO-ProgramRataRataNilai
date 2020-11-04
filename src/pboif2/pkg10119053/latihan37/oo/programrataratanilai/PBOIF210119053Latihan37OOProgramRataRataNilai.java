/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan37.oo.programrataratanilai;

import java.util.Scanner;
import rataNilai.RataNilai;
/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program menghitung rata rata nilai
 */
public class PBOIF210119053Latihan37OOProgramRataRataNilai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RataNilai rat = new RataNilai();
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        rat.n = input.nextInt();
        for (int i=1; i<=rat.n; i++){
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            rat.nilai = input.nextInt();
            rat.hitungJumlah();
        }
        System.out.println("Rata - rata nilai mahasiswa : " + rat.hitungRata());
    }
    
}
