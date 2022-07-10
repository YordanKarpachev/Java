package T11Polymorphism.A02;

public class Rectangle extends Shape {

    private Double height;
    private double width;

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public Double calculatePerimeter() {
        return  2 *(super.getArea() + super.getPerimeter());
    }

    @Override
    public Double calculateArea() {
        return super.getArea() * super.getPerimeter();
    }
}
