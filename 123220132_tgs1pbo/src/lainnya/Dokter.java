/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lainnya;

public class Dokter extends Orang implements Pengobatan {
    String spesialisasi;

    public Dokter(String nama, String spesialisasi) {
        super(nama);
        this.spesialisasi = spesialisasi;
    }

    @Override
    public void info() {
        System.out.println("Nama Dokter: " + nama);
        System.out.println("Spesialisasi: " + spesialisasi);
    }
    

    @Override
    public void prosesPengobatan() {
        System.out.println("Dokter sedang melakukan proses pengobatan.");
    }

    @Override
    public void periksaPasien() {
        System.out.println("Dokter sedang memeriksa pasien.");
    }

    @Override
    public void tulisResep() {
        System.out.println("Dokter sedang menulis resep obat.");
    }
    
    @Override
    public void istirahat() {
        System.out.println("Dokter sedang istirahat sejenak antara jadwal praktek.");
    }
    
    @Override
    public void bekerja() {
        System.out.println("Dokter sedang melakukan pemeriksaan pasien di ruang praktek.");
    }
}

