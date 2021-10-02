/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Vista.Dashboard;
import Vista.Main;
import javax.swing.JFrame;

/**
 *
 * @author Ricardo
 */
public class DashboardTest {
    
     public static void main(String[] args) {
        Dashboard m = new Dashboard("Dashboard");
        m.setSize(1000, 300);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setVisible(true);
    }
}
