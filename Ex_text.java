import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**<applet code=Ex_text height=500 width=500>
</applet>*/

public class Ex_text extends Applet implements ActionListener
{
	Button B1;
	TextField T1,T2;
	String str="";

	public void init()
	{
		B1=new Button("Click");
		T1=new TextField(10);
		T2=new TextField(10);

		B1.addActionListener(this);
		add(T1);
		add(B1);
		add(T2);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==B1)
		{
			str=T1.getText();
			T2.setText(T1.getText());
			T1.setText("");
			T1.requestFocus();
		}
	}

	public void paint(Graphics g)
	{
	}
}
