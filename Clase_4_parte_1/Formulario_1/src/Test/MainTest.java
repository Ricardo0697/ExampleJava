/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Vista.Main;
import javax.swing.JFrame;

/**
 *
 * @author Ricardo
 */
public class MainTest {

    public static void main(String[] args) {
        Main m = new Main("Registro de Clientes");
        m.setSize(1000, 300);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setVisible(true);
    }
}
