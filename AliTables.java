import java.util.Scanner;
public class AliTables 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
    System.out.print("Enter number:");        
    int n=s.nextInt();
        for(int i=1; i <= 20; i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}