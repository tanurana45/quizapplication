package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
    
    JButton quiz, back;
    Login(){
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0, 600, 500);
        add(image);
        
        //heading design
        JLabel heading = new JLabel("SIMPLE MINDS");
        heading.setBounds(750, 70, 400, 50);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD,40));
        heading.setForeground(new Color(30, 144,254));
        add(heading);
        
        //enter your name box
        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD,20));
        name.setForeground(new Color(70, 80,250));
        add(name);
        
        //text field under the box
        JTextField tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Time New Roman",Font.BOLD,18));
        add(tfname);
        
        //rules botton
        quiz = new JButton("Quiz");
        quiz.setBounds(735, 270, 120, 25);
        quiz.setBackground(new Color(30, 144, 200));
        quiz.setForeground(Color.WHITE);
        quiz.addActionListener(this);
        add(quiz);
        
        //back botton
        back = new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(30, 144, 200));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1200, 500);
        setLocation(200,200);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== quiz){
            new quiz();
}
        else if(ae.getSource()== back){
            setVisible(false);
           
        }
    }
    public static void main(String[] args){
        new Login();
        
        
    }
}
