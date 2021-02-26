/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_ukk.dao;

import java.util.List;
import latihan_ukk.model.Petugas;

/**
 *
 * @author ASUS
 */
public interface petugasImplement {

    public void insert(Petugas kelas);

    public void delete(Petugas kelas);

    public void update(Petugas kelas);

    public List<Petugas> getPetugasList();
}
