/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import javax.swing.JFrame;

/**
 *
 * @author prema
 */
public class Macheads {
    public static void create()
    {
        JFrame f = new JFrame();
        
        second s = new second();
        //Random1 rand = new Random1();
        f.add(s);
        //f.add(rand);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,500);
    }
    public void end()
    {
       Score c =new Score();
    }
    //void setVisible(boolean b) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    
}
