import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**<applet code="Applet5_Button_1" height=500 width=500></applet>*/

public class  Applet5_Button_1 extends Applet implements ActionListener
{
	String s= " " ; 
	Button b1,b2;
	public void init()
	{
		b1=new Button("Click me ");
		b2=new Button("Close me ");

		b1.addActionListener(this);
		b2.addActionListener(this);
		
		add(b1);
		add(b2);
		
	}
	public void actionPerformed(ActionEvent me )
	{
		s=me.getActionCommand();
		if (s== "Click me ")
		{
			s="U CLICKED ME ";
			repaint();
		}
		else
		{
			s="u closed me "; 
			repaint();
		}
	}
	
	public void paint(Graphics g)
	{
		
		g.drawString(s,100,200);
	}
	
}
