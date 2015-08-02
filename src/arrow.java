import java.applet.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URL;
public class arrow extends Applet  implements MouseListener ,MouseMotionListener,KeyListener,ActionListener,Runnable{
	Image p1,p2,p3,p4;
	int x=0;
	int y=45;
	int xa[]=new int [11];
	int ya[]=new int [11];
	AudioClip clip;
JButton b1;
Thread t1;
	public void init(){
//	Toolkit tk=Toolkit.getDefaultToolkit();
		setSize(2000,1000);
		Font f=new Font("Arial",Font.BOLD,20);
		setFont(f);
		clip=getAudioClip(getCodeBase(),"start.au");
		p2=getImage(getDocumentBase(),"teer.png");
		p1=getImage(getDocumentBase(),"co.jpg");
		p4=getImage(getDocumentBase(),"jai.png");
		p3=getImage(getDocumentBase(),"tar.png");
		addMouseListener(this);
		addMouseMotionListener(this);
		addKeyListener(this);
		clip.loop();
		t1=new Thread();
		t1.start();
	}
	public void run(){
		repaint();
	}
	
	int var=10;
	String sc="";
	int y3=-50;
	int score=0;
	int flag1[]=new int [12];
	int flags[]=new int [12];
	int ch=4,i;
	int miss=0;
public void paint(Graphics arg0){
	String Arrow="ARROWS::"+var;
	arg0.drawImage(p1,0,0,1370,770,this);
	arg0.setColor(Color.white);
	arg0.drawString("SCORE:::"+score, 30, 20);
	arg0.drawString("MISSES:::"+miss,500,20);
	arg0.drawString("Location::"+sc,650,20);
	arg0.drawString(Arrow,200,20);
	arg0.drawImage(p3,1290,y3,100,200,this);
	arg0.drawImage(p2,10,y,100,150,this);
for(i=0;i<c;i++){
	arg0.drawImage(p4,xa[i]+30,ya[i]+52,110,10,this);
	if(ya[i]>=y3-50&&ya[i]<=y3&&xa[i]>=1160&&xa[i]<=1250&&flags[i]==0)
	{
		score+=25;
		sc="OUTER";
		flags[i]=1;
		flag1[i]=1;
		play(getCodeBase(),"hit.au");
	}else 
	if(ya[i]>=y3&&ya[i]<=y3+50&&xa[i]>=1150&&xa[i]<=1250&&flags[i]==0)
	{
	score+=100;
	sc="CENTER";
	flags[i]=1;
	flag1[i]=1;
	xa[i]+=5;
	play(getCodeBase(),"hit.au");
	}
	else
	if(ya[i]>=y3+50&&ya[i]<=y3+100&&xa[i]>=1150&&xa[i]<=1250&&flags[i]==0)
	{score+=100;
	sc="CENTER";
	flags[i]=1;
	flag1[i]=1;
	xa[i]+=5;
	play(getCodeBase(),"hit.au");
	}
	else 
	if(ya[i]>=y3+100&&ya[i]<=y3+130&&xa[i]>=1170&&xa[i]<=1250&&flags[i]==0)
	{score+=25;
	flags[i]=1;
	flag1[i]=1;
	sc="OUTER";
	
	play(getCodeBase(),"hit.au");
	}
	else if(xa[i]>1250&&xa[i]<1300)
{miss++;
score-=50;					
}	if(flag1[i]==1)
		{
		ya[i]+=5;  //for the arrow to move with the target after hit
		}	

	if(flag1[i]==0)
	xa[i]+=75;    //for the x of arrow to inc. untill not hit
}
	y3+=5;
	if(y3==700)
		{y3=0;
		y=0; }
	
	try{
		Thread.sleep(100);
	}
	catch(Exception d){}	
	repaint();
}

public void update(Graphics g)
{
     paint(g);
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
	private Object appletCloseURL;
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		play(getCodeBase(),"fire.AU");	
		flag=1;flags[c]=0;
		flag1[c]=0;
		xa[c]=60;
		ya[c]=y;
		c++;
		var--;
		var1++;
		if(var1>10){
//			applet.getAppletContext().showDocument(appletCloseURL);	
			new result(score).setVisible(true);
			super.setVisible(false);
	}	}
	
//	public static void main(String fd[])
//	{
//		new arrow().setVisible(true);
//	}
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
//		setVisible(true);
//		repaint();
		
	}
}
