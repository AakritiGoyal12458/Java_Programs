import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**<applet code=Ex_radio height=500 width=500>
</applet>*/

public class Ex_radio extends Applet implements ItemListener
{
	Checkbox R1,R2;
	CheckboxGroup cbg;
	String s1="", s2="";

	public void init()
	{
		cbg = new CheckboxGroup();

		R1=new Checkbox("Male",true, cbg);
		R2=new Checkbox("Female",true, cbg);

		R1.addItemListener(this);
		R2.addItemListener(this);

		add(R1);
		add(R2);
	}

	public void itemStateChanged(ItemEvent ae)
	{
		s1 = "Male="+R1.getState();
		s2 = "Female="+R2.getState();
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.drawString(s1,100,200);
		g.drawString(s2,100,240);
	}
}