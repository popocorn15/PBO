

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lainnya;

public class Pasien extends Orang {
    String kondisi;

    public Pasien(String nama, String kondisi) {
        super(nama);
        this.kondisi = kondisi;
    }

    @Override
    public void info() {
        System.out.println("Nama Pasien: " + nama);
        System.out.println("Kondisi: " + kondisi);
    }

    public void buatJanji() {
        System.out.println("Pasien telah membuat janji dengan dokter.");
    }

    public void bayarTagihan() {
        System.out.println("Pasien sedang membayar tagihan.");
    }
    
    @Override
    public void istirahat() {
        System.out.println("Pasien sedang istirahat di kamar rawat setelah perawatan.");
    }
    
    @Override
    public void bekerja() {
        System.out.println("Pasien sedang menjalani terapi atau latihan fisik di ruang rehabilitasi.");
    }
}