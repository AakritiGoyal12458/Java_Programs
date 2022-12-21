import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/** <applet code="ex" height=500 width=500> </applet>*/

public class ex extends Applet implements ActionListener 
{
	TextField t1 ;
	TextField t2 ;
	Button b1;
	String s1,s2;

	public void init()
	{
		b1=new Button("change");
		t1=new TextField(10);
		t2=new TextField(10);

		b1.addActionListener(this);

		add(t1);
		add(t2);
		add(b1);

	}

	public void actionPerformed(ActionEvent me)
	{
		s1=t1.getText();
		s2=s1.toUpperCase();
		t2.setText(s2);
		t1.setText(" ");
		

	}


}

