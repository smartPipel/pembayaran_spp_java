/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_ukk.view.components;

import java.awt.Component;
import java.awt.PopupMenu;
import latihan_ukk.view.components.menuPanel.dashboardPanel;
import latihan_ukk.view.components.menuPanel.historyPanel;
import latihan_ukk.view.components.menuPanel.pembayaranPanel;
import latihan_ukk.view.components.menuPanel.petugasPanel;
import latihan_ukk.view.components.menuPanel.siswaPanel;
import latihan_ukk.view.components.menuPanel.sppPanel;
import latihan_ukk.view.dashboardAdmin;

/**
 *
 * @author ASUS
 */
public class menuCase {

    private final Component dashboardPanel = new dashboardPanel();
    private final Component siswaPanel = new siswaPanel();
    private final Component petugasPanel = new petugasPanel();
    private final Component sppPanel = new sppPanel();
    private final Component pembayaranPanel = new pembayaranPanel();
    private final Component historyPanel = new historyPanel();

    public void menuClick(dashboardAdmin dashboard, int menuIndex) {
        switch (menuIndex) {

        }

    }
}
