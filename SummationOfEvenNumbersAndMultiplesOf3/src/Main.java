import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner num = new Scanner(System.in);
      int chosenNum;
      int sum = 0;

      do{
          System.out.print("Please choose a number : ");
          chosenNum = num.nextInt();
          System.out.println("____________________");
          if(chosenNum % 4 == 0){
              // the reason why there is no chosenNum % 2 == 0 condition is that it won't matter if it's
              // not a multiple of 4.
             sum += chosenNum;

          }

      }while(chosenNum % 2 == 0);
        System.out.println("Sum of even and multiples of 4 numbers is : " + sum);
    }
}