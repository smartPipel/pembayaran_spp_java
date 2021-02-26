/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_ukk.model;

/**
 *
 * @author ASUS
 */
public class Kelas {

    private int id_kelas;
    private String nama_kelas;
    private String kompetensi_keahlian;

    public int getId_kelas() {
        return id_kelas;
    }

    public void setId_kelas(int id_kelas) {
        this.id_kelas = id_kelas;
    }

    public String getNama_kelas() {
        return nama_kelas;
    }

    public void setNama_kelas(String nama_kelas) {
        this.nama_kelas = nama_kelas;
    }

    public String getKompetensi_keahlian() {
        return kompetensi_keahlian;
    }

    public void setKompetensi_keahlian(String kompetensi_keahlian) {
        this.kompetensi_keahlian = kompetensi_keahlian;
    }
}
