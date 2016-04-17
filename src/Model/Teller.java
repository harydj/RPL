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
public class Teller {
    private int id_pengguna;
    private String nama;
    private String cabang_bank;

    public Teller() {
    }

    public Teller(int id_pengguna, String nama, String cabang_bank) {
        this.id_pengguna = id_pengguna;
        this.nama = nama;
        this.cabang_bank = cabang_bank;
    }

    public int getId_pengguna() {
        return id_pengguna;
    }

    public void setId_pengguna(int id_pengguna) {
        this.id_pengguna = id_pengguna;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getCabang_bank() {
        return cabang_bank;
    }

    public void setCabang_bank(String cabang_bank) {
        this.cabang_bank = cabang_bank;
    }
    
    
    
}
