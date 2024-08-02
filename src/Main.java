import java.awt.*;
import javax.swing.*;


public class Main extends JFrame{
    public static void main(String[] args) throws Exception {
      Main window = new Main();  
    }

    class Canvas extends JPanel {
      public Canvas() {

        setPreferredSize(new Dimension(720,720));
      }
      @Override
      public void paint(Graphics graphics) {
        
        int i = 0;
        for(int x = 10; x < 710; x+=35) {
            for (int y = 10; y < 710; y+=35){

             Cell cell = new Cell(x, y, graphics);
             cell.drawCell(x, y, graphics);
             Grid.addCell(cell,i);
             i++;
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

        private Color lineColour = Color.BLACK; 
        private Color fillColour = Color.WHITE; 
        private Graphics graphics;
        private int heightwidth = 35;

        public Cell(int x, int y, Graphics graphics) {
            this.x = x;
            this.y = y;
            this.graphics = graphics;
        }

        public void drawCell(int x, int y, Graphics graphics) {
                    graphics.setColor(fillColour);
                    graphics.fillRect(x,y,35,35);
                    graphics.setColor(lineColour);
                    graphics.drawRect(x,y,35,35);
                }  
                

        
        
        
    }

    public class Grid extends JFrame {
        public static Cell[] gridCells = new Cell[400];
       
    
        public static void addCell(Cell cell, int Position) {
            gridCells[Position] = cell;
        }


    
    }

}