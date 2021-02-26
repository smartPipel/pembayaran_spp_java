/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_ukk.dao;

import java.util.List;
import latihan_ukk.model.PembayaranSpp;

/**
 *
 * @author ASUS
 */
public interface pembayaranImplement {

    public void insert(PembayaranSpp kelas);

    public void delete(PembayaranSpp kelas);

    public void update(PembayaranSpp kelas);

    public List<PembayaranSpp> getPembayaranList();
}
