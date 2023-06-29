/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signuppage;

import javax.swing.*;

/**
 *
 * @author Mahin Sojitra
 */
public class SignupPage extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    
    // Create JLabels
    JLabel l1 = new JLabel("First Name");
    JLabel l2 = new JLabel("Last Name");
    JLabel l3 = new JLabel("Email Address");
    JLabel l4 = new JLabel("New Password");
    JLabel l5 = new JLabel("Confirm Password");
    
    // Create JTextField
    JTextField fn = new JTextField();
    JTextField ln = new JTextField();
    JTextField email = new JTextField();
    JPasswordField npsw = new JPasswordField();
    JPasswordField cpsw = new JPasswordField();
    
    // Create JButton
    JButton signup = new JButton("Sign Up");
    
    public void init() {
        
        // resize JApplet
        resize(330, 250);
        
        // set Layout of JApplet
        setLayout(null);
        
        // set Bounds of all Components
        l1.setBounds(20, 20, 70, 20);
        fn.setBounds(20, 40, 130, 21);
        l2.setBounds(180, 20, 70, 20);
        ln.setBounds(180, 40, 130, 21);
        l3.setBounds(20, 65, 100, 20);
        email.setBounds(20, 85, 290, 21);
        l4.setBounds(20, 110, 100, 20);
        npsw.setBounds(20, 130, 290, 21);
        l5.setBounds(20, 155, 130, 20);
        cpsw.setBounds(20, 175, 290, 21);
        signup.setBounds(120, 215, 80, 21);
        
        // add ToolTipText
        l1.setToolTipText("Text");
        l2.setToolTipText("Text");
        l3.setToolTipText("Text");
        l4.setToolTipText("Text");
        l5.setToolTipText("Text");
        fn.setToolTipText("Provide first name");
        ln.setToolTipText("Provide last name");
        email.setToolTipText("Provide professional email address");
        npsw.setToolTipText("Create new password");
        cpsw.setToolTipText("Re-enter password");
        signup.setToolTipText("Sign Up");
        
        // add Components into JApplet
        add(l1);
        add(fn);
        add(l2);
        add(ln);
        add(l3);
        add(email);
        add(l4);
        add(npsw);
        add(l5);
        add(cpsw);
        add(signup);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
