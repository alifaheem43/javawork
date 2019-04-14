import java.util.Scanner;
class Genious
{
	public static void main (String args[])
	{
		Scanner s = new Scanner(System.in);
    System.out.print("Enter number:");
     int n=s.nextInt();
	 int i = 0;

	 if(i < 5)
	 System.out.println("You are Genious" + i);
	 else
	 {
	 	System.out.println("You Are Not Genious");
	 }
	}
}