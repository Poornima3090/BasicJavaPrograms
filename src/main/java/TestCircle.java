public class TestCircle {
public static void main(String[] args){

    Circle myCircle = new Circle();
    System.out.println("Radius of Circle is" +myCircle.getRadius());
    System.out.println("Area of Circle is" +myCircle.getArea());
    Circle myCircle2 = new Circle(10d);
    myCircle2.getArea();

}
}