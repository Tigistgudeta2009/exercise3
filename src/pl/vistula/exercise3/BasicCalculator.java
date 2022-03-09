package pl.vistula.exercise3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicCalculator {
    public static void main(String[] args) throws IOException {

        float firstNumber, secondNumber, sum, difference, product, quotient;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("the program calculates sum, difference,product and quotient for two numbers,");
        System.out.println("enter the first number (then press enter):");
        firstNumber=Float.parseFloat(br.readLine());
        System.out.println("enter the second number (then press enter):");
        secondNumber=Float.parseFloat(br.readLine());

        sum= firstNumber+ secondNumber;
        difference =firstNumber-secondNumber;
        product= firstNumber * secondNumber;
        quotient= firstNumber / secondNumber;


        System.out.printf("you entered two numbers, the first is:" + "%2.2f", firstNumber);
        System.out.printf("and second number is:" + "%2.2f", secondNumber);

        System.out.println();

        System.out.printf("sum = " + "%2.2f , \n", + sum);
        System.out.printf("difference= " + "%2.2f , \n", + difference);
        System.out.printf("product= " + "%2.2f , \n", + product);
        System.out.printf("quotient = " + "%2.2f , \n", + quotient);


    }
}
