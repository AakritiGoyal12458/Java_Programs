import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**<applet code="Applet6" height=500 width=500></applet>*/

public class  Applet6 extends Applet implements ActionListener
{
	TextField t1 ,t2;
	Button b1;
	public void init()
	{
		b1=new Button("Paste Text ");
		t1=new TextField(10);
		t2=new TextField(10);
		b1.addActionListener(this);
		
		add(t1);
		add(b1);
		add(t2);	
	}
	public void actionPerformed(ActionEvent me )
	{	
		if (me.getSource()==b1)
		{
			t2.setText(t1.getText());
			t1.setText(" " ) ;
			t1.requestFocus();
			t2.setEditable(false);
		}	
	}	
}
