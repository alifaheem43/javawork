class Guess2{
	public static void main(String args[])
	  throws java.io.IOException{

	  char ch, answer = 'K';

	  System.out.println("I ' m thinking of a letter between A and Z.");
	  System.out.print("Can You Guess it:");

	  ch = (char) System.in.read(); // read a char from the keyboard

	  if(ch == answer) System.out.println("** Right **");
	  else  System.out.println("....Sorry, You're Wrong.");
	  }
}