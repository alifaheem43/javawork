class LogicalOpTable
{
	public static void main(String args[])
	{
	 boolean p, q;
	 System.out.println("P\tQ\tNOT\tXOR\tOR\tAND");

	 p = true;  q = true;
	 System.out.print(p + "\t" + q + "\t");
	 System.out.print((!p) + "\t" + (p^q) + "\t");
	 System.out.println((p|q) + "\t" + (p&q));

	 p = true;  q = false;
	 System.out.print(p + "\t" + q + "\t");
	 System.out.print((!p) + "\t" + (p^q) + "\t");
	 System.out.println((p|q) + "\t" + (p&q));

	 p = false;  q = true;
	 System.out.print(p + "\t" + q + "\t");
	 System.out.print((!p) + "\t" + (p^q) + "\t");
	 System.out.println((p|q) + "\t" + (p&q));

	 p = false;  q = false;
	 System.out.print(p + "\t" + q + "\t");
	 System.out.print((!p) + "\t" + (p^q) + "\t");
	 System.out.println((p|q) + "\t" + (p&q));
	}
}