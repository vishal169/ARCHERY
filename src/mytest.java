import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class global
{
Connection con;
ResultSet rs;
Statement stmt;
global()
{
 try { 
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con = DriverManager.getConnection("jdbc:odbc:gam");
stmt = con.createStatement();
}
catch(Exception e)
 {
   System.out.println(e.getMessage());
  }
}
ResultSet  execute(String s) throws Exception
{
rs = stmt.executeQuery(s);
return(rs);
}
void update(String s) throws Exception
{
stmt.executeUpdate(s);
}
}
class mytest
{
public static void main(String s[ ])
{
myframe f1 = new myframe(" USER AUTHENTICATION");
f1.setVisible(true);
  f1.setLocation(0,0);
  f1.setSize(1365,730);
}
}
class myframe extends JFrame implements ActionListener
{
JPasswordField t1;
JTextField t2;
JButton b1;
myframe(String s)
{
super(s);
Panel p1=new Panel();
setLayout(new BorderLayout());
t1 = new JPasswordField(10);
t2 = new JTextField(10);
b1= new JButton(" OK ");
ImageIcon c1 = new ImageIcon("image6.jpg");
JLabel m1 = new JLabel(c1);
JLabel m2 = new JLabel("  ----------------------------- ARCHERY GAME ----------------------------");
m2.setFont(new Font("Serif", Font.PLAIN, 40));
JLabel m3 = new JLabel("User Name  ");
JLabel m4 = new JLabel("Password  ");
add(m1,BorderLayout.WEST);
add(m2,BorderLayout.NORTH);
p1.add(m3);
p1.add(t2);
p1.add(m4);
p1.add(t1);
add(p1,BorderLayout.CENTER);
add(b1,BorderLayout.SOUTH);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
 {
 if(ae.getSource() == b1)
 {
   global g1 = new global();
   ResultSet rs=null;
try {
String ss="select * from login where username='"+ t2.getText()+"'     and password  ='"+t1.getText()+"' ";
System.out.println(ss);
rs = g1.execute(ss);
rs.next();
int n= rs.getRow();
if(n>0)
{
	JFrame.setDefaultLookAndFeelDecorated(true);
//		new arrow().setVisible(true);
        Runtime.getRuntime().exec("arrow.java");
	
 }
else
JOptionPane.showMessageDialog(null,  "I N V A L I D username or password");
}catch(Exception e) 
{ t2.setText(e.getMessage());}
}
}
}



