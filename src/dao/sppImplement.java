/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import latihan_ukk.model.Spp;

/**
 *
 * @author ASUS
 */
public interface sppImplement {

    public void insert(Spp kelas);

    public void delete(Spp kelas);

    public void update(Spp kelas);

    public List<Spp> getSppList();
}
