class NestedSwitch
{
	public static void main(String args [])
	{
		char ch1='A';
		char ch2='A';
	 switch(ch1)
	 {
	  case 'A': System.out.println("This A is part of outer switch.");
	  switch(ch2)
	  {
	   case 'A':
	   System.out.println("This A is part of inner switch");
	   break;
	   case 'B': // ...
	  }
	  break;
	  case 'B': // ...
	 }
	}
}