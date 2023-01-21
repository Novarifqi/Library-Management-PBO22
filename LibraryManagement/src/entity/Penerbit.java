package entity;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author LENOVO
 */
public class Penerbit extends Identitas {
    String alamatPenerbit;

    public Penerbit() {
    }

    public Penerbit(String namaPenerbit) {
        this.nama = namaPenerbit;
        this.alamatPenerbit = "-";
    }

    public Penerbit(String namaPenerbit, String alamatPenerbit) {
        this.nama = namaPenerbit;
        this.alamatPenerbit = alamatPenerbit;
    }

    public void dataPenerbit() {
        System.out.println("Nama Penerbit   : " + nama);
        System.out.println("Alamat Penerbit : " + alamatPenerbit);
    }
}


