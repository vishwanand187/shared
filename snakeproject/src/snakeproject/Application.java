package snakeproject;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.PopupMenu;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.security.acl.Group;

import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;
public class Application extends Canvas  implements MouseListener{
	JFrame  f,f1,f2,f3;
	JButton b1,b3,b4;
	JButton b2;
	JLabel j;
	int k,c=1;
	Thread h;
	Application()
	{
		
		f1=new JFrame();
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
		if(c==1)
		new audio();
	//	this.addMouseMotionListener(null);
		
	}
public void mouseClicked(MouseEvent e) {
		
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getX()>=300 &&e.getX()<=528 &&e.getY()>=300&&e.getY()<=521)
		{
			new audio("ff");
		
			f1.dispose();
			th4 ref=new th4();
			Thread t=new Thread(ref);
			t.start();
			
		}
			else	if(e.getX()>=800&&e.getX()<=1025&&e.getY()>=300&&e.getY()<=525)
			{
				new audio("dffg");
				f1.dispose();
				JOptionPane.showMessageDialog(null, "are u surely want to exit????");


				System.exit(0);
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
		
		
		Image i1=t.getImage("images/play1.jpg");
		Image i2=t.getImage("images/exit.png");
		
		g.drawImage(i, 0, 0, 1380, 800,this);
		g.drawString( "A AMAZING GAME CREATED BY:" ,70,100);
		g.drawString("VISHWANAND PATEL",250,130);
		g.drawImage(i1, 300,300,this);
		g.drawImage(i2, 800,300,this);
	}
	public static void main(String[] args) {
		new Application();
	}
}

class th4 implements Runnable
{
th4()
{}
	@Override
	public void run() {
new gh();
		
	}
	}
