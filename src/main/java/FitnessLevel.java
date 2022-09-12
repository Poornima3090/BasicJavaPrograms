import java.util.Objects;
import java.util.Scanner;

public class FitnessLevel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String Name = sc.nextLine();
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        System.out.println("Enter the weight:");
        int weight = sc.nextInt();
        System.out.println("Can you run 5 kms? please enter 'Yes' or 'No'");
        String Resp = sc.next();


        if (age>15 && age<40) {
            if (Objects.equals(Resp, "Yes")  || Objects.equals(Resp,"No")) {
                if (weight > 30 && weight < 70) {
                    System.out.println("You are fit");
                } else if (weight < 30) {
                    System.out.println("You are Fit but you need to be healthier");
                } else if (weight > 80 && Objects.equals(Resp, "No")) {
                    System.out.println("You are at RISK, improve your fitness level and reduce weight.");
                }
            }
                else {
                 System.out.println("Pls share right answer for 'Can you run 5kms?' ");
                }
        }
        else
            System.out.println("You’re only as old as you feel");

    }
}



