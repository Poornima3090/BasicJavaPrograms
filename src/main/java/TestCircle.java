public class TestCircle {
public static void main(String[] args){

    Circle myCircle = new Circle();
    System.out.println("Radius of Circle is" +myCircle.getRadius());
    System.out.println("Area of Circle is" +myCircle.getArea());
    Circle myCircle2 = new Circle(10d);
    System.out.println("Area of Circle is " +myCircle2.getArea());
    Circle myCircle3 = new Circle(2.4, myCircle.Color);
    System.out.println("Radius of Circle is "+ myCircle3.Radius + "\n" + "and color of circle is "+myCircle3.Color);
    System.out.println("New Radius of Circle is" +myCircle3.setRadius(6.6));
    System.out.println("New color of Circle is " +myCircle3.setColor("Orange"));
}
}