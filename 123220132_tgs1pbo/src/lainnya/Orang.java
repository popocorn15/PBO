
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lainnya;

public abstract class Orang {
    public String nama;

    public Orang(String nama) {
        this.nama = nama;
    }

     abstract void info();
     abstract void istirahat();
     abstract void bekerja();
}