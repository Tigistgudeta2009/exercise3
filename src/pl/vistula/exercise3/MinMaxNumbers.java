package pl.vistula.exercise3;

import java.util.Random;
public class MinMaxNumbers {
    public static void main(String[] args) {

        int collectionSize = 10, i=1;
        int number , min= 101, max=0;

        System.out.println("the program draws" + collectionSize +"integers number from 1 to 100");
        System.out.println("find  the smallest and greatest of them");

        Random r= new Random();
        System.out.print("Drawn:");

        while (i<= collectionSize)
        {
            number= Math.round((r.nextInt(100)+1));
            System.out.print(number + ",");

            if (number<min) min=number;
            if (number<max) max=number;
            i++;
        }
        System.out.println(" ");
        System.out.println(" the  greatest number in the collection is:" + max);
        System.out.println("the smallest  number in the collection is:" + min);

    }
}
