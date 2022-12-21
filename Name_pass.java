import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**<applet code=Name_pass height=500 width=500>
</applet>*/

public class Name_pass extends Applet implements ActionListener
{
	Label L1,L2;
	TextField T1,T2;
	Button B1;
	String s1="";
	String s2="";

	public void init()
	{
		L1=new Label("Name:");
		L2=new Label("Password:");
		T1=new TextField(10);
		T2=new TextField(10);
		B1=new Button("Ok");

		B1.addActionListener(this);
		T2.setEchoChar('*');

		add(L1);
		add(T1);
		add(L2);
		add(T2);
		add(B1);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==B1)
		{
			s1=T1.getText();
			s2=T2.getText();
			T1.setText("");
			T2.setText("");
			T1.requestFocus();
			repaint();
		}
	}

	public void paint(Graphics g)
	{
		g.drawString("Name"+s1,100,200);
		g.drawString("Password:"+s2,100,220);
	}
}
