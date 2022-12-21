import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**<applet code=Ex_textarea height=700 width=700>
</applet>*/

public class Ex_textarea extends Applet implements ActionListener
{
	TextField T1;
	TextArea Ta;
	Button B1;
	String s1="";

	public void init()
	{
		Ta=new TextArea(5,10);
		T1=new TextField(5);
		B1=new Button("Add");

		B1.addActionListener(this);

		add(T1);
		add(B1);
		add(Ta);
	}

	public void actionPerformed(ActionEvent ae)
	{
		s1=T1.getText();
		if(s1.isEmpty()==false)
		{	
			Ta.append(s1+"\n");
			T1.setText("");
			T1.requestFocus();
		}
	}
}
