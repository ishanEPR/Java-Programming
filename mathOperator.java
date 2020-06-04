import java.util.Scanner;
public class mathOperator{
    public static void main(String[] args)
    {
       //math operator +,-,/,*,% ...
        Scanner s1=new Scanner(System.in);
        
        System.out.println("Enter your first number= ");
        int a=s1.nextInt();
        System.out.println("Enter your second number= ");
        int b=s1.nextInt();
        System.out.println("Sum of the two numbers= "+(a+b));
        System.out.println("Subtraction of the two numbers= "+(a-b));
        System.out.println("Multiply of the two numbers= "+(a*b));
        System.out.println("Division of the two numbers= "+(a/b));
        System.out.println("Module of the two numbers= "+(a%b));
        
       
        
        
        
    }
    
}

        
