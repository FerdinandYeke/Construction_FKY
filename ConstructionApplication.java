
public class ConstructionApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Building Block starts here
		Building b1 = new Building();
		b1.setProjectName("Gaines House");
		b1.setCompleteAddress("123 Main Street, Louisville, Kentucky 40201.");
		b1.setOccupancyGroup("Residential");
		b1.setTotalSquareFeet(2540);
		b1.setSubgroup("R1");
		b1.draw();
		System.out.println(b1.displayData());
		System.out.println("");
		//Building Block ends here
		
		//SingleFamilyHome Block Starts here
		SingleFamilyHome b3 = new SingleFamilyHome();
		b3.setProjectName("Gaines House");
		b3.setCompleteAddress("123 Main Street, Louisville, Kentucky 40201.");
		b3.setCompleteAddress("123 Main Street, Louisville, Kentucky 40201.");
		b3.setOccupancyGroup("Residential");
		b3.setTotalSquareFeet(2540);
		b3.setSubgroup("R2");
		b3.setNumBathrooms(3);
		b3.setNumBedrooms(3);
		b3.setLaundryRoom(true);
		b3.setGarage(false);
		b3.draw();
		System.out.println(b3.displayData());
		System.out.println("");
		//SingleFamilyHome Block ends here
		
		//Mall Block starts here
		Mall m1 = new Mall();
		m1.setProjectName("Jefferson Mall");
		m1.setCompleteAddress("150 Just Street, Louisville, Kentucky 40503.");
		m1.setNumParkingSpace(180);
		m1.setMedianUnitSize(400);
		m1.setOccupancyGroup("Buisness");
		m1.setNumRentedUnit(50);
		m1.setTotalSquareFeet(80000);
		m1.setSubgroup("B");
		m1.draw();
		System.out.println(m1.displayData());
		System.out.println("");
		//Mall block ends here
		
		//Apartment block starts here
		Apartment a1 = new Apartment();
		a1.setProjectName("John's Apartments");
		a1.setCompleteAddress("2834 Jade Street, Louisville, Kentucky 40201.");
		a1.setAvgUnitSize(100);
		a1.setNumBathrooms(23);
		a1.setNumBedrooms(25);
		a1.setNumRentableUnits(20);
		a1.setParkingAvaliable(true);
		a1.setLaundryRoom(true);
		a1.setOccupancyGroup("Residential");
		a1.setSubgroup("R3");
		a1.draw();
		System.out.println(a1.displayData());
		System.out.println("");
		//Apartment Block ends here
		
		//Business Block starts here
		Business Business1 = new Business();
		Business1.setProjectName("Harry's Buisness");
		Business1.setCompleteAddress("1998 Wizard way, Louisville, Kentucky 40202");
		Business1.setTotalSquareFeet(5000);
		Business1.setNumRentableUnits(500);
		Business1.setOccupancyGroup("Business");
		Business1.setSubgroup("B");
		Business1.draw();
		System.out.println(Business1.displayData());
		//Business Block ends here
	}//Main ends here

}//Classes end here
