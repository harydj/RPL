/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ThareeqAD
 */
public class Karyawan {
    private int Id_karyawan;
    private int Kd_transaksi;
    private String Nama;
    private String Jabatan;

    public Karyawan() {
    }

    public Karyawan(int Id_karyawan, int Kd_transaksi, String Nama, String Jabatan) {
        this.Id_karyawan = Id_karyawan;
        this.Kd_transaksi = Kd_transaksi;
        this.Nama = Nama;
        this.Jabatan = Jabatan;
    }

    public int getId_karyawan() {
        return Id_karyawan;
    }

    public void setId_karyawan(int Id_karyawan) {
        this.Id_karyawan = Id_karyawan;
    }

    public int getKd_transaksi() {
        return Kd_transaksi;
    }

    public void setKd_transaksi(int Kd_transaksi) {
        this.Kd_transaksi = Kd_transaksi;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getJabatan() {
        return Jabatan;
    }

    public void setJabatan(String Jabatan) {
        this.Jabatan = Jabatan;
    }
    
    
    
}
