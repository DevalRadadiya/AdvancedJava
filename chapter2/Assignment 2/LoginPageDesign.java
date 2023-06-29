/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginpage;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Mahin Sojitra
 */
public class LoginPageDesign extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    
    // Create JTextField
    JTextField username = new JTextField();
    JPasswordField password = new JPasswordField();
    
    // Create JButton
    JButton login = new JButton("Login");
    
    @Override
    public void init() {
        
        // set Layout of JApplet
        setLayout(null);
        
        // set Title of JApplet
        Frame title = (Frame)this.getParent().getParent();
        title.setTitle("Login Autentification");
        
        // set Bounds of components
        username.setBounds(85, 30, 170, 30);
        password.setBounds(85, 80, 170, 30);
        login.setBounds(125, 135, 90, 25);
        
        // set font size of components
        username.setFont(new Font("", Font.BOLD, 19));
        password.setFont(new Font("", Font.BOLD, 19));
        login.setFont(new Font("", Font.BOLD, 16));
        
        // add components 
        add(username);
        add(password);
        add(login);
    }
}
