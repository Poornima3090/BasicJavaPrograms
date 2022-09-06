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
        //System.out.println("Can you run 5 kms? please enter 'Yes' or 'No'");
        //String run = sc.nextLine();

        if (age>15 && age<40) {
            if (weight > 30 && weight < 70)
                System.out.println("You are fit");
        }
            else
                System.out.println("You are Fit but you need to be healthier");

        }

        /*String s1 = "Y";
        String s2 = "N";
        boolean b1 = Boolean.valueOf(s1);
        boolean b2 = Boolean.valueOf(s2);
        if (run == s1){
            System.out.println(b1);
        }

        switch (run) {
                   case "Y":
                       return true;
                  case "N":
                       return false;
                  default:
                       throw new IllegalArgumentException("Please Enter 'Y' or 'N'");
             }*/
        }


