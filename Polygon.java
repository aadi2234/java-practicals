import java.applet.*;
import java.awt.*;
/*<Applet CODE= Polygon.class 
		WIDTH=400 
		HEIGHT=200 ></Applet>*/
public class Polygon extends Applet
{
	public void paint(Graphics g)
	{
		setBackground(Color.BLACK);
		g.setColor(Color.RED);
		int xpts[]={0,60,120,180,240,300,360,400};
		int ypts[]={400,280,220,140,60,60,100,200};
		int num=xpts.length;
		g.drawPolygon(xpts,ypts,num);
	}
}