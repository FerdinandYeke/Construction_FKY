
public class SingleFamilyHome extends Residential {

	private boolean garage;

	//Default Constructor
	public SingleFamilyHome() {
		super();
		garage = false;
		// TODO Auto-generated constructor stub
	}//Default Constructor ends here

	//Preferred Constructor
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		// TODO Auto-generated constructor stub
	}//Preferred Constructor ends here

	//Setters and Getters start here
	
	/*
	 * isGarage method starts here
	 * @return garage
	 */
	public boolean isGarage() {
		return garage;
	}//isGarage method ends here

	/*
	 * setGarage method starts here
	 * @param garage determines if the home has a garage or not (true or false)
	 */
	public void setGarage(boolean garage) {
		this.garage = garage;
	}//setGarage method ends here
	
	//Draw method starts here
	public void draw()
	{
		System.out.println("Drawing code for SingleFamilyHome");
	}//Draw method ends here
	
	//Display data method 
	public String displayData()
	{		
		return toString();
		
	}//Display data ends here

	@Override
	public String toString() {
		return "SingleFamilyHome [garage= " + garage + ", numBedrooms= " + numBedrooms + ", numBathrooms= " + numBathrooms
				+ ", laundryRoom= " + laundryRoom + ", projectName= " + projectName + ", completeAddress= "
				+ completeAddress + ", totalSquareFeet= " + totalSquareFeet + ", occupancyGroup= " + occupancyGroup
				+ ", subgroup= " + subgroup + "]";
	}//toString method ends here
	//Setters and Getters ends here
	
}//Class ends here
