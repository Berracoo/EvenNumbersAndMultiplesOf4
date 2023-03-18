import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int givenNum;
     Scanner input = new Scanner(System.in);
     int sum = 0;


        do{

            System.out.print("Please enter an integer : ");
            givenNum = input.nextInt();
            System.out.println("**************");
            if(givenNum % 2 == 1){
                // if you make the condition givenNUm % 2 != 0 it will take the negative number into account as well
                // se we should say given % 2 == 1
                sum += givenNum;

            }

        }while(givenNum > 0);

        System.out.println("Sum of odd numbers is : " + sum);

    }
}