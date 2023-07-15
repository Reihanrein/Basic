/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author ACER
 */
public class Demogui2 extends JFrame {
    JPanel jp = new JPanel();
    JTextField jt = new JTextField();
    JLabel jl = new JLabel("Contoh Label");
    
    public Demogui2(){
        add(jl);
        add(jt);
        add(jp);
        jl.setBounds(15,20,80,25);
        jt.setBounds(120, 20, 80, 25);
    }
    
    public static void main(String[] args) {
        Demogui2 demo2 = new Demogui2();
        demo2.setTitle("form dengan label dan textfield");
        demo2.setSize(300,300);
        demo2.setVisible(true);
    }
}
