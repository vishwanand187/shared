package snakeproject;
import java.awt.Canvas;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;
public class gh extends Canvas implements MouseListener {
int k,c=1;
JFrame f1;
boolean b=false;
	gh()
	{
		f1=new JFrame();
		//f1.setSize(400,400);
		 GraphicsEnvironment env=GraphicsEnvironment.getLocalGraphicsEnvironment();
			GraphicsDevice gd=env.getDefaultScreenDevice();
	    	f1.setUndecorated(true);
	      	f1.setResizable(false);
			gd.setFullScreenWindow(f1);
		f1.setLayout(new FlowLayout());
		f1.setVisible(true);
	    f1.add(this);
		this.setSize(1380,800);
	    this.setVisible(true);
		this.addMouseListener(this);
		new audio();
		//this.addMouseMotionListener(this);
	}
	
	
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
if(e.getX()>=200&&e.getX()<=307&&e.getY()>=40&&e.getY()<=147)
{
	new audio("dfd");
	new audio();
	k=50;
	c=1;
	b=true;
	repaint();
	}
else if(e.getX()>=200&&e.getX()<=307&&e.getY()>=300&&e.getY()<=406)
{
	new audio("hh");
	new audio();
	k=40;
	repaint();
	b=true;
	}
else if(e.getX()>=200&&e.getX()<=307&&e.getY()>=600&&e.getY()<=706)
{
	new audio("fg");
	new audio();
	//f1.dispose();
	k=25;
	repaint();
	b=true;
	}

    if(e.getX()>=1100&&e.getX()<=1225&&e.getY()>=40&&e.getY()<=165)
    {
    	new audio("f");
    	new audio();
    	//repaint();
    	try{
    		Thread.sleep(3000);
           th ref=new th(k);
    	Thread t=new Thread(ref);
    	f1.dispose();
        t.start();
    	}
    	catch(Exception i)
    	{}
    	
    }
    else if(e.getX()>=1100&&e.getX()<=1225&&e.getY()>=300&&e.getY()<=425)
    {
    	new audio("f");
    	new audio();
    	try{
    		Thread.sleep(3000);
    		f1.dispose();
    	th1 ref=new th1(k);
    	
    	Thread t=new Thread(ref);
    	f1.dispose();
    	t.start();
    	
    	}
    	catch(Exception g)
    	{}
    }    	
    else if(e.getX()>=1100&&e.getX()<=1225&&e.getY()>=600&&e.getY()<=725)
    {
    	
    	new audio("dfgf");
    	new audio();
    	f1.dispose();
    	try{
    		
    	Thread.sleep(3000);
         th2 ref=new th2(k);
    	Thread t=new Thread(ref);
    	f1.dispose();
    	t.start();
    	}
    	catch(Exception h)
    	{}
    }
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void paint (Graphics g)
	{
		
		Toolkit t=Toolkit.getDefaultToolkit();
		
		Image i=t.getImage("images/3.jpg");
		Image i1=t.getImage("images/level1.png");
		Image i2=t.getImage("images/level2.png");
		Image i3=t.getImage("images/level3.png");
		Image i4=t.getImage("images/easy.png");
		Image i5=t.getImage("images/medium.png");
		Image i6=t.getImage("images/hard.png");
	//	Image i7=t.getImage("C:\\Users\\win7\\Downloads\\q.jpg");
		//if(c==1)
			//g.drawImage(i7, 600, 500, this);	
		g.drawImage(i, 0, 0,1380,800, this);
		g.drawImage(i1, 200, 40, this);
		g.drawImage(i2, 200, 300, this);
		g.drawImage(i3, 200, 600, this);
		if(b){
		g.drawImage(i4, 1100, 40, this);
		g.drawImage(i5, 1100, 300, this);
		g.drawImage(i6, 1100, 600, this);
		}
		
		
	}
	
	public static void main(String[] args) {
		new gh();
	}
	
}


class th implements Runnable
{
int p;
th(int k)
{
this.p=k;
}
@Override
public void run() {

	new Snake(p);
}
}


class th1 implements Runnable
{
int p;
th1(int k)
{
	this.p=k;

}
@Override
public void run() {

	new snmedium(p);
}
}

class th2 implements Runnable
{
int p;
th2(int k)
{
this.p=k;
}
@Override
public void run() {

	new snhard(p);
}
}


