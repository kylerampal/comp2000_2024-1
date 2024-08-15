
import java.awt.Graphics;
import java.awt.Point;
import java.util.*;

public class Grid {
    // fields

    Cell[][] cells = new Cell[20][20];
    ArrayList<MouseTrail> trails = new ArrayList<MouseTrail>();
    Point prevMousePos = null;

    // constructors
    public Grid() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j] = new Cell(10 + Cell.size * i, 10 + Cell.size * j);
            }
        }
    }
    // methods

    public void paint(Graphics g, Point mousePos) {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j].paint(g, mousePos);
            }
        }
        
            if (trails.size() >= 100) { // if the trails array list has been filled (after the initial 100 trails), then remove the first trail. This pushes everything along by one
               trails.remove(0);
            }

            if (mousePos != null) {     // if the position of the mouse is NOT null, then add a new MouseTrail to the end of the array list   
              trails.add(new MouseTrail(mousePos.x,mousePos.y));

            
        }
            
            for (int i = 0; i < trails.size(); i++) { // this constantly paints for each trail in the trails array list
              trails.get(i).paint(g, mousePos);
            }
    }
}
