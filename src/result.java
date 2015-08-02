import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;

import javax.swing.*;
public class result extends JFrame implements ActionListener{
	Label l;
	JButton b1;
	JTextField t;
	JButton b2;
	int score;
	result(int s){
		setLayout(new FlowLayout());
		setSize(300,300);
		l=new Label("SCORE");
		t=new JTextField(20);
		b1=new JButton("next Round");
		b2=new JButton("replay");
		score=s;
		add(l);
		add(t);	
		if(score>500)
		add(b1);	
		else 
			add(b2);
	
		b2.addActionListener(this);
		b1.addActionListener(this);
	}
	public void paint(Graphics g){
		t.setText(score+"");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1){
		new arrow().setVisible(true);
		super.setVisible(false);}
		if(e.getSource()==b2)
		{
			new arrow().setVisible(true);
			super.setVisible(false);
		}
			
	}
	}

