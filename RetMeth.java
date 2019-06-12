class Vehical
{
	int passengers; // number of passengers
	int fuelcap; // fuel capacity
	int mpg;
	int range()
	{
		return mpg*fuelcap;
	}
}
class RetMeth
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
	 range1 = minivan.range();
	 range2 = sportscar.range();
	 System.out.println("Minivan can carry " + minivan.passengers + " \twith a range of " + range1 + "  Miles");
	 
	 System.out.println("Sportscar can carry" + sportscar.passengers + " \twith a range of " + range2 + "  Miles");
	
	}
}