package pl.vistula.exercise3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMICalculator {
    public static void main(String[] args) throws IOException {

        float weightGudeta , heightGudeta, bmiGudeta;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));



        System.out.println("the program  will calculate  your BMI");
        System.out.println("enter the height in cm (then press enter):");
        heightGudeta=Float.parseFloat(br.readLine())/100;
        System.out.println("enter the weight (then press enter):");
        weightGudeta=Float.parseFloat(br.readLine());

        bmiGudeta=(float) (weightGudeta/(Math.pow(heightGudeta,2)));
        System.out.printf("your BMI is:" + "%2.2f, \n", bmiGudeta);

        if(bmiGudeta<15)
        {
            System.out.println("you are starving");
        }
        else if ((bmiGudeta>=15)&&(bmiGudeta<15.99))
        {
          System.out.println("you are emaciated");
        }
        else if ((bmiGudeta>=16)&&(bmiGudeta<17.49))
        {
            System.out.println("you are underweight");
        }
        else if ((bmiGudeta>=17.50)&&(bmiGudeta<21.99))
        {
            System.out.println("you are  in the low range of norm");
        }
        else if ((bmiGudeta>=22)&&(bmiGudeta<23.99))
        {
            System.out.println("you are in the high range of norm");
        }
        else if ((bmiGudeta>=24)&&(bmiGudeta<26.49))
        {
            System.out.println("you are overweight(pre-obese)");
        }
        else if ((bmiGudeta>=26.50)&&(bmiGudeta<28.99))
        {
            System.out.println("you overweight");
        }
        else if ((bmiGudeta>=29)&&(bmiGudeta<33.99))
        {
            System.out.println("you have 1st degree obesity");
        }
        else if ((bmiGudeta>=34)&&(bmiGudeta<38.99))
        {
            System.out.println("you have 2nd degree obesity");
        }
        else if (bmiGudeta>=40)
        {
            System.out.println("you have 3rd degree obesity");
        }


    }
}
