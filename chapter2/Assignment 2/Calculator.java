/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Mahin Sojitra
 */
public class Calculator extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    
    // Create JTextField
    JTextField txt = new JTextField();
    
    // Create JPanel
    JPanel cal = new JPanel();
    
    // Create JBotton(s)
    JButton N0 = new JButton("0");
    JButton N1 = new JButton("1");
    JButton N2 = new JButton("2");
    JButton N3 = new JButton("3");
    JButton N4 = new JButton("4");
    JButton N5 = new JButton("5");
    JButton N6 = new JButton("6");
    JButton N7 = new JButton("7");
    JButton N8 = new JButton("8");
    JButton N9 = new JButton("9");
    JButton CE = new JButton("CE");
    JButton C = new JButton("C");
    JButton EQL = new JButton("=");
    JButton DIV = new JButton("/");
    JButton MUL = new JButton("*");
    JButton SUB = new JButton("-");
    JButton ADD = new JButton("+");
    
    // Create Calculation String
    String Calculation = new String();
    String Operation = "";
    
    public void init() {
        
        /* **************************Design code starts here************************** */
        
        // re-size JApplet
        resize(400, 250);
        
        // set Title of JApplet
        Frame title = (Frame)this.getParent().getParent();
        title.setTitle("Calculator : By Mahin Sojitra");
        
        // re-define the layout of JApplet
        setLayout(new BorderLayout(7, 7));
        
        // setLayout of JPanel (cal) and set Font of the JPanel
        cal.setFont(new Font("", Font.BOLD, 15));
        cal.setLayout(new GridLayout(4, 4, 5, 7));
        
        // add Controls into JPanel
        cal.add(N7);
        cal.add(N8);
        cal.add(N9);
        cal.add(DIV);
        cal.add(N4);        
        cal.add(N5);
        cal.add(N6);
        cal.add(MUL);
        cal.add(N1);
        cal.add(N2);
        cal.add(N3);
        cal.add(SUB);
        cal.add(C);
        cal.add(N0);
        cal.add(EQL);
        cal.add(ADD);
        
        add(CE, BorderLayout.SOUTH);
        
        // add JTextField into JApplet & setEditable = False & setHorizontalAlignment to RIGHT and Set Font 
        add(txt, BorderLayout.NORTH);
        txt.setEditable(false);
        txt.setHorizontalAlignment(JTextField.RIGHT);
        txt.setFont(new Font("", Font.BOLD, 15));
                
        // add JPanel into JApplet
        add(cal, BorderLayout.CENTER);
        
        /* **************************Design code ends here************************** */
        
        
        /* **************************Events code starts here************************** */
        
        // Event for Button N0
        N0.addActionListener((e) -> {
            txt.setText(txt.getText()+"0");
            Calculation+="0";
        });
        
        // Event for Button N1
        N1.addActionListener((e) -> {
            txt.setText(txt.getText()+"1");
            Calculation+="1";
        });
        
        // Event for Button N2
        N2.addActionListener((e) -> {
            txt.setText(txt.getText()+"2");
            Calculation+="2";
        });
        
        // Event for Button N3
        N3.addActionListener((e) -> {
            txt.setText(txt.getText()+"3");
            Calculation+="3";
        });
        
        // Event for Button N4
        N4.addActionListener((e) -> {
            txt.setText(txt.getText()+"4");
            Calculation+="4";
        });
        
        // Event for Button N5
        N5.addActionListener((e) -> {
            txt.setText(txt.getText()+"5");
            Calculation+="5";
        });
        
        // Event for Button N6
        N6.addActionListener((e) -> {
            txt.setText(txt.getText()+"6");
            Calculation+="6";
        });
        
        // Event for Button N7
        N7.addActionListener((e) -> {
            txt.setText(txt.getText()+"7");
            Calculation+="7";
        });
        
        // Event for Button N8
        N8.addActionListener((e) -> {
            txt.setText(txt.getText()+"8");
            Calculation+="8";
        });
        
        // Event for Button N9
        N9.addActionListener((e) -> {
            txt.setText(txt.getText()+"9");
            Calculation+="9";
        });
        
        // Event for Button DIV
        DIV.addActionListener((e) -> {
            txt.setText(txt.getText()+"/");
            Calculation+="D";
            MUL.setEnabled(false);
            SUB.setEnabled(false);
            ADD.setEnabled(false);
            
            Operation = "D";
        });
        
        // Event for Button MUL
        MUL.addActionListener((e) -> {
            txt.setText(txt.getText()+"*");
            Calculation+="M";
            DIV.setEnabled(false);
            SUB.setEnabled(false);
            ADD.setEnabled(false);
            
            Operation = "M";
        });
        
        // Event for Button SUB
        SUB.addActionListener((e) -> {
            txt.setText(txt.getText()+"-");
            Calculation+="S";
            DIV.setEnabled(false);
            MUL.setEnabled(false);
            ADD.setEnabled(false);
            
            Operation = "S";
        });
        
        // Event for Button ADD
        ADD.addActionListener((e) -> {
            txt.setText(txt.getText()+"+");
            Calculation+="A";
            DIV.setEnabled(false);
            MUL.setEnabled(false);
            SUB.setEnabled(false);
            
            Operation = "A";
        });
        
        // Event for Button EQL
        EQL.addActionListener((e) -> {
            int n = Calculation.length() - 1;
            if(!txt.getText().equalsIgnoreCase("") && 
               (Calculation.indexOf("D")>0 || Calculation.indexOf("M")>0 || Calculation.indexOf("S")>0 || Calculation.indexOf("A")>0)) 
            {
                try 
                {
                    // Define FLAG for divide by zero Exception
                    boolean FLAG = false;
                    
                    // String Array for Storing Values
                    String valuesStr[];

                    // Int Array for Storing Values Integer DataType
                    double ANS=0;
                 
                    if(Operation.equalsIgnoreCase("D")) // Division
                    {
                        valuesStr = Calculation.split("D");
                        ANS = Integer.parseInt(valuesStr[0]);
                        for (int i = 1; i < valuesStr.length; i++) {
                            if(Integer.parseInt(valuesStr[i]) != 0) {
                                ANS /= Integer.parseInt(valuesStr[i]);
                            }
                            else {
                                FLAG = true;
                            }
                        }
                    }
                    else if(Operation.equalsIgnoreCase("M")) // Multiplication
                    {
                        valuesStr = Calculation.split("M");
                        ANS = 1;
                        for (int i = 0; i < valuesStr.length; i++) {
                            ANS *= Integer.parseInt(valuesStr[i]);
                        }
                    }
                    else if(Operation.equalsIgnoreCase("S")) // Subtraction
                    {
                        valuesStr = Calculation.split("S");
                        ANS = Integer.parseInt(valuesStr[0]);
                        for (int i = 1; i < valuesStr.length; i++) {
                            ANS -= Integer.parseInt(valuesStr[i]);
                        }
                    }
                    else // Addtion
                    {
                        valuesStr = Calculation.split("A");
                        for (int i = 0; i < valuesStr.length; i++) {
                            ANS += Integer.parseInt(valuesStr[i]);
                        }
                    }
                    
                    // for divide by zero indication
                    if(FLAG==true)
                        txt.setText("Cannot divide by zero !");
                    else
                        txt.setText(""+ANS);
                }
                catch(Exception Exc)
                {
                    txt.setText("Invalid Expression !");
                }
            }
            else
            {
                Calculation="";
                txt.setText("Invalid Expression !");
            }
            
            System.out.println(Calculation);
        });
        
        // Event for Button CE
        CE.addActionListener((e) -> {
            txt.setText("");
            Calculation="";
            DIV.setEnabled(true);
            MUL.setEnabled(true);
            SUB.setEnabled(true);
            ADD.setEnabled(true);
        });
        
        // Event for Button C
        C.addActionListener((e) -> {
            Calculation = Calculation.substring(0, Calculation.length()-1);
            txt.setText(Calculation);
            DIV.setEnabled(true);
            MUL.setEnabled(true);
            SUB.setEnabled(true);
            ADD.setEnabled(true);
        });
        
        // Event for JTextField txt
        
        
        /* **************************Events code ends here************************** */
    }

}
