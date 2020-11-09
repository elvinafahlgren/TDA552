import javax.swing.*;
import java.awt.*;
import java.util.*;

public class DrawPolygons extends Component{
    private ArrayList<Polygon> polygons;

    public DrawPolygons(){
        polygons = new ArrayList<>(10);

        polygons.add(new Triangle(100, 100));
        polygons.add(new Square(150, 150));
        polygons.add(new Rectangle(100, 200));

    }//constructor

    @Override
    public void paint(Graphics g) {
        for(Polygon polygon : polygons){
            polygon.paint(g);
        }
    }//paint

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DrawPolygons polygons = new DrawPolygons();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(30,30,300,300);
        frame.getContentPane().add(polygons);
        frame.setVisible(true);

    }//main

}//DrawPolygons









/*public class DrawPolygons {
}
class Polygon {
    private final Point centerPoint;

    Polygon(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    Point getCenterPoint(){
        return centerPoint;
    }

    void draw(Graphics g){
    }
}

class Triangle extends Polygon {
    private final int side;

    Triangle(Point centerPoint, int side) {
        super(centerPoint);
        this.side = side;
    }

    void draw(Graphics g){
        Point center = getCenterPoint();
        g.drawLine(center.x, center.y-side, center.x-side, center.y+side);
        g.drawLine(center.x-side, center.y+side,
                center.x+side, center.y+side);
        g.drawLine(center.x+side, center.y+side, center.x, center.y-side);
    }
}



class Square extends Polygon {
    private final int side;

    Square(Point centerPoint, int side) {
        super(centerPoint);
        this.side = side;
    }

    void draw(Graphics g){
        Point center = getCenterPoint();
        g.drawRect(center.x -side, center.y -side, 20, 20);
    }
}

class Rectangle extends Polygon{
    private final int side1;
    private final int side2;


    Rectangle(Point centerPoint, int side1, int side2) {
        super(centerPoint);
        this.side1 = side1;
        this.side2 = side2;
    }

    void draw(Graphics g){
        Point center = getCenterPoint();
        g.drawRect(center.x -side1, center.y -side2, 40, 20);
    }
}

 */






