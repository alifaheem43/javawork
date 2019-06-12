class Vehical
{
	int passengers; // number of passengers
	int fuelcap; // fuel capacity
	int mpg;  // fuel consumption in miles per gallon
}
class VehicalDemo
{
	public static void main (String args[])
	{
	 Vehical minivan;
	 minivan = new Vehical();
	 int range;
	 minivan.passengers =7;
	 minivan.fuelcap = 16;
	 minivan.mpg = 21;
	 range = minivan.fuelcap * minivan.mpg;
	 System.out.println("Minivan can carry" + minivan.passengers + "with a range " + range);
	}
}