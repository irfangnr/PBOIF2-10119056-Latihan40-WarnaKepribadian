/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan40.warnakepribadian;

import java.util.Scanner;

/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan Warna kepribadian
 */
public class Latihan40WarnaKepribadian {

    public static void main(String[] args) {
        TesKepribadian kepribadian1=new TesKepribadian();
                Scanner input = new Scanner(System.in);
        String warna,nama;
        
        System.out.println(TesKepribadian.RED+"YUK"+TesKepribadian.GREEN+" CEK"+TesKepribadian.YELLOW+" KEPRIBADIANMU"+TesKepribadian.CYAN+" DARI"+TesKepribadian.PURPLE+" WARNA"+TesKepribadian.BLUE+" FAVORITMU");
        System.out.println(TesKepribadian.RED+"MERAH");
        System.out.println(TesKepribadian.GREEN+"HIJAU");
        System.out.println(TesKepribadian.YELLOW+"KUNING");
        System.out.println(TesKepribadian.BLUE+"BIRU");
        System.out.println(TesKepribadian.PURPLE+"UNGU");
        System.out.println(TesKepribadian.BLACK+"");
        System.out.println("*gunakan huruf kapital");
        System.out.print("PILIH WARNA FAVORITMU : ");
        warna = input.next();
        System.out.print("NAMA KAMU : ");
        nama = input.next();
        TesKepribadian.kepribadian(warna, nama);
    }
    
}
