import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics;

public class MouseTrail {


    // fields
    int x;
    int y;
    static int size = 10;

    // constructor

    public MouseTrail(int xPos, int yPos) {
        x = xPos;
        y = yPos;
        
    }



    // methods
    public void paint(Graphics g, Point mousePos) {
        if (contains(mousePos)) {
            g.setColor(Color.YELLOW);
            g.drawOval(x,y,size,size);
            g.fillOval(x,y,size,size);
        }
    }

    public boolean contains(Point p) { // check if within grid
        if(p != null) { 
          return p.x >= 10 && p.y >= 10 && p.x <= 710 && p.y <= 710;
        } else {
          return false;
        }
      }
}
