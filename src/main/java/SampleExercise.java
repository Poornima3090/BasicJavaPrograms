import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SampleExercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer:");
        int FirstNumber = sc.nextInt();
        System.out.println("First number is" + FirstNumber);
        int SecondNumber = sc.nextInt();
        System.out.println("Second Number is" + SecondNumber);
        System.out.println("Multiplication of two numbers :" + FirstNumber * +SecondNumber);
        List<Integer> list = Arrays.asList(+FirstNumber,+SecondNumber);
        Collections.swap(list,0,1);
        System.out.print("Swapped numbers using Collections:" +list);
        System.out.println("Enter first binary string");
        String FirstBinaryNumber = sc.next();
        System.out.println("Enter second binary string");
        String SecondBinaryNumber = sc.next();
        int b1 = Integer.parseInt(FirstBinaryNumber, 2);
        int b2 = Integer.parseInt(SecondBinaryNumber, 2);
        int sum = b1 + b2;
        System.out.println("Addition of two binary string:" +Integer.toBinaryString(sum));

        SampleExercise ComplexNumber1 = new SampleExercise(2,6);
        SampleExercise ComplexNumber2 = new SampleExercise(4,3);
        SampleExercise temp = sum(ComplexNumber1,ComplexNumber2);
        System.out.println("Addition of two Complex Numbers:" +temp.real + "+" + +temp.imaginary);

        /*int temp = FirstNumber;
         FirstNumber = SecondNumber;
        SecondNumber = temp;
        System.out.println("Swapped numbers are" +FirstNumber +"," +SecondNumber);*/
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