
public class Apartment extends Residential {
	
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvaliable;
	
	//Default Constructor
	public Apartment() {
		super();
		numRentableUnits = 0;
		avgUnitSize = 0.0;
		parkingAvaliable = false;
		// TODO Auto-generated constructor stub
	}//Default Constructor ends here
	
	//Preferred Constructor
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		// TODO Auto-generated constructor stub
	}//Preferred Constructor ends here
	
	//Setters and Getters start here
	
	/*
	 * getNumRentableUnits method starts here
	 * @return numRentableUnits
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}//getNumRentableUnits method ends here
	
	/*
	 * setNumRentableUnits method starts here
	 * @param numRentableUnits sets the rentableUnits of the apartment
	 */
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}//setNumRentableUnits method ends here
	
	/*
	 * getAvgUnitSize methods starts here
	 * @return avgUnitSize
	 */
	public double getAvgUnitSize() {
		return avgUnitSize;
	}//getAvgUnitSize method ends here
	
	/*
	 * setAvgUnitSize methods starts here
	 * @param avgUnitSize sets the average unit size of the apartment
	 */
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}//setAvgUnitSize method ends here
	
	/*
	 * isParkingAvaliable method starts here
	 * @return parkingAvaliable
	 */
	public boolean isParkingAvaliable() {
		return parkingAvaliable;
	}//isParkingAvaliable method ends here
	
	/*
	 * setParkingAvaliable method starts here
	 * @param parkingAvaliable sets if there are parking spaces
	 * Available at the apartment
	 */
	public void setParkingAvaliable(boolean parkingAvaliable) {
		this.parkingAvaliable = parkingAvaliable;
	}//setParkingAvaliable method ends here
	
	//Draw method starts here
	public void draw()
	{
		System.out.println("Drawing code for Apartment");
	}//Draw method ends here
	
	//Display data method 
	public String displayData()
	{		
		return toString();
		
	}//Display method ends here
	@Override
	public String toString() {
		return "Apartment [numRentableUnits= " + numRentableUnits + ", avgUnitSize= " + avgUnitSize
				+ ", parkingAvaliable= " + parkingAvaliable + ", numBedrooms= " + numBedrooms + ", numBathrooms= "
				+ numBathrooms + ", laundryRoom= " + laundryRoom + ", projectName= " + projectName + ", completeAddress= "
				+ completeAddress + ", totalSquareFeet= " + totalSquareFeet + ", occupancyGroup= " + occupancyGroup
				+ ", subgroup= " + subgroup + "]";
	}//toString method ends here
	//Setters and Getters end here	
	
}//Class end here
