/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import lainnya.Dokter;
import lainnya.Pasien;


public class Main {
    public static void main(String[] args) {
        try {
           Dokter dokter = new Dokter("Dr. Purnomo", "Dokter Tulang");
           Pasien pasien = new Pasien("Aliya", "Patah Tulang");

            dokter.info();
            dokter.prosesPengobatan();
            dokter.periksaPasien();
            dokter.tulisResep();
            dokter.istirahat();
            dokter.bekerja();
            System.out.println( );

            pasien.info();
            pasien.buatJanji();
            pasien.bayarTagihan();
            pasien.istirahat();
            pasien.bekerja();
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan, data tidak ada." );
        }
    }
}