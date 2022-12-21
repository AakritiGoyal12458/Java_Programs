import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**<applet code=RadioMove_button height=500 width=500>
</applet>*/

public class RadioMove_button extends Applet implements ActionListener
{
	Button B1,B2,B3,B4;
	Checkbox R1,R2;
	CheckboxGroup cbg;
	String s1="Hello";
	int x=100;
	int y=100;

	public void init()
	{
		cbg = new CheckboxGroup();

		R1=new Checkbox("Vertical",true, cbg);
		R2=new Checkbox("Horizontal",true, cbg);

		B1=new Button("Up");
		B2=new Button("Down");
		B3=new Button("Right");
		B4=new Button("Left");

		B1.addActionListener(this);
		B2.addActionListener(this);
		B3.addActionListener(this);
		B4.addActionListener(this);

		add(R1);
		add(R2);
		add(B1);
		add(B2);
		add(B3);
		add(B4);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==B1)
		{
			if(R1.getState()==true)
			{
				y=y-10;
				repaint();
			}
		}
		else if(ae.getSource()==B2)
		{
			if(R1.getState()==true)
			{
				y=y+10;
				repaint();
			}
		}
		else if(ae.getSource()==B3)
		{
			if(R2.getState()==true)
			{
				x=x+10;
				repaint();
			}
		}
		else
		{
			if(R2.getState()==true)
			{
				x=x-10;
				repaint();
			}
		}
	}
	
	public void paint(Graphics g)
	{
		g.drawString(s1,x,y);
	}
}