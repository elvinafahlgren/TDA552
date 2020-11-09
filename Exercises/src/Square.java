import java.awt.*;

public class Square extends Polygon {

    public Square(int x, int y) {
        super(x, y);
    }
    @Override
    public void paint(Graphics g) {
        g.drawRect(centerPoint.x -20, centerPoint.y -10, 40, 20);
    }
}
