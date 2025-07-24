abstract class shape {
    double side,area,perimeter;
    public shape(double side){
        this.side=side;
    }
    abstract public void calculateArea();
    abstract public void calculatePerimeter();
    public void display(){
            System.out.println("shape: "+getClass().getSimpleName());
            System.out.println("side:" +side);
            System.out.println("Area:" +area);
            System.out.println("Perimeter:" +perimeter);
            System.out.println();
    }
}
 class Triangle extends shape{
    private double base,height;
    public Triangle(double base,double height){
          super(base);
          this.base=base;
          this.height=height;
        calculateArea();
        calculatePerimeter();
    }
    public void calculateArea(){
        area = 0.5*base*height;
    }
    public void calculatePerimeter(){
        perimeter = 3*side;
    }
}
class Circle extends shape{
    private double radius;
    public Circle(double radius){
          super(radius);
          this.radius=radius;
        calculateArea();
        calculatePerimeter();
    }
    public void calculateArea(){
        area = 3.14*radius*radius;
    }
    public void calculatePerimeter(){
        perimeter = 2*3.14*radius; 
    }
}
 class Square extends shape{
    private double side;
    public Square(double side){
          super(side);
          this.side=side;
        calculateArea();
        calculatePerimeter();
    }
    public void calculateArea(){
        area = side*side;
    }
    public void calculatePerimeter(){
        perimeter = 4*side;
    }
}
 class Rectangle extends shape{
    private double base,height;
    public Rectangle(double base,double height){
          super(base);
          this.base=base;
          this.height=height;
        calculateArea();
        calculatePerimeter();
    }
    public void calculateArea(){
        area = base*height;
    }
    public void calculatePerimeter(){
        perimeter = 2*(base+ height);
    }
}
public class Testshape{
    public static void main(String[] args) {
        shape triangle = new Triangle(25,2.5);
        triangle.display();
        shape circle = new Circle(5);
        circle.display();
        shape square = new Square(25);
        square.display();
        shape rectangle = new Rectangle(25,60);
        rectangle.display();
    }
}
