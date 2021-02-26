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
public class PembayaranSpp {

    private int id_pembayaran;
    private int id_petugas;
    private String nisn;
    private String tgl_bayar;
    private String bulan_bayar;
    private String tahun_bayar;
    private int id_spp;
    private int jumlah_bayar;

    public int getId_pembayaran() {
        return id_pembayaran;
    }

    public void setId_pembayaran(int id_pembayaran) {
        this.id_pembayaran = id_pembayaran;
    }

    public int getId_petugas() {
        return id_petugas;
    }

    public void setId_petugas(int id_petugas) {
        this.id_petugas = id_petugas;
    }

    public String getNisn() {
        return nisn;
    }

    public void setNisn(String nisn) {
        this.nisn = nisn;
    }

    public String getTgl_bayar() {
        return tgl_bayar;
    }

    public void setTgl_bayar(String tgl_bayar) {
        this.tgl_bayar = tgl_bayar;
    }

    public String getBulan_bayar() {
        return bulan_bayar;
    }

    public void setBulan_bayar(String bulan_bayar) {
        this.bulan_bayar = bulan_bayar;
    }

    public String getTahun_bayar() {
        return tahun_bayar;
    }

    public void setTahun_bayar(String tahun_bayar) {
        this.tahun_bayar = tahun_bayar;
    }

    public int getId_spp() {
        return id_spp;
    }

    public void setId_spp(int id_spp) {
        this.id_spp = id_spp;
    }

    public int getJumlah_bayar() {
        return jumlah_bayar;
    }

    public void setJumlah_bayar(int jumlah_bayar) {
        this.jumlah_bayar = jumlah_bayar;
    }

}
