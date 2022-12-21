import java.applet.*;
import java.awt.*;

/**
<applet code=Ex_life height=500 width=500></applet>
*/

public class Ex_life extends Applet
{
	String s="";
	public void paint(Graphics g)
	{
		s+="paint...";
		g.drawString(s,100,200);
	}

	public void destroy()
	{
		s+="Destroyed...";
	}

	public void start()
	{
		s+="started...";
	}

	public void init()
	{
		s+="initialized...";
	}

	public void stop()
	{
		s+="stopped...";
	}
}