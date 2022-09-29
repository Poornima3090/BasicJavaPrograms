import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SampleExercise {
    public static void main(String[] args) {
        //Multiplication of two numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer:");
        int FirstNumber = sc.nextInt();
        System.out.println("First number is" + FirstNumber);
        System.out.println("Enter Second integer");
        int SecondNumber = sc.nextInt();
        System.out.println("Second Number is" + SecondNumber);
        System.out.println("Enter third integer:");
        int ThirdNumber = sc.nextInt();
        System.out.println("Multiplication of two numbers :" + FirstNumber * +SecondNumber);
        //Verify given integer is even or odd
        if (FirstNumber%2==0){
            System.out.println("First integer entered is even number");
        }
        else{
            System.out.println("First integer entered is odd number");
        }
        //Find largest of 3 numbers
        int LargestNumber=0;
        if (FirstNumber>SecondNumber && FirstNumber>ThirdNumber){
            LargestNumber=FirstNumber;
        } else if (SecondNumber>ThirdNumber) {
            LargestNumber=SecondNumber;
        } else if (FirstNumber==SecondNumber && SecondNumber==ThirdNumber) {
            System.out.println("All numbers are equal");
        } else
            LargestNumber = ThirdNumber;
        System.out.println("Largest of three numbers is " +LargestNumber);
        //LCM & HCF of two numbers
        int LCM ;
        int GCF = 1;
        int ProductofTwoNumbers = FirstNumber * SecondNumber;
        for (int i =1; i<=FirstNumber && i<=SecondNumber;i++){
            if(FirstNumber%i==0 && SecondNumber%i==0){
                GCF = i;
            }
        }
        System.out.println("GCF of two numbers is" +GCF);
        LCM = ProductofTwoNumbers/GCF;
        System.out.println("LCM of two numbers is " +LCM);
        //Display PrimeNumbers from 1 to 100
        int PrimeNumber;
        for(int i=1;i<=100;i++){
            if(i%1==0 && i%i==0) {
                PrimeNumber = i;
                System.out.println(+PrimeNumber);
            }
        }
        //Swapping two numbers
        List<Integer> list = Arrays.asList(+FirstNumber,+SecondNumber);
        Collections.swap(list,0,1);
        System.out.print("Swapped numbers using Collections:" +list);
        //Addition of two binary string
        System.out.println("Enter first binary string");
        String FirstBinaryNumber = sc.next();
        System.out.println("Enter second binary string");
        String SecondBinaryNumber = sc.next();
        int b1 = Integer.parseInt(FirstBinaryNumber, 2);
        int b2 = Integer.parseInt(SecondBinaryNumber, 2);
        int sum = b1 + b2;
        System.out.println("Addition of two binary string:" +Integer.toBinaryString(sum));
        //Addition of two complex numbers
        SampleExercise ComplexNumber1 = new SampleExercise(2,6);
        SampleExercise ComplexNumber2 = new SampleExercise(4,3);
        SampleExercise temp = sum(ComplexNumber1,ComplexNumber2);
        System.out.println("Addition of two Complex Numbers:" +temp.real + "+" + +temp.imaginary);
    }
    double real,imaginary;
    SampleExercise(double R,double I){
        this.real =R;
        this.imaginary =I;
    }
    public static SampleExercise sum(SampleExercise complexNumber1, SampleExercise complexNumber2) {
        SampleExercise temp = new SampleExercise(0,0);
        temp.real = complexNumber1.real + complexNumber2.real;
        temp.imaginary = complexNumber1.imaginary+complexNumber2.imaginary;
        return temp;
        }
        }