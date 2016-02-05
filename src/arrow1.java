import java.applet.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URL;


public class arrow1 extends JFrame implements MouseListener ,MouseMotionListener,KeyListener,ActionListener{
	Image p1,p2,p3,p4;
	int x=0;
	int y=45;
	Socket cs;
	BufferedReader br;
	PrintWriter pw;
	int xa[]=new int [11];
	int ya[]=new int [11];
	AudioClip clip;
JButton b1;
	arrow1(){
	Toolkit tk=Toolkit.getDefaultToolkit();
	setSize(2000,1000);
	p1=tk.getImage("D:\\android\\1project\\bin\\co.jpg");
	p2=tk.getImage("D:\\android\\1project\\bin\\teer.png");
	p3=tk.getImage("D:\\android\\1project\\bin\\tar.png");
	p4=tk.getImage("D:\\android\\1project\\bin\\jai.png");
	Font f=new Font("Arial",Font.BOLD,20);
		setFont(f);
		addMouseListener(this);
		addMouseMotionListener(this);
		addKeyListener(this);
	}
	int var=10;
	String sc="";
	int y3=-50;
	int score=0;
	int flag1[]=new int [12];
	int flags[]=new int [12];
	int miss=0;
	int ch=4,i;
public void paint(Graphics arg0){
	String Arrow="ARROWS::"+var;
	arg0.drawImage(p1,0,30,1370,770,this);
	arg0.setColor(Color.white);
	arg0.drawString("SCORE:::"+score, 40, 50);
	arg0.drawString("Location::"+sc,650,50);
	arg0.drawString(Arrow,200,50);
	arg0.drawString("MISSES:::"+miss,500,50);
	arg0.drawImage(p3,1000,y3,100,200,this);
	arg0.drawImage(p2,500,y,100,150,this);
for(i=0;i<c;i++){
	arg0.drawImage(p4,xa[i]+520,ya[i]+70,110,10,this);
	if(ya[i]>=y3-50&&ya[i]<=y3&&xa[i]>=370&&xa[i]<=450&&flags[i]==0)
	{	score+=25;
		sc="OUTER";
		flags[i]=1;
		flag1[i]=1;
	}else 
	if(ya[i]>=y3&&ya[i]<=y3+50&&xa[i]>=370&&xa[i]<=450&&flags[i]==0)
	{
	score+=100;
	sc="CENTER";
	flags[i]=1;
	flag1[i]=1;
	xa[i]+=5;
	}
	else
	if(ya[i]>=y3+50&&ya[i]<=y3+90&&xa[i]>=370&&xa[i]<=450&&flags[i]==0)
	{score+=100;
	sc="CENTER";
	flags[i]=1;
	flag1[i]=1;
	xa[i]+=5;
	}
	else 
	if(ya[i]>=y3+90&&ya[i]<=y3+120&&xa[i]>=370&&xa[i]<=450&&flags[i]==0)
	{score+=25;
	flags[i]=1;
	flag1[i]=1;
	sc="OUTER";
	Toolkit.getDefaultToolkit().beep();
	}	
	else if(xa[i]>450&&xa[i]<500)
	{miss++;
	score-=50;					
	}
	if(flag1[i]==1)
		{
		ya[i]+=5;  //for the arrow to move with the target after hit
		}	
	if(flag1[i]==0)
	xa[i]+=70;    //for the x of arrow to inc. untill not hit
	}
	y3+=5;
	if(y3==700)
		{y3=0;
		 }
	try{
		Thread.sleep(100);
	}
	catch(Exception d){}	
	repaint();
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
	int flag=0,c=0,var1=0;
	@Override
	public void mouseClicked(MouseEvent arg0) {
		flag=1;flags[c]=0;
		flag1[c]=0;
		xa[c]=60;
		ya[c]=y;
		c++;
		var--;
		var1++;
		if(var1>10){
			new result(score).setVisible(true);
			super.setVisible(false);
		}
	}	
	public static void main(String fd[])
	{
		new arrow1().setVisible(true);
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
public void mouseMoved(MouseEvent arg0) {
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
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
