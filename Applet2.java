import java.awt.*;
import java.applet.*;
/*<Applet CODE= Applet2.class 
		WIDTH=400 
		HEIGHT=200 ></Applet>*/
public class Applet2 extends Applet 
{
    public void paint(Graphics g) 
	{
		g.setColor(Color.red);
        g.drawString( "Welcome to World of Applet....",50, 100);
    }
	public void init()
	{
		System.out.println("Init Method");
	}
	public void start()
	{
		System.out.println("Start Method");
	}
	public void stop()
	{
		System.out.println("Stop Method");
	}
	public void destroy()
	{
		System.out.println("Destroy Method");
	}
}