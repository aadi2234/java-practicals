import java.applet.*;
import java.awt.*;
/*<Applet CODE= ShapesApplet.class 
		WIDTH=400 
		HEIGHT=200 ></Applet>*/
public class ShapesApplet extends Applet
{
	public void paint(Graphics g)
	{
		setBackground(Color.BLACK);
		g.setColor(Color.YELLOW);
		g.drawString("Cylinder",10,110);
		g.drawOval(10,10,50,10);
		g.drawOval(10,80,50,10);
		g.drawLine(10,15,10,85);
		g.drawLine(60,15,60,85);
		g.setColor(Color.RED); 
		g.drawString("Cube",95,110);
		g.drawRect(80,10,50,50);
		g.drawRect(95,25,50,50);
		g.drawLine(80,10,95,25);
		g.drawLine(130,10,145,25);
		g.drawLine(80,60,95,75);
		g.drawLine(130,60,145,75);
		g.setColor(Color.GREEN);
		g.drawString("Cone",90,250);
		g.drawOval(200,200,200,50);
		g.drawLine(200,225,290,500);
		g.drawLine(400,225,290,500);
		g.setColor(Color.PINK);
		g.drawString("Suare Inside Circle",150,110);
		g.drawOval(180,10,80,80);
		g.drawRect(192,22,55,55);
		g.setColor(Color.ORANGE);
		g.drawString("Circle Inside Suare",290,110);
		g.drawRect(290,10,80,80);
		g.drawOval(290,10,80,80);
	}
}