import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**<applet code=Obj_button height=500 width=500>
</applet>*/

public class Obj_button extends Applet implements ActionListener
{
	Button B1,B2;
	Label l1,l2;
	String s1="";

	public void init()
	{
		l1= new Label("Click This");
		l2= new Label("Close This");
		B1=new Button("Click Me");
		B2=new Button("Close Me");

		B1.addActionListener(this);
		B2.addActionListener(this);

		add(l1);
		add(B1);
		add(l2);
		add(B2);
		
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==B1)
		{
			s1="U clicked me";
			repaint();
		}
		else
		{
			s1="U clicked close";
			repaint();
		}
	}
	
	public void paint(Graphics g)
	{
		g.drawString(s1,100,200);
	}
}