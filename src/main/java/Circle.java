import java.util.Scanner;
public class Circle {
        double Radius;
        String Color;
public Circle (){
        Scanner r = new Scanner(System.in);
        System.out.println("Enter radius of Circle:");
        Radius = r.nextDouble();
        System.out.println("Enter color of circle:");
        Color = r.next();
        }
public Circle (double defaultRadius){
        Radius = defaultRadius;
        }
public Circle(double radius,String color){
        Radius = radius;
        Color = color;
        }
public double getRadius() {
        return Radius;
        }
public double getArea(){
        return Radius*Radius*Math.PI;
        }
public String getColor(){
        return Color;
        }
public double setRadius(double newRadius){
        Radius = newRadius;
        return Radius;
        }
public String setColor(String newColor){
        Color = newColor;
        return Color;
        }
        }
