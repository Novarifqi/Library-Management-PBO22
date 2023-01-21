package entity;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Koleksi {
    protected int idKoleksi;
    protected boolean status;

    public Koleksi() {
    }

    public int getIdKoleksi() {
        return idKoleksi;
    }

    public void setIdKoleksi(int idKoleksi) {
        this.idKoleksi = idKoleksi;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}