
public class Business extends Building {
	
	protected int numRentableUnits;
	
	//Default constructor
	public Business()
	{
		super();
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0.0;
		occupancyGroup = "";
		subgroup = "";
		numRentableUnits = 0;
	}//Default constructor ends here
	
	
	//Preferred Constructor
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup, int numRentableUnits) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numRentableUnits = numRentableUnits;
	}//Preferred Constructor ends here

	
	//Draw method
		public void draw()
		{
			System.out.println("Drawing code for Business");
		}//Draw method ends here
		
		/*
		 * getNumRentableUnits method starts here
		 * @return numRentableUnits
		 */
		public int getNumRentableUnits() {
			return numRentableUnits;
		}//getNumRentableUnits method ends here

		/*
		 * setNumRentableUnits starts here
		 * @param numRentableUnits sets up the rentableUnits of said building
		 */
		public void setNumRentableUnits(int numRentableUnits) {
			this.numRentableUnits = numRentableUnits;
		}//setNumRentableUnits method ends here

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
}
