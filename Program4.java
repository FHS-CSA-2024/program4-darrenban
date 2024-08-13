//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;

public class program4{
    public static void main(String[] args){
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        double num6 = 0;
        
        Scanner numScanner = new Scanner(System.in);
        
        System.out.println("Give me a 3-digit number.");
        num1 = numScanner.nextInt();
        
        System.out.println("Give me a 3-digit number.");
        num2 = numScanner.nextInt();
        
        System.out.println("Give me a 3-digit number.");
        num3 = numScanner.nextInt();
        
        System.out.println("Give me a 3-digit number.");
        num4 = numScanner.nextInt();
        
        num5 = num1 + num2 + num3 + num4;
        num6 = num5 / 4.0;
        
        System.out.println("The sum of the four numbers is " + num5);
        System.out.println("The average of the four numbers is " + num6);
    
    }
}




//Paste console output below:
/*
Give me a 3-digit number.
475
Give me a 3-digit number.
821
Give me a 3-digit number.
369
Give me a 3-digit number.
562
The sum of the four numbers is 2227
The average of the four numbers is 556.75

*/
