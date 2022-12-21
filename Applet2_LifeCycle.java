import java.applet.*;
import java.awt.*;

/**<applet code="Applet2_LifeCycle" height=500 width=500></applet>*/

public class  Applet2_LifeCycle extends Applet 
{
	String s= " " ; 
	public void start()
	{
		s+="started....";
	}
	public void init()
	{
		s+="initialized....";
	}
	public void paint(Graphics g)
	{
		s+="painted....";
		g.drawString(s,20,30);
	}
	public void stop()
	{
		s+="stopped....";
	}
	public void destroy()
	{
		s+="destroyed...";
	}
}
