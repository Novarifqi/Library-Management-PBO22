package entity;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author LENOVO
 */
public class Staff extends Akun {
    private String namaStaff;

    public Staff() {
    }

    public Staff(String namaStaff, String nik, String password) {
        this.namaStaff = namaStaff;
        this.nik = nik;
        this.password = password;
    }

    
    public void dataStaff() {
        System.out.println("Nama Staff      : " + namaStaff);
        System.out.println("NIK Staff       : " + nik);
        System.out.println("Password        : " + password);
    }

    public String getNamaStaff() {
        return namaStaff;
    }

    public String getNik() {
        return nik;
    }

    public String getPassword() {
        return password;
    }

    public void setNamaStaff(String namaStaff) {
        this.namaStaff = namaStaff;
    }
}

