package jassignment_2.pkg1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Assignment_4 extends JApplet 
{    
    public void init() 
    {
        setLayout(new GridBagLayout());
        GridBagConstraints c=new GridBagConstraints();
        
        c.gridx=0;
        c.gridy=0;
        c.weightx=0.5;
        c.weighty=0.5;
        add(new JLabel("name"),c);
     
        c.gridx=1;
        c.gridy=0;
        add(new JTextField(20),c);
        
        c.gridx=0;
        c.gridy=1;
        add(new JLabel("Address"),c);
        
        c.gridx=1;
        c.gridy=1;
        add(new JTextField(20),c);
        
        c.gridx=0;
        c.gridy=2;
        add(new JLabel("qualification"),c);
        
        c.gridx=1;
        c.gridy=2;
        String[] qua={"select one","BCA","B.SC","BBA","B.TECH","B.COM","MBA","MCA","M.TECH","M.COM"};
        JComboBox q=new JComboBox(qua);
        add(q,c);
        
        c.gridx=0;
        c.gridy=3;
        add(new JLabel("phone number"),c);
        
        c.gridx=1;
        c.gridy=3;
        add(new JTextField(20),c);
        
        c.gridx=0;
        c.gridy=4;
        add(new JLabel("email id"),c);
        
        c.gridx=1;
        c.gridy=4;
        add(new JTextField(20),c);
        
        c.gridx=0;
        c.gridy=5;
        add(new JLabel("experience(u/m)"),c);
        
        c.gridx=1;
        c.gridy=5;
        add(new JTextField(20),c);
        
        c.gridx=2;
        c.gridy=5;
        add(new JLabel("years"),c);
        
        c.gridx=3;
        c.gridy=5;
        add(new JTextField(10),c);
        
        c.gridx=4;
        c.gridy=5;
        add(new JLabel("month"),c);
        
        c.gridx=0;
        c.gridy=6;
        add(new JLabel("platform"),c);
        
        c.gridx=1;
        c.gridy=6;
        String[] s1={"select one","project manager","employee","manager"};
        JComboBox c1=new JComboBox(s1);
        add(c1,c);
        
        c.gridx=0;
        c.gridy=7;
        add(new JLabel("date of birth"),c);
        
        String[] month={"January","February","March","April","May","June","July","August","September","October","November","December"};
        
        String[] date=new String[31];
        for(int i=0;i<31;i++)
        {
            date[i]=Integer.toString(i+1);
        }

        String[] year=new String[100];
        int yr=1923;
        for(int i=0;i<100;i++)
        {
            year[i]=Integer.toString(yr);
            yr=yr+1;
        }

        JComboBox m1=new JComboBox(month);
        JComboBox d1=new JComboBox(date);
        JComboBox y1=new JComboBox(year);
        
        c.gridx=1;
        c.gridy=7;
        add(m1,c);
        
        c.gridx=2;
        c.gridy=7;
        add(d1,c);
        
        c.gridx=3;
        c.gridy=7;
        add(y1,c);
        
        c.gridx=0;
        c.gridy=8;
        add(new JLabel("gender"),c);
        
        JRadioButton male=new JRadioButton("male");
        JRadioButton female=new JRadioButton("female");
        ButtonGroup bg=new ButtonGroup();
        
        c.gridx=1;
        c.gridy=8;
     //   add(bg.male,c);
        add(male,c);
        
        c.gridx=2;
        c.gridy=8;
        //add(bg.female,c);
        add(female,c);
        //add(bg,c);
        
        c.gridx=0;
        c.gridy=9;
        c.fill=1;
        c.weightx=1;
        add(new JButton("submit"),c);
        
    }
}