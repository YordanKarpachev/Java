package T11Polymorphism.A02;

public abstract class Shape {



    private Double perimeter;
    private Double area;

   public abstract Double calculatePerimeter();
   public abstract Double calculateArea();

    protected Double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    protected Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }


}
