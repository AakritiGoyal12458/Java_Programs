import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**<applet code=ObjMove_button height=500 width=500>
</applet>*/

public class ObjMove_button extends Applet implements ActionListener
{
	Button B1,B2,B3,B4;
	String s1="Hello";
	int x=100;
	int y=100;

	public void init()
	{
		B1=new Button("Up");
		B2=new Button("Down");
		B3=new Button("Right");
		B4=new Button("Left");

		B1.addActionListener(this);
		B2.addActionListener(this);
		B3.addActionListener(this);
		B4.addActionListener(this);

		add(B1);
		add(B2);
		add(B3);
		add(B4);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==B1)
		{
			y=y-10;
			repaint();
		}
		else if(ae.getSource()==B2)
		{
			y=y+10;
			repaint();
		}
		else if(ae.getSource()==B3)
		{
			x=x+10;
			repaint();
		}
		else
		{
			x=x-10;
			repaint();
		}
	}
	
	public void paint(Graphics g)
	{
		g.drawString(s1,x,y);
	}
}