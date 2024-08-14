
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class MouseTrail {

    // fields
    Color trailColor = new Color(0, 0, 0, 20); // transparent black
    int x;
    int y;
    static int size = 10;

    // constructor
    public MouseTrail(int xPos, int yPos) {
        x = xPos;
        y = yPos;

    }

    // methods
    public void paint(Graphics g, Point mousePos) { // paints a trail

          g.setColor(trailColor);
          g.drawOval(x, y, size, size);
          g.fillOval(x, y, size, size);
    }
}
