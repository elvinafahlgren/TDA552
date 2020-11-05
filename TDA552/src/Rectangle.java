import java.awt.*;

public class Rectangle extends Polygon{

    public Rectangle(int x, int y) {
        super(x, y);
    }

    @Override
    public void paint(Graphics g) {
        g.drawRect(centerPoint.x -10, centerPoint.y -10, 20, 20);
    }
}
