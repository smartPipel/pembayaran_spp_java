/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_ukk.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ASUS
 */
public class tableModel extends AbstractTableModel {

    private int row_count;
    private List<Object> list;
    private String[] collumn_name;

    public tableModel(List<Object> list, int row_count, String[] collumn_name) {
        this.list = list;
        this.row_count = row_count;
        this.collumn_name = collumn_name;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return row_count;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return list.get(rowIndex);
    }

    @Override
    public String getColumnName(int column) {
        return collumn_name[column];
    }

}
