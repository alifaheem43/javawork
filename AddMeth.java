class Vehical
{
	int passengers; // number of passengers
	int fuelcap; // fuel capacity
	int mpg;
	void range()
	{
		System.out.println("Range is " + fuelcap*mpg);
	}
}
class AddMeth
{
	public static void main(String args[])
	{
	 Vehical minivan = new Vehical();
	 Vehical sportscar = new Vehical();
	 int range1, range2 ;
	 minivan.passengers =7;
	 minivan.fuelcap = 16;
	 minivan.mpg = 21;
	 sportscar.passengers =2;
	 sportscar.fuelcap = 14;
	 sportscar.mpg = 12;
	 System.out.print("Minivan can carry " + minivan.passengers + " = ");
	 minivan.range();
	 System.out.print("Sportscar can carry" + sportscar.passengers + " = ");
	 sportscar.range();
	}
}