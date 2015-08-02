import java.applet.*;
import java.net.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.util.*;

public class server {
	static Vector v1;
	static int i=0;
	 BufferedReader br;
	 PrintWriter pw;
	public static  void main(String l[]){
		try{
			v1=new Vector();
			ServerSocket ss=new ServerSocket(20);
			while(true){
				System.out.println("waiting...");
				 Socket s = ss.accept();
		         System.out.println(s);
		         v1.add(s);
//		       mythread m1 = new mythread(s);
//		          m1.start();
			}
			
		}catch(Exception z){}
	}
		static void send(Socket cl,String msg)
		{
		try {
		         PrintWriter pw;   
		         pw = new PrintWriter(cl.getOutputStream());
		         pw.println(msg);
		         pw.flush(); 
		      }
		 catch (Exception e){ }
		}
		
	}
