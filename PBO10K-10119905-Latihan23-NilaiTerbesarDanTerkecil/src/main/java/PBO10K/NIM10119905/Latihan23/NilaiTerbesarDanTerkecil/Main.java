/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan23.NilaiTerbesarDanTerkecil;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author
 * NAMA    : Abraham Rumayara
 * KELAS   : PBO10K
 * NIM     : 10119905
 * Deskripsi Program : Program untuk menampilkan nilai terbesar dan terkecil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var scanner = new Scanner(System.in);
        String Petugas;
        int BanyakNilai;
        int []nilaiMahasiswa;
        
        
        System.out.println("======Program Nilai Terbesar dan Terkecil Nilai Mahasiswa======");
        System.out.println("Masukan Nama Petugas : ");
        Petugas = scanner.nextLine();
        System.out.println("Masukan banyaknya nilai mahasiswa");
        BanyakNilai = scanner.nextInt();
        
        nilaiMahasiswa = new int[BanyakNilai];
        
        for (int i=1 ;i<=BanyakNilai; i++){
            System.out.printf("Hasil Nilai Mahasiswa ke -%d : %n", i);
            nilaiMahasiswa[i-1]=scanner.nextInt(); 
        }
        
        System.out.println();
        System.out.println("===== Hasil Nilai Mahasiswa =====");
        for (int i =1; i<=BanyakNilai ; i++)
        System.out.printf("Hasil Nilai Mahasiswa ke-%d : %d%n",i,nilaiMahasiswa[i-1]);
        
        System.out.println();
        System.out.printf("Nilai Terbesar Adalah : %d\n", Arrays.stream(nilaiMahasiswa).max().getAsInt());
        System.out.printf("Nilai Terkecil Adalah : %d", Arrays.stream(nilaiMahasiswa).min().getAsInt());
        
        System.out.println("\n");
        System.out.printf("Nama Petugas : %s", Petugas);
    }
    
}
