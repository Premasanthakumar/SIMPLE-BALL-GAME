/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
import java.awt.*;
import java.swing.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.Random;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
//import static javaapplication2.second.i;
import javax.swing.JPanel;
import javax.swing.Timer;
/**
 *
 * @author prema
 */
public class second extends JPanel  implements ActionListener,KeyListener
{
    int n=0,m=0;
   int z; 
    int width = randomPixel();
           int height = randomPixel();
          double x1 = 0;
         double y1 = 0;
         double x2 = 20;
         double y2 = 100; 
         double x3[] = new double[30];
         double y3[] = new double[30];
    Random generator = new Random();
   
    double x=0,y=0,velx=0,vely=0;
    int score=0;
    Timer t = new Timer(5,this);
    public second()
    {
         for(z=1;z<30;z++)
    {
        x3[z]= Math.random();
        y3[z] =  Math.random();
    }
        t.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        //xr = generator.nextInt(100);
        //yr = generator.nextInt(200);
        //hr = generator.nextInt(200);
        //wr = generator.nextInt(100);    
    }
     public void paint(Graphics g)
    {
         super.paint(g);   
           Graphics2D g2 = (Graphics2D) g;
           //Thread t1 = new Thread();
         //try {
           // t1.(4);
        //} catch (InterruptedException ex) {
            //Logger.getLogger(second.class.getName()).log(Level.SEVERE, null, ex);
          //   }  ;
          t.setDelay(10);
         g2.fill(new Ellipse2D.Double(x,y,40,40));
        
        draw(g);
        String s = Integer.toString(score);
        Font font=new Font("Serif",Font.BOLD,32);
        g.setFont(font);
        g.setColor(Color.black);
        g.drawString(s, getWidth()-50+2, 350+2);
        
        g.setColor(Color.magenta);
        g.drawString(s, getWidth()-50, 350);
            
            //int x1 = (int)(Math.random()*200);
            //int y1 =(int)(Math.random()*300);
        
       
             }
    
                // int numOfRect = 10000;
    //int height;
    //int width;
    //int x;
    //int y;
    //Random generator = new Random();
        //width = generator.nextInt(3);
        //height = generator.nextInt(1);
        //x = generator.nextInt(100);
      //  y = generator.nextInt(400);
    //g.setColor(new Color(generator.nextInt(256),generator.nextInt(256),generator.nextInt(256)));
    //G.drawRect(x,     y, width, height);
      //   g          2.fill(new Rectangle2D.Double((int)Math.random()*200,(int)Math.random()*600,(int)Math.random()*40,(int)Math.random()*40));
      void draw(Graphics g)
      {
         //Timer t3 = new Timer(90,this)
         
         
        //setPreferredSize(new Dimension(width,height));
          // setOpaque(false);
       Graphics2D g2 = (Graphics2D) g;
       //g2.timer = new Timer(90,this);
       g2.fill(new Rectangle2D.Double(0,0,20,500));
       g2.fill(new Rectangle2D.Double(350,0,20,500));
       g2.fill(new Rectangle2D.Double(0,500,400,20));
       //g2.fill(new Rectangle2D.Double(500,400,400,20));
       //for(z=1;z<30;z++)
      // {
           //double r = x[z];
          // int d = y[z];
         // x1 = generator.nextInt(500);
          //y1 = generator.nextInt(500);
          //for(z=1;z<5;z++)
       g2.fill(new Rectangle2D.Double(50,0,10,150));
       g2.fill(new Rectangle2D.Double(500,10,10,400));
       g2.fill(new Rectangle2D.Double(150,0,10,300));
       g2.fill(new Rectangle2D.Double(500,50,10,200));
       g2.fill(new Rectangle2D.Double(250,0,10,400));
       g2.fill(new Rectangle2D.Double(500,100,10,400));     
       //g2.fill(new Rectangle2D.Double(x3[m],y3[n],20,100));
       }
    public int randomPixel()
    {
        int pix = (int)(Math.random()*400);
        return pix;
    }
    public void check()
    {
        if(((x+velx)==50)&&((x+velx)==100)&&((x+velx)==150)&&((x+velx)==200)&&((x+velx)==250)&&((x+velx)==300))

        {
            Score s = new Score();
        }}
    public void actionPerformed(ActionEvent e)
    {
       // score++;
        if(( x + velx >= 300))
        {
            x +=velx;
            x = 400;
            m++;
           // x2 = (int) (x1 + Math.random());
            //x1 += x2;
             //x = x1;
        }
        else
        {
            if((x+velx)==x1)
            {
                x = velx;
            }
            else{x+=velx;}}
            //if ((x+velx  == 10)||(x+velx==13)||(x+velx==20)||(x+velx==40)&&(x+velx==50))
        if(((y + vely) >= 500))
        {
            y +=vely;
            y=500;
            
        }
        else
        {
            if((y + vely)==y1)
            {
                y = vely;
            }
            //if(((y+vely)==10)&&((y+vely)==200)&&((y+vely)==50)&&((y+vely)==90))
            //{
              //  y = 0;
            //}
            //else
            //{
              //  n++;
            else{ y += vely;
            //y1 += y2;
            } }
        repaint();
    }
    public void up()
    {
        vely = -1.5;
        velx = 0;
        //z = (int)Math.random()*20;
        //l = (int)Math.random()*10;
    }
    public void down()
    {
        vely = 1.5;
        velx = 0;
        //z = (int)Math.random()*20;
        //l = (int)Math.random()*10;
    }
    public void left()
    {
        velx = -1.5;
        vely = 0;
        //z = (int)Math.random()*20;
        //l = (int)Math.random()*10;
    }
    public void right()
    {
        velx = 1.5;
        vely = 0;
        //z = (int)Math.random()*20;
        //l = (int)Math.random()*10;
    }
    public void keyPressed(KeyEvent e)
    {
        score++;
        int code = e.getKeyCode();
        if(code == KeyEvent.VK_UP)
        {up();}
        if(code == KeyEvent.VK_DOWN)
        {down();}
        if(code == KeyEvent.VK_LEFT)
        {left();
        check();}
        if(code == KeyEvent.VK_RIGHT)
        {right();}
    }
public void keyTyped(KeyEvent e){}
public void keyReleased(KeyEvent e){
     int code = e.getKeyCode();
    if((code != KeyEvent.VK_DOWN)&&(code != KeyEvent.VK_LEFT)&&(code != KeyEvent.VK_RIGHT))
    {
       x = velx;    
       Score s = new Score();
       System.exit(0);
    }
}
   // private static class i {

     //   public i() {
       // }
    }


