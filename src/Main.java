import java.awt.*;
import javax.swing.*;

public class Main extends JFrame{
    public static void main(String[] args) throws Exception {
      Main window = new Main();  
    }


    class Canvas extends JPanel {
        Grid grid; 
      public Canvas() {
        Grid grid = new Grid();
        setPreferredSize(new Dimension(720,720));
      }

      @Override
      public void paint(Graphics g) {
        for(int x = 10; x < 710; x+=35) {
            for (int y = 10; y < 710; y+=35){
            g.setColor(Color.WHITE);
             g.fillRect(x,y,35,35);
             g.setColor(Color.BLACK);
             g.drawRect(x,y,35,35);
             Cell cell = new Cell(x,y,35,35);
     }
    }
      }
    }



    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack();
    }


    public class Cell extends Rectangle {

        public Cell(int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }
    
        
    }

    public class Grid {
        public Cell[] gridCells;
        public Grid() {
        }
    
        public void addCell(Cell cell) {
    
        }
    
    }
}