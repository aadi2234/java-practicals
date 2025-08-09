import java.applet.*;
import java.awt.*;
/*<Applet CODE= Arcs.class 
		WIDTH=500 
		HEIGHT=350 ></Applet>*/
public class Arcs extends Applet
{
	public void paint(Graphics g)
	{
		setBackground(Color.BLACK);
		g.drawArc(10,40,70,70,0,75);
		g.setColor(Color.RED);
		g.fillArc(100,40,70,70,0,75);
		g.drawArc(10,100,70,80,0,175);
		g.setColor(Color.GREEN);
		g.fillArc(100,100,70,90,0,270);
		g.drawArc(200,80,80,80,10,180);
	}
}