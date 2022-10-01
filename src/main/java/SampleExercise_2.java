import java.time.Year;
import java.util.Scanner;

import static java.lang.Math.IEEEremainder;
import static java.lang.Math.pow;

public class SampleExercise_2 {
    public static void main(String[] args){
        //Find Perimeter of rectangle
       Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of rectangle:");
        int length = input.nextInt();
        System.out.println("Enter the width of rectangle");
        int width = input.nextInt();
        Perimeter(length,width);
        //Calculate Simple Interest
        System.out.println("Enter the principal amount");
        float Principal = input.nextFloat();
        System.out.println("Enter Rate of interest per annum");
        float Rate = input.nextFloat();
        System.out.println("Enter the number of years");
        float NumberofYears = input.nextFloat();
        SimpleInterest(Principal,Rate,NumberofYears);
        //Calculate CompoundInterest
        CompoundInterest(Principal,Rate,NumberofYears);
        System.out.println("Enter the character");
        char alphabet = input.next().charAt(0);
        Alphabet(alphabet);
        //Check leap year or not
        System.out.println("Enter the year");
        int Year = input.nextInt();
        LeapYear(Year);
        //Check Neon Number
        System.out.println("Enter an integer to check whether it is neon number");
        int Number = input.nextInt();
        NeonNumber(Number);
        //Check the Armstrong Number
        System.out.println("Enter the integer to check armstrong number");
        int integer = input.nextInt();
        ArmstrongNumber(integer);
    }
    public static void Perimeter(int length,int width){
        int Perimeter = 2*(length+width);
        System.out.println("Perimeter of rectangle is" +Perimeter);
    }
    public static void SimpleInterest(float Principal,float Rate,float Numberofyears){
        float SimpleInterest = (Principal*Rate*Numberofyears)/100;
        System.out.println("SimpleInterest for the principal entered is" +SimpleInterest);
    }
    public static void CompoundInterest(float Principal,float Rate,float Numberofyears){
        float CompoundInterest = (float) (Principal* pow((1+Rate/100),Numberofyears)-Principal);
        System.out.println("Compound interest for entered printcipal amount is" +CompoundInterest);
    }
    private static void Alphabet(char alphabet){
        if (alphabet=='a'|| alphabet=='e'|| alphabet=='i'|| alphabet=='o'|| alphabet=='u'){
            System.out.println("Entered character is vowel");
        } else if (alphabet>='a' && alphabet<='z') {
            System.out.println("Entered character is consonant");
        }else
            System.out.println("Please enter valid input");
    }
    private static void LeapYear(int Year) {
        if (Year % 4 == 0 || Year % 100 == 0 || Year % 400 == 0) {
            System.out.println("It is a leap year");
        } else {
            System.out.println("It is not a leap year");
        }
    }
    public static void NeonNumber(int Number){
        int SquareofNumber,sum,Remainder,temp1;
        SquareofNumber = (int) pow(Number,2);
        sum=0;
        temp1=0;
        temp1=temp1+SquareofNumber;
        for (int i =1;temp1!=0;i++){
            Remainder = temp1%10;
            sum = sum + Remainder;
            temp1 = temp1/10;
        }
        System.out.println("Sum of digits is" +sum);
        System.out.println("Square of entered number is" +SquareofNumber);
        if (sum==Number){
            System.out.println("Entered number is neon number");
        }else
            System.out.println("Entered number is not a neon number");
        }
        public static void ArmstrongNumber(int integer){
        int numberofdigits=0;
        int temp1 =0;
        temp1=temp1+integer;
        for(int i =1;temp1!=0;i++){
            numberofdigits=i;
            temp1 = temp1/10;
        }
           int digitsum=0;
           int temp2 =0;
           temp2 = temp2 + integer;
           while(temp2!=0){
               int Remainder = temp2%10;
               int powerexp = (int) Math.pow(Remainder,numberofdigits);
               digitsum = digitsum + powerexp;
               temp2=temp2/10;
           }
           if (integer==digitsum){
               System.out.println("Entered integer is Armstrong Number");
           }else
               System.out.println("Entered number is not armstrong number");
           //System.out.println("Sum of digits is" +digitsum);
           //System.out.println("Number of digits for the entered integer is" +numberofdigits);
        }
}
