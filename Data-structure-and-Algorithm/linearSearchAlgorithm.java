import java.util.Scanner;
public class linearSearchAlgorithm{
    public static void main(String[] args)
    {
     int arr[]={1,2,33,44,55,43,2};
     Scanner s=new Scanner(System.in);
        System.out.println("Enter if you want to number= ");
        int data=s.nextInt();
        int found=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr.equals(data))
            {
                found=1;
                System.out.println("Your value is found index= "+i);
                break;
            }
        }
        if(found==0)//it means data was not found
        {
            System.out.println("Your value is not found");  
        }
        
        
        
        
    }
    
}

        
