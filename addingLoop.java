
import java.util.Scanner;
public class addingLoop {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0; // sum variable to store sum

        System.out.println("Enter Number between 1-20 : "); // Asking user to enter number between 1-20
        int num=sc.nextInt();


        while(!(num>1 && num<20))  // Checking if number is not within the expected range of 1-20

        {    System.out.println("Please Enter Number between 1-20 : "); // Asking user to enter number until the condition is met

              num=sc.nextInt();

        }
           // if the number is between 1-20

                for(int i=1;i<=num;i++)  // Iterating from 1 till the entered number
                {
                        sum=sum+i; // Adding every number from 1 to the entered number
                }
                System.out.println("The sum is : "+ sum); //Displaying sum


    }

}
