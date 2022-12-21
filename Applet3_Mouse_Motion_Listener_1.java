import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**<applet code="Applet3_Mouse_Motion_Listener_1" height=500 width=500></applet>*/

public class  Applet3_Mouse_Motion_Listener_1 extends Applet implements MouseMotionListener
{
	String s= " " ; 
	int x,y ; 
	public void init()
	{
		addMouseMotionListener(this);
	}
	public void mouseMoved(MouseEvent me )
	{
		x=me.getX();
		y=me.getY();
		s=" moved " + x + y ;
		repaint();	
	}
	public void mouseDragged(MouseEvent me )
	{
		
		s="Mouse Dragged"  ;
		repaint();	
	}
	public void paint(Graphics g)
	{
		
		g.drawString(s,100,200);
	}
	
}
