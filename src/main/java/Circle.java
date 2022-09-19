import java.util.Scanner;
public class Circle {
    double Radius;
    public Circle (){
        System.out.println("Step 2");
        Scanner r = new Scanner(System.in);
        System.out.println("Enter radius of Circle:");
        Radius = r.nextDouble();
        }
       public Circle (double defaultRadius){
        Radius = defaultRadius;
    }
    public double getRadius() {
        return Radius;
    }
    public double getArea(){
        return Radius*Radius*Math.PI;
    }
}
