import java.applet.*;
import java.awt.*;
/*<applet 
    code=Circle.class
    width=400
    height=200>
</applet>*/ 
public class Circle extends Applet 
{
    public void init() {
        setBackground(Color.white);
    }
    
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(50, 50, 100, 100);
        
        g.setColor(Color.green);
        g.fillOval(50, 170, 100, 100);
        
        g.setColor(Color.yellow);
        g.fillOval(50, 290, 100, 100);
    }
}