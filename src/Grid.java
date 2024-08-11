import java.awt.Graphics;
import java.awt.Point;

public class Grid {
  // fields
  Cell[][] cells = new Cell[20][20];
  MouseTrail[] trails = new MouseTrail[100];
  
  // constructors
  public Grid() {
    for(int i=0; i<cells.length; i++) {
      for(int j=0; j<cells[i].length; j++) {
        cells[i][j] = new Cell(10+Cell.size*i, 10+Cell.size*j);
      }
    }
  }
  // methods
  public void paint(Graphics g, Point mousePos) {

// mousetrail_idx++;
// id mousetrail_idx > 99 {
//   moustrail_idx = 0;
// trails[idx],clear_circle = new Moustrail(x,y);
//}

    int mouseTrailIDX = 0;
    for (int i = 0; i < trails.length; i++) {
      trails[i].x = mousePos.x;
      trails[i].y = mousePos.y;
      trails[i].paint(g, mousePos); // this might be wrong
      if (mouseTrailIDX > 99) {
        mouseTrailIDX = 0;
      }
    }

    for(int i=0; i<cells.length; i++) {
      for(int j=0; j<cells[i].length; j++) {
        cells[i][j].paint(g, mousePos);
      }
    }

  }
}
