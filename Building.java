
/**
 * @author ferdi
 *
 */
/**
 * @author ferdi
 *
 */
public class Building {

	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;
	
	//default constructor
	public Building()
	{
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0.0;
		occupancyGroup = "";
		subgroup = "";
		
	}//Default constructor ends here
	
	//Preferred Constructor
	public Building(String projectName, String completeAddress,
					double totalSquareFeet, String occupancyGroup,
					String subgroup)
	{
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
		
	}//Preferred Constructor ends here
	
	
	//Setters and Getters start here
	
	//ProjectName Setter
	/**
	 * @param projectName
	 */
	public void setProjectName(String projectName)
	{
		this.projectName = projectName;
	}// setProjectName Method ends here
	
	
	/*
	 *getCompleteAddress method starts here
	 * @return completeAddress
	 */
	public String getCompleteAddress() {
		return completeAddress;
	}//getCompleteAddress method ends here

	
	/*setCompleteAddress method starts here
	 * @param completeAddress
	 *
	 */
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}//setCompleteAddress method ends here

	/*
	 * getTotalSquareFeet starts here
	 * @return totalSquareFeet
	 */
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}//getTotalSquareFeet method ends here

	/*
	 * setTotalSquareFeet method starts here
	 * this method sets the total square feet of said building 
	 * @param totalSquareFeet
	 */
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}//setTotalSquareFeet method ends here

	/*
	 * getOccupancyGroup starts here
	 * @return occupancyGroup
	 */
	public String getOccupancyGroup() {
		return occupancyGroup;
	}//getOccupancyGroup ends here

	/*
	 * setOccupancyGroup method starts here
	 * @param occupancyGroup 
	 */
	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}//setOccupancyGroup method ends here

	/*
	 * getSubgroup method starts here
	 * @return subgroup
	 */
	public String getSubgroup() {
		return subgroup;
	}//getSubgroup method ends here

	/*
	 * setSubgroup method starts here
	 * @param subgroup sets up the subgroup
	 */
	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}//setSubgroup method ends here

	/*
	 * getProjectName starts here
	 * @return projectName
	 */
	public String getProjectName() {
		return projectName;
	}//getProjectName method ends here

	//Draw method
	public void draw()
	{
		System.out.println("Drawing code for Building");
	}//Draw method ends here
	
	//Display data method 
	public String displayData()
	{		
		return toString();
		
	}//Display method ends here

	@Override
	public String toString() {
		return "Building [projectName= " + projectName + ", completeAddress= " + completeAddress + ", totalSquareFeet= "
				+ totalSquareFeet + ", occupancyGroup= " + occupancyGroup + ", subgroup= " + subgroup + "]";
	}//toString method ends here
	//Setters and getters end here
	
	
}//Class ends here
