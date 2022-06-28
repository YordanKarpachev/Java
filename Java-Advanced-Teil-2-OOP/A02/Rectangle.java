package A02PointOfRectangle;

public class Rectangle {
    Point bottomLeft;
    Point bottomRight;

    public Rectangle(Point bottomLeft, Point bottomRight) {
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }


    public boolean contains(Point point){
      boolean left =  point.getX() >= bottomLeft.getX() && point.getY() >= bottomLeft.getY();
      boolean right = point.getX() <= bottomRight.getX() && point.getY() <= bottomRight.getY();

      return left && right;
    }
}
