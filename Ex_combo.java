import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**<applet code=Ex_combo height=700 width=700>
</applet>*/

public class Ex_combo extends Applet implements ActionListener,ItemListener
{
	Label L1;
	TextField T1;
	Choice C1;
	Button B1;
	String s="";
	String s1="";
	String s2="";

	public void init()
	{
		L1=new Label("Name:");
		T1=new TextField(5);
		B1=new Button("Add");
		C1=new Choice();

		B1.addActionListener(this);
		C1.addItemListener(this);

		add(L1);
		add(T1);
		add(B1);
		add(C1);
		C1.addItem("Select Name");
	}

	public void actionPerformed(ActionEvent ae)
	{
		s1=T1.getText();
		if(s1.isEmpty()==false)
		{
			C1.addItem(s1);
			T1.setText("");
			T1.requestFocus();
		}
	}

	public void itemStateChanged(ItemEvent ie)
	{
		s2=C1.getSelectedItem();
		if(s2.equals("Select Name")==true)
		{
			s2="Please select a name";
		}
			repaint();
	}

	public void paint(Graphics g)
	{
		g.drawString(s2,100,200);
	}
}
