import java.applet.*;
import java.awt.*;

/**<applet code="Applet1" height=500 width=500></applet>*/

public class  Applet1 extends Applet 
{
	public void paint(Graphics g)
	{
		g.drawString("Aakriti",100,500);
		g.drawRect(160,30,300,400);
		g.drawLine(0,20,300,400);
		g.drawOval(10,20,300,400);
		g.fillRect(0,10,150,400);
		g.fillOval(0,100,300,400);
	}
}
