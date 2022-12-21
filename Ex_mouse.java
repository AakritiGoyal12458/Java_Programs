import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**<applet code=Ex_mouse height=500 width=500>
</applet>*/

public class Ex_mouse extends Applet implements MouseMotionListener
{
	String str="";
	int x,y;
	public void init()
	{
		addMouseMotionListener(this);
	}

	public void mouseMoved(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		str="Moved..."+x+","+y;
		repaint();
	}

	public void mouseDragged(MouseEvent me)
	{
		str="Mouse Dragged...";
		repaint();
	}

	public void paint(Graphics g)
	{
		g.drawString(str,100,200);
	}
}