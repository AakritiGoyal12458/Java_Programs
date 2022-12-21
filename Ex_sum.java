import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**<applet code=Ex_sum height=500 width=500>
</applet>*/

public class Ex_sum extends Applet implements ActionListener
{
	Label L1,L2,L3;
	TextField T1,T2,T3;
	Button B1;
	int x,y,sum;

	public void init()
	{
		L1=new Label("First Value:");
		L2=new Label("Second Value:");
		L3=new Label("Sum:");
		T1=new TextField(5);
		T2=new TextField(5);
		T3=new TextField(5);
		B1=new Button("Sum");

		B1.addActionListener(this);
		T3.setEditable(false);

		add(L1);
		add(T1);
		add(L2);
		add(T2);
		add(B1);
		add(L3);
		add(T3);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==B1)
		{
			x=Integer.parseInt(T1.getText());
			y=Integer.parseInt(T2.getText());
			sum=x+y;
			T3.setText(""+sum);
		}
	}
}
