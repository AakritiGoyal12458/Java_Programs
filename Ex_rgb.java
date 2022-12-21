import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**<applet code=Ex_rgb height=700 width=700>
</applet>*/

public class Ex_rgb extends Applet implements ItemListener
{
	Label L1;
	Label L2;
	Label L3;
	Choice C1;
	Choice C2;
	Choice C3;

	public void init()
	{
		L1=new Label("Red:");
		L2=new Label("Green:");
		L3=new Label("Blue:");
		C1=new Choice();
		C2=new Choice();
		C3=new Choice();

		C1.addItemListener(this);
		C2.addItemListener(this);
		C3.addItemListener(this);

		add(L1);
		add(C1);
		add(L2);
		add(C2);
		add(L3);
		add(C3);

		for(int i=0; i<256;i++)
		{
			C1.addItem(""+i);
			C2.addItem(""+i);
			C3.addItem(""+i);
		}
	}

	public void itemStateChanged(ItemEvent ie)
	{
		int r=C1.getSelectedIndex();
		int g=C2.getSelectedIndex();
		int b=C3.getSelectedIndex();
		
		setBackground(new Color(r,g,b)); 
	}
}
