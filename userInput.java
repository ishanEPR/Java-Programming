//firstly we can import the Scanner class
import java.awt.BorderLayout;
import java.util.Scanner;
public class userInput{
    public static void main(String[] args)
    {
        Scanner sun=new Scanner(System.in);//here I create the object of Scanner class
        Scanner sun1=new Scanner(System.in);
        Scanner sun2=new Scanner(System.in);
        Scanner sun3=new Scanner(System.in);
        System.out.println("Enter your first name= "+sun.next());//here we can print the one word
        System.out.println("Enter your full name= "+sun1.nextLine());//print the any other word
        System.out.println("Enter your age= "+sun1.nextInt());
        System.out.println("Enter your salary= "+sun1.nextDouble());
       
        
        
        
    }
    
}

        
