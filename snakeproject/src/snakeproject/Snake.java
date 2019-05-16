package snakeproject;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;
public class Snake  extends Canvas  implements KeyListener {
	
	int l=390,m=100,c=0 ,v=7;
	int body;
	Graphics g;
	boolean left=false,right=false,up=false,down=false;
	public JFrame f;
	int x[];
	int y[];
	int r,p=100,q=100,score;
	boolean visible=true,visi1=false,visi2=false,visi3=false,visi4=false;
	Snake(int k)
	{
		
		x=new int[150];
	y=new int [150];
	 f=new JFrame();
	f.setSize(700,500);
	f.setVisible(true);
	
      this.setSize(700,400);
     this.setVisible(true);
	f.addKeyListener(this);
	this.setBackground(Color.cyan);
	f.add(this);

init();
	while(true)
	{
		mov();
		move();
		
	repaint();
		
		
		
		collision();
		try{
			Thread.sleep(k);
		}
		catch(Exception e){}
		
		
	}
		
	}
	
	
	public void init()
	{
		body=4;
		int j,k;
		for(int i=0;i<body;i++)
			
		{
			if(i==1)
             x[i]=l-i*4;
			else
			x[i]=l-i*4;
			if(i==0)
				y[i]=m;
			else
			y[i]=m;
			
			
		}
		
		
	}
	public void mov()
	{
		for(int i=body-1;i>=0;i--)
		{
			x[i+1]=x[i];
			y[i+1]=y[i];
		
		}
		if(visible)
			if(x[0]<700)
		x[0]+=4;
			else
				x[0]=0;
		
		else if(c==1)
			if(x[0]<700)
			x[0]+=4;
			else
				x[0]=0;
		else if(c==2)
			if(x[0]>0)
		x[0]-=4;
			else
				x[0]=700;
		else if(c==3)
			if(y[0]>0)
		y[0]-=4;
			else
				y[0]=500;
		else if(c==4)
			if(y[0]<500)
				
			y[0]+=4;
			else
				y[0]=0;
		
		
	}
	
	public void move()
	{ 
		
	/*	for(int i=body;i>=0;i--)
		{
			x[i+1]=x[i];
			y[i+1]=y[i];
		
		}*/
	
			
			
		if(right){
			
			if(x[0]<700)
		     x[0]+=4;
			else
				x[0]=10;}
				
		else if(left)
			
			if(x[0]>0)
			x[0]-=4;
			else
				x[0]=700;
		else if(down)
		
			if(y[0]<500)
			
			y[0]+=4;
			else
				y[0]=10;
		else if(up)
			if(y[0]>0)
			y[0]-=4;
			else
				y[0]=490;
}
		
		
		
	
	public void collision()
	{
			
		for(int i=body;i>0;i--)
			if((x[0]==x[i])&&(y[0]==y[i]))
			{ String s=Integer.toString(score);
			new audio(2);
				JOptionPane.showMessageDialog(null, " You meet the body ...try again !!!  " + "your score is  "  + s);
				System.exit(0);
				}
		
		}
	



	public void paint(Graphics g)
	{ 
		
		for(int i=0;i<body;i++)
		{
			if(i==0)
				g.fillOval(x[i], y[i], 6, 6);
			else
			g.fillOval(x[i], y[i], 4, 4);
		}
			g.fillOval(p, q, 6, 6);
			
			if(((x[0]==p-1)||(x[0]==p+1)||(x[0]==p)||(x[0]==p-2)||(x[0]==p+2) ||(x[0]==p-3)||(x[0]==p+3))
					&&((q==y[0])||(q-1==y[0])||(q+1==y[0]) ||(q-2==y[0])||(q+2==y[0])||(q-3==y[0])||(q+3==y[0]) ))
			{
			body++;
			new audio('j');
				p=getx();
				q=gety();
				score++;
				}
			
			String s=Integer.toString(score);
			g.drawString(s, 600, 10);
	}
	
	
public void keyPressed(KeyEvent e) {
	int k=e.getKeyCode();
	switch(k)
	{
	case KeyEvent.VK_RIGHT:
		
		c=0;right=true;
		visible=false;
		visi1=false;
		break;
	case KeyEvent.VK_LEFT:
		c=0;
		left=true;
		visi2=false;
		visible=false;
	
		break;
	case KeyEvent.VK_UP:
		c=0;
		up=true;
		
		visi3=false;
		visible=false;
		
		break;
	case KeyEvent.VK_DOWN:
visible=false;
c=0;
      down=true;
      
		
	
		break;
	}
	
}
@Override
public void keyReleased(KeyEvent e) {
	int k=e.getKeyCode();
	switch(k)
	{
	case KeyEvent.VK_RIGHT:
		c=1;
visi1=true;
		right=false;
		break;
	case KeyEvent.VK_LEFT:
		left=false;
		visi2=true;
		c=2;
		break;
	case KeyEvent.VK_UP:
		up=false;
		visi3=true;
		c=3;
		break;
	case KeyEvent.VK_DOWN:

      down=false;
		visi4=true;
		c=4;
		break;
	}
	}
@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}

public int getx()
{
	Random gen=new Random();
	int l=gen.nextInt(700);
	return(l);
	}

public int gety()
{
	Random gen=new Random();
	int l =gen.nextInt(400);
	return(l);
	}




public static void main(String[] args) {
	Snake ref=new Snake(30);
	
}
}

