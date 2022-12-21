import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**<applet code="Applet4_Mouse_Listener_2" height=500 width=500></applet>*/

public class  Applet4_Mouse_Listener_2 extends Applet implements MouseListener
{
	String s= " " ; 
	int x,y ; 
	public void init()
	{
		addMouseListener(this);
	}
	public void mouseEntered(MouseEvent me )
	{
		
		s+=" mouseEntered" ;
		repaint();	
	}
	public void mouseClicked(MouseEvent me )
	{
		
		s+=" mouseClicked"  ;
		repaint();	
	}
	public void mousePressed(MouseEvent me )
	{
		
		s+=" mousePressed"  ;
		repaint();	
	}
	public void mouseReleased(MouseEvent me )
	{
		
		s+=" mouseReleased";
		repaint();	
	}
	public void mouseExited(MouseEvent me )
	{
		
		s=" mouseExited";
		repaint();	
	}
	
	public void paint(Graphics g)
	{
		
		g.drawString(s,100,200);
	}
	
}
