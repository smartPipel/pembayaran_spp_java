/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import latihan_ukk.model.Kelas;

/**
 *
 * @author ASUS
 */
public interface kelasImplement {

    public void insert(Kelas kelas);

    public void delete(Kelas kelas);

    public void update(Kelas kelas);

    public List<Kelas> getKelasList();
}
