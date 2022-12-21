import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**<applet code=Ex_oval height=500 width=500>
</applet>*/

public class Ex_oval extends Applet implements MouseListener
{
	Graphics g;
	int x,y;
	public void init()
	{
		addMouseListener(this);
	}

	public void mouseClicked(MouseEvent me)
	{
		g=getGraphics();
		x=me.getX();
		y=me.getY();
		g.fillOval(x,y,50,70);
	}

	public void mousePressed(MouseEvent me)
	{
		
	}

	public void mouseEntered(MouseEvent me)
	{
		
	}

	public void mouseExited(MouseEvent me)
	{
		
	}

	public void mouseReleased(MouseEvent me)
	{
		
	}

	public void paint(Graphics g)
	{
		
	}
}