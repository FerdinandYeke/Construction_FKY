
public class Mall extends Business {
	
	private int numRentedUnit;
	private double medianUnitSize;
	private int numParkingSpace;
	
	//Default Constructor
	public Mall() {
		super();
		// TODO Auto-generated constructor stub
	}//Default constructor ends here
	
	//Preferred Constructor
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup, int numRentableUnits) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numRentableUnits);
		// TODO Auto-generated constructor stub
	}//Preferred Constructor ends here
	
	//Setters and Getters start here
	
	/*
	 * getNumRentedUnit method starts here
	 * @return numRentedUnit
	 */
	public int getNumRentedUnit() {
		return numRentedUnit;
	}//getNumRentedUnit method ends here
	
	/*
	 * setNumRentedUnit method starts here
	 * @param numRentedUnit sets the rented units of building
	 */
	public void setNumRentedUnit(int numRentedUnit) {
		this.numRentedUnit = numRentedUnit;
	}//setNumRentedUnit method ends here
	
	/*
	 * getMedianUnitSize method starts here
	 * @return medianUnitSize
	 */
	public double getMedianUnitSize() {
		return medianUnitSize;
	}//getMedianUnitSize method ends here
	
	/*
	 * setMedianUnitSize method starts here
	 * @param medianUnitSize sets the median unit size of building
	 */
	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}//setMedianUnitSize method ends here
	
	/*
	 * getNumParkingSpace method starts here
	 * @return numParkingSpace
	 */
	public int getNumParkingSpace() {
		return numParkingSpace;
	}//getNumParkingSpace method ends here
	
	/*
	 * setNumParkingSpace method starts here
	 * @param numParkingSpace sets the number of parking spaces the mall has
	 */
	public void setNumParkingSpace(int numParkingSpace) {
		this.numParkingSpace = numParkingSpace;
	}//setNumParkingSpace method ends here
	
	//Draw method
		public void draw()
		{
			System.out.println("Drawing code for Mall");
		}//Draw method ends here
			
		//Display data method 
		public String displayData()
		{		
			return toString();
				
		}//Display data method ends here

		@Override
		public String toString() {
			return "Building [projectName= " + projectName + ", completeAddress= " + completeAddress + ", totalSquareFeet= "
					+ totalSquareFeet + ", occupancyGroup= " + occupancyGroup + ", subgroup= " + subgroup + "]";
		}//toString method ends here
		//Setters and Getters end here
	

}//Class ends here
