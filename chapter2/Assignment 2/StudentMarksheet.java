/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmarksheet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Mahin Sojitra
 */

public class StudentMarksheet extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    
    // Create Controls here for Details Panel 
    JLabel TitleL = new JLabel("P R O V I D E    D E T A L I S");
    JLabel ExamL = new JLabel("Examination ");
    JLabel SnoL = new JLabel("Seat No ");
    JLabel NameL = new JLabel("Student Name ");
    JLabel SubL = new JLabel("M A R K S   O F   S U B J E C T S");
    JLabel AdJavaL = new JLabel("Advance Java ");
    JLabel CSharpL = new JLabel("C#.NET ");
    JLabel SeoL = new JLabel("SEO ");
    JLabel WsL = new JLabel("WS ");
    JLabel WarnMSG = new JLabel("");
    
    JTextField ExamTF = new JTextField();
    JTextField SnoTF = new JTextField();
    JTextField NameTF = new JTextField();
    JTextField AdJavaTF = new JTextField();
    JTextField CSharpTF = new JTextField();
    JTextField SeoTF = new JTextField();
    JTextField WsTF = new JTextField();

    JButton GresultB = new JButton("GENERATE MARKSHEET");
    
    CardLayout CardLyo = new CardLayout();
    
    JPanel CardP = new JPanel(CardLyo);
    JPanel DetailsP = new JPanel(null);
    JPanel MarkSheetP = new JPanel(null);
    
    Font FontT = new Font("", Font.BOLD, 20);
    Font FontL = new Font("", Font.BOLD, 18);
    Font FontTF = new Font("Courier new", Font.BOLD, 17);
    
    // Create Controls here for MarkSheet Panel
    JLabel MTitle = new JLabel("M  A  R  K  S  H  E  E  T");
    JLabel MExam = new JLabel("Examination : SEE - 2022");
    JLabel MName = new JLabel("Name : ");
    JLabel MSno = new JLabel("Seat No : ");
    JLabel MSub = new JLabel("* Y O U R    M A R K S *");
    JLabel MAdJava = new JLabel("Advance Java : ");
    JLabel MCSharp = new JLabel("C#.NET : ");
    JLabel MSEO = new JLabel("SEO : ");
    JLabel MWS = new JLabel("WS : ");
    JLabel MRS = new JLabel("* R E S U L T *");
    JLabel MTot = new JLabel("Total Marks : ");
    JLabel MPer = new JLabel("Percentage : ");
    
    public void init() {
        
        // resize JApplet 
        resize(550, 450);
        
        // set Title of JApplet
        Frame title = (Frame)this.getParent().getParent();
        title.setTitle("MARKSHEET GENERATOR");
        
        // Formation of Controls for Details Panel
        TitleL.setFont(FontT);
        ExamL.setFont(FontL);
        ExamTF.setFont(FontTF);
        SnoL.setFont(FontL);
        SnoTF.setFont(FontTF);
        NameL.setFont(FontL);
        NameTF.setFont(FontTF);
        SubL.setFont(FontT);
        AdJavaL.setFont(FontL);
        AdJavaTF.setFont(FontTF);
        CSharpL.setFont(FontL);
        CSharpTF.setFont(FontTF);
        SeoL.setFont(FontL);
        SeoTF.setFont(FontTF);
        WsL.setFont(FontL);
        WsTF.setFont(FontTF);
        GresultB.setFont(FontTF);
        WarnMSG.setFont(FontTF);
        WarnMSG.setForeground(Color.RED);
        
        // Formation of Controls for MarkSheet Panel
        MTitle.setFont(FontT);
        MExam.setFont(FontL);
        MName.setFont(FontL);
        MSno.setFont(FontL);
        MSub.setFont(FontT);
        MAdJava.setFont(FontL);
        MCSharp.setFont(FontL);
        MSEO.setFont(FontL);
        MWS.setFont(FontL);
        MRS.setFont(FontT);
        MTot.setFont(FontL);
        MPer.setFont(FontL);
        
        // set bounce and add component in JPanel
        TitleL.setBounds(130, 15, 280, 20);
        ExamL.setBounds(35, 70, 120, 20);
        ExamTF.setBounds(35, 93, 220, 27);
        SnoL.setBounds(285, 70, 120, 20);
        SnoTF.setBounds(285, 93, 220, 27);
        NameL.setBounds(35, 135, 140, 20);
        NameTF.setBounds(35, 157, 470, 27);
        SubL.setBounds(105, 215, 320, 27);
        AdJavaL.setBounds(35, 260, 130, 20);
        AdJavaTF.setBounds(35, 285, 220, 27);
        CSharpL.setBounds(285, 260, 100, 20);
        CSharpTF.setBounds(285, 285, 220, 27); 
        SeoL.setBounds(35, 320, 130, 20);
        SeoTF.setBounds(35, 343, 220, 27);
        WsL.setBounds(285, 320, 100, 20);
        WsTF.setBounds(285, 343, 220, 27);
        WarnMSG.setBounds(120, 385, 330, 20);
        
        DetailsP.add(TitleL);
        DetailsP.add(ExamL);
        DetailsP.add(ExamTF);
        DetailsP.add(SnoL);
        DetailsP.add(SnoTF);
        DetailsP.add(NameL);
        DetailsP.add(NameTF);
        DetailsP.add(SubL);
        DetailsP.add(AdJavaL);
        DetailsP.add(AdJavaTF);
        DetailsP.add(CSharpL);
        DetailsP.add(CSharpTF);
        DetailsP.add(SeoL);
        DetailsP.add(SeoTF);
        DetailsP.add(WsL);
        DetailsP.add(WsTF);
        DetailsP.add(WarnMSG);
        
        // add JPanels into CardP
        CardP.add(DetailsP, "Details_Form");
        CardP.add(MarkSheetP, "MarkSheet");
        
        // add JPanel and JButton into JApplet
        add(CardP, BorderLayout.CENTER);
        add(GresultB, BorderLayout.SOUTH);
        
        // setText of Examination TF
        ExamTF.setText("SEE - 2022");
        ExamTF.setEditable(false);
        
        /* *********************** Event Start from here ************************** */
        
        // Event for only numbers allowence  
        AdJavaTF.addKeyListener(new KeyAdapter() {
            
            @Override
            public void keyTyped(KeyEvent e) {
                WarnMSG.setText("");
                if(!(AdJavaTF.getText().matches("[0-9]*")))
                {
                    AdJavaTF.setText("");
                    WarnMSG.setText("Only Numbers Allowed !");
                }
            }
        });
        
        AdJavaTF.addFocusListener(new FocusAdapter() {
            
            @Override
            public void focusLost(FocusEvent e) {
                if(!(AdJavaTF.getText().equals("")))
                {
                    if(Integer.parseInt(AdJavaTF.getText()) > 100)
                    {
                        WarnMSG.setText("Java's Marks can't be above 100 !");
                    }
                }
            }
        });
        
        CSharpTF.addKeyListener(new KeyAdapter() {
            
            @Override
            public void keyTyped(KeyEvent e) {
                WarnMSG.setText("");
                if(!(CSharpTF.getText().matches("[0-9]*")))
                {
                    CSharpTF.setText("");
                    WarnMSG.setText("Only Numbers Allowed !");
                }
            }
        });
        
        CSharpTF.addFocusListener(new FocusAdapter() {
            
            @Override
            public void focusLost(FocusEvent e) {
                if(!(CSharpTF.getText().equals("")))
                {
                    if(Integer.parseInt(CSharpTF.getText()) > 100)
                    {
                        WarnMSG.setText("C#.NET's Marks can't be above 100 !");
                    }
                }
            }
        });
        
        SeoTF.addKeyListener(new KeyAdapter() {
            
            @Override
            public void keyTyped(KeyEvent e) {
                WarnMSG.setText("");
                if(!(SeoTF.getText().matches("[0-9]*")))
                {
                    SeoTF.setText("");
                    WarnMSG.setText("Only Numbers Allowed !");
                }
            }
        });
        
        SeoTF.addFocusListener(new FocusAdapter() {
            
            @Override
            public void focusLost(FocusEvent e) {
                if(!(SeoTF.getText().equals("")))
                {
                    if(Integer.parseInt(SeoTF.getText()) > 100)
                    {
                        WarnMSG.setText("SEO's Marks can't be above 100 !");
                    }
                }
            }
        });
        
        WsTF.addKeyListener(new KeyAdapter() {
            
            @Override
            public void keyTyped(KeyEvent e) {
                WarnMSG.setText("");
                if(!(WsTF.getText().matches("[0-9]*")))
                {
                    WsTF.setText("");
                    WarnMSG.setText("Only Numbers Allowed !");
                }
            }
        });
        
        WsTF.addFocusListener(new FocusAdapter() {
            
            @Override
            public void focusLost(FocusEvent e) {
                if(!(WsTF.getText().equals("")))
                {
                    if(Integer.parseInt(WsTF.getText()) > 100)
                    {
                        WarnMSG.setText("WS's Marks can't be above 100 !");
                    }
                }
            }
        });
        
        GresultB.addActionListener((e) -> {
            
            // Set Formation of Titles
            MTitle.setForeground(Color.BLUE);
            MSub.setForeground(Color.ORANGE);
            MRS.setForeground(Color.GREEN);
            
            // Set Bounds of Controls
            MTitle.setBounds(160, 30, 280, 20);
            MExam.setBounds(35, 80, 230, 20);
            MName.setBounds(35, 110, 330, 20);
            MSno.setBounds(35, 140, 330, 20);
            MSub.setBounds(35, 180, 330, 20);
            MAdJava.setBounds(35, 210, 230, 20);
            MCSharp.setBounds(35, 233, 330, 20);
            MSEO.setBounds(35, 253, 330, 20);
            MWS.setBounds(35, 273, 330, 20);
            MRS.setBounds(35, 305, 330, 20);
            MTot.setBounds(35, 335, 330, 20);
            MPer.setBounds(35, 360, 330, 20);
            
            // add Controls 
            MarkSheetP.add(MTitle);
            MarkSheetP.add(MExam);
            MarkSheetP.add(MName);
            MarkSheetP.add(MSno);
            MarkSheetP.add(MSub);
            MarkSheetP.add(MAdJava);
            MarkSheetP.add(MCSharp);
            MarkSheetP.add(MSEO);
            MarkSheetP.add(MWS);
            MarkSheetP.add(MRS);
            MarkSheetP.add(MTot);
            MarkSheetP.add(MPer);
            
            // set Result
            if(!(SnoTF.getText().equals("") && NameTF.getText().equals("") && AdJavaTF.getText().equals("")
                    && CSharpTF.getText().equals("") && SeoTF.getText().equals("") && WsTF.getText().equals(""))
                    && WarnMSG.getText().equals(""))
            {
                int AJava = Integer.parseInt(AdJavaTF.getText()), 
                        CS = Integer.parseInt(CSharpTF.getText()), 
                        SEO = Integer.parseInt(SeoTF.getText()), 
                        WS = Integer.parseInt(WsTF.getText()), 
                        TOT = AJava + CS + SEO + WS;
                double Per = TOT / 4;
                
                MName.setText(MName.getText()+NameTF.getText());
                MSno.setText(MSno.getText()+SnoTF.getText());
                MAdJava.setText(MAdJava.getText()+AdJavaTF.getText());
                MCSharp.setText(MCSharp.getText()+CSharpTF.getText());
                MSEO.setText(MSEO.getText()+SeoTF.getText());
                MWS.setText(MWS.getText()+WsTF.getText());
                MTot.setText(MTot.getText()+TOT);
                MPer.setText(MPer.getText()+Per+" %");
                CardLyo.show(CardP, "MarkSheet");
            }
            else
            {
                WarnMSG.setText("All Fields are Required !");
            }
        });
    }
}
