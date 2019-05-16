package snakeproject;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.*;
public class snhard extends Canvas implements KeyListener   {

	int body,x[],y[],score=0,l=330,m=0,p,q,c;
	boolean left,right,up,down,visible=true;
	snhard(int k)
	{
		x=new int[90];
		y=new int[90];
		JFrame f=new JFrame();
		f.setSize(700,500);
	//	f.setLayout(null);
		
		
		JPanel p1=new JPanel();
		p1.setBackground(Color.blue);
		p1.setBounds(0, 0, 300, 30);
		p1.setVisible(true);
		f.add(p1);
		
		JPanel p6=new JPanel();
		p6.setBackground(Color.blue);
		p6.setBounds(400, 0, 300, 30);
		p6.setVisible(true);
		f.add(p6);
		
		JPanel p2=new JPanel();
		p2.setBackground(Color.blue);
		p2.setBounds(0, 30, 30, 150);
		p2.setVisible(true);
		f.add(p2);
		
		JPanel p3=new JPanel();
		p3.setBackground(Color.blue);
		p3.setBounds(0, 280, 30, 150);
		p3.setVisible(true);
		f.add(p3);
		
		JPanel p4=new JPanel();
		p4.setBackground(Color.blue);
		p4.setBounds(0, 430, 300, 30);
		p4.setVisible(true);
		f.add(p4);
		
		JPanel p5=new JPanel();
		p5.setBackground(Color.blue);
		p5.setBounds(400, 430, 300, 30);
		p5.setVisible(true);
		f.add(p5);
		
		JPanel p8=new JPanel();
		p8.setBackground(Color.blue);
		p8.setBounds(660, 0, 30, 150);
		p8.setVisible(true);
		f.add(p8);
		
		JPanel p9=new JPanel();
		p9.setBackground(Color.blue);
		p9.setBounds(660, 280, 30, 150);
		p9.setVisible(true);
		f.add(p9);
		
		/*JPanel p7=new JPanel();
		p7.setBackground(Color.black);
		p7.setBounds(400, 430, 300, 30);
		p7.setVisible(true);
		f.add(p7);*/
		
		JPanel p10=new JPanel();
		p10.setBackground(Color.blue);
		p10.setBounds(100, 100, 500, 30);
		p10.setVisible(true);
		f.add(p10);
		
		JPanel p11=new JPanel();
		p11.setBackground(Color.blue);
		p11.setBounds(300, 180, 100, 100);
		p11.setVisible(true);
		f.add(p11);
		
		
		JPanel p12=new JPanel();
		p12.setBackground(Color.blue);
		p12.setBounds(100, 330, 500, 30);
		p12.setVisible(true);
		f.add(p12);
		
		
		f.addKeyListener(this);
		//this.setBackground(Color.gray);
		f.add(this);
		f.setVisible(true);
		this.setBackground(Color.cyan);
		init();
		while(true)
		{
			mov();
			move();
			collision();
			repaint();
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
             x[i]=l-i*6;
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
			if(y[0]<500)
		y[0]+=4;
			else
				y[0]=0;
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
		
		if((x[0]<300&&(y[0]<30||y[0]>430))||(x[0]>400&&(y[0]<30||y[0]>430))||
				(y[0]<180&&(x[0]<30||x[0]>657))||(y[0]>280&&(x[0]<30||x[0]>657))
				||((x[0]>100&&x[0]<600)&&(y[0]>97&&y[0]<130))||(x[0]>100&&x[0]<600&&y[0]>327&&y[0]<360)||
				(x[0]>300&&x[0]<400&&y[0]>177&&y[0]<280)){
			String s=Integer.toString(score);
			new audio(2);
			JOptionPane.showMessageDialog(null, "You meet the wall ..."+"try again !!!      " +
					"your score is .."  +s);
			
			try{
				Thread.sleep(50);
			}
			catch(Exception e){}
		System.exit(0);}
		
		
		for(int i=body;i>0;i--){
			
			if((x[0]==x[i])&&(y[0]==y[i]))
			{String s=Integer.toString(score);
			new audio(2);
				JOptionPane.showMessageDialog(null,"you meet the body..." +"try again !!!" +
						"your score is.." +s  );
				System.exit(0);
				}
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
		 if(!((p<305&&(q<35||q>425))||(p>395&&(q<35||q>425))||
					(q<185&&(p<35||p>655))||(q>285&&(p<35||p>655))
					||(p>80&&p<620&&q>80&&q<150)||(p>80&&p<620&&q>310&&p<380)||
					(p>280&&p<420&&q>160&&q<300)))
			g.fillOval(p, q, 6, 6);
		 else
		 {
			 p=getx();
				q=gety();
		 }
			if(((x[0]==p-1)||(x[0]==p+1)||(x[0]==p)||(x[0]==p-2)||(x[0]==p+2) ||(x[0]==p-3)||(x[0]==p+3))
					&&((q==y[0])||(q-1==y[0])||(q+1==y[0]) ||(q-2==y[0])||(q+2==y[0])||(q-3==y[0])||(q+3==y[0]) ))
			{
			body++;
	     	new	audio('g');
				p=getx();
				q=gety();
				score++;
				}
			
			String s=Integer.toString(score);
			g.drawString(s, 600, 100);
	}
	
	
public void keyPressed(KeyEvent e) {
	int k=e.getKeyCode();
	switch(k)
	{
	case KeyEvent.VK_RIGHT:
		visible=false;
		c=0;
		right=true;
		break;
	case KeyEvent.VK_LEFT:
		visible=false;
		c=0;
		left=true;
	    break;
	case KeyEvent.VK_UP:
		visible=false;
		c=0;
		up=true;
	  break;
	case KeyEvent.VK_DOWN:  
        c=0;
        visible=false;
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
       right=false;
		break;
	case KeyEvent.VK_LEFT:
		c=2;
		left=false;
        break;
	case KeyEvent.VK_UP:
		c=3;
		up=false;
	    break;
	case KeyEvent.VK_DOWN:
        c=4;
      down=false;
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

	int l=gen.nextInt(600);
	return(l);
	}

public int gety()
{
	Random gen=new Random();
	int l =gen.nextInt(400);
	return(l);
	}



	public static void main(String[] args) {
		new snhard(20);
	}
}
