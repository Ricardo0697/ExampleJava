/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Vista.Login;
import javax.swing.JFrame;

/**
 *
 * @author Ricardo
 */
public class LoginTest {
    
     public static void main(String[] args) {
        Login l = new Login();
        l.setSize(400, 300);
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l.setVisible(true);
    }
    
}
