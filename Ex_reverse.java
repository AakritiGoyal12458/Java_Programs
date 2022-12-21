import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**<applet code=Ex_reverse height=500 width=500>
</applet>*/

public class Ex_reverse extends Applet implements ActionListener
{
	Label L1,L2;
	TextField T1,T2;
	Button B1;
	int x,rev,rem;

	public void init()
	{
		L1=new Label("Enter a Value:");
		L2=new Label("Reverse Value:");
		T1=new TextField(5);
		T2=new TextField(5);
		B1=new Button("Reverse");

		B1.addActionListener(this);
		T2.setEditable(false);
		add(L1);
		add(T1);
		add(B1);
		add(L2);
		add(T2);
	}

	public void actionPerformed(ActionEvent ae)
	{
			x=Integer.parseInt(T1.getText());
			rev=0;
			while(x != 0)
			{
				rem=x%10;
				rev=rev*10+rem;
				x=x/10;
			}
			T2.setText(""+rev);
	}
}
