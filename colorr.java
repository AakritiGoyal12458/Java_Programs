import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/** <applet code="colorr" height=500 width=500> </applet>*/

public class colorr extends Applet implements ItemListener
{
	int r,g,b;
	Label l1;
	Label l2;
	Label l3;
	CheckboxGroup cg;
	Checkbox cb1;
	Checkbox cb2;
	Choice c1;
	Choice c2;
	Choice c3;

	public void init()
	{
		cg= new CheckboxGroup();
		cb1=new Checkbox("MALE", true , cg);
		cb2=new Checkbox("FEMALE", true , cg);

		l1=new Label("Red");
		l2=new Label("Green");
		l3=new Label("Blue");

		c1=new Choice();
		c2=new Choice();
		c3=new Choice();

		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);

		add(l1);
		add(c1);
		add(l2);
		add(c2);
		add(l3);
		add(c3);
		add(cb1);
		add(cb2);

		for(int i=0 ; i<256 ; i++ )
		{
			c1.addItem(" "+ i);
			c2.addItem(" " +i);
			c3.addItem(" " +i);
		}

	}

	public void itemStateChanged(ItemEvent me)
	{
	
		r= c1.getSelectedIndex();
		g= c2.getSelectedIndex();
		b= c3.getSelectedIndex();
		
		setBackground(new Color (r,g,b));
		

	}


}

