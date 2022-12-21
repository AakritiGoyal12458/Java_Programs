import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**<applet code=Ex_line height=500 width=500>
</applet>*/

public class Ex_line extends Applet implements MouseMotionListener,MouseListener
{
	Graphics g;
	int x1,y1,x2,y2;
	public void init()
	{
		g=getGraphics();
		addMouseMotionListener(this);
		addMouseListener(this);
	}

	public void mousePressed(MouseEvent me)
	{
		x1=me.getX();
		y1=me.getY();
	}
	

	public void mouseDragged(MouseEvent me)
	{
		x2=me.getX();
		y2=me.getY();
		g.drawLine(x1,y1,x2,y2);
		x1=x2;
		y1=y2;
	}
	
	public void mouseMoved(MouseEvent me)
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

	public void mouseClicked(MouseEvent me)
	{
		
	}
}