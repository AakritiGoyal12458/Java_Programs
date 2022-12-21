import java.applet.*;
import java.awt.*;

/**
<applet code=Ex_app height=500 width=500></applet>
*/

public class Ex_app extends Applet
{
	public void paint(Graphics g)
	{
		g.drawLine(100,100,200,200);
		g.drawRect(250,250,50,100);
		g.drawOval(300,300,50,50);
		g.fillRect(240,240,50,100);
		g.fillOval(300,300,50,50);
	}
}