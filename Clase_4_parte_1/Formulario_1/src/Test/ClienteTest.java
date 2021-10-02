/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Vista.Cliente;
import javax.swing.JFrame;

/**
 *
 * @author Ricardo
 */
public class ClienteTest {
     public static void main(String[] args) {
        Cliente c = new Cliente("Cliente");
        c.setSize(400, 300);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setVisible(true);
    }
}
