import java.applet.*; import java.awt.*; import java.awt.event.*; 
/**<applet code= Myapplet1 height=500 width=500> 
</applet>*/ 
 
public class Myapplet1 extends Applet implements ActionListener 
{ 
   Button B1,B2; 
   String str, s1=""; 
 
   public void init() 
   { 
      B1=new Button("Click Me"); 
      B2=new Button("Close Me"); 
 
      B1.addActionListener(this); 
      B2.addActionListener(this); 
 
      add(B1);       add(B2); 
   } 
 
   public void actionPerformed(ActionEvent ae) 
   { 
      str = ae.getActionCommand(); 
      if(str=="Click Me") 
      { 
         s1="U clicked me"; 
         repaint(); 
      }       else 
      { 
         s1="U clicked close"; 
         repaint(); 
      } 
   } 
    
   public void paint(Graphics g) 
   { 
      g.drawString(s1,100,200); 
   } 
} 
