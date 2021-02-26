/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

import latihan_ukk.model.Siswa;

/**
 *
 * @author ASUS
 */
public interface siswaImplement {

    public void insert(Siswa kelas);

    public void delete(Siswa kelas);

    public void update(Siswa kelas);

    public List<Siswa> getSiswaList();

}
