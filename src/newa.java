import java.applet.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.net.*;
public class newa extends JFrame implements MouseListener ,MouseMotionListener,KeyListener,ActionListener{
Toolkit tk;
Image p1,p2,p3,p4,p5;
	newa(){
		setSize(1500,1000);
		tk=Toolkit.getDefaultToolkit();
		p1=tk.getImage("D:\\android\\1project\\bin\\co.jpg");
		p2=tk.getImage("D:\\android\\1project\\bin\\teer.png");
		p3=tk.getImage("D:\\android\\1project\\bin\\tar.png");
		p4=tk.getImage("D:\\android\\1project\\bin\\jai.png");
		p5=tk.getImage("D:\\android\\1project\\bin\\co.jpg");
	}
	int x=10,y=45,y1=25,xa=300,ya;
	public void paint(Graphics g)
	{
		g.drawImage(p1,0,25,1400,700,this);
		g.drawImage(p2, 300, y,60,150, this);
		g.drawImage(p3, 1000, y1,50,200, this);
		g.drawImage(p4, 300, ya,60,8, this);
		y1+=5;
		ya=y+74;
		if(y1>700)
			y1=0;
			try{
			Thread.sleep(100);
		}
		catch(Exception e){}
		repaint();
		
	}

	public static void main(String s[]){
		new newa().setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent f) {
		// TODO Auto-generated method stub
		int code=f.getKeyCode();
		if(code==KeyEvent.VK_UP)
			y-=10;

		if(code==KeyEvent.VK_DOWN)
			y+=10;
	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

		ya=y;		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	

}