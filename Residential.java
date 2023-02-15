
public class Residential extends Building{

	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	//Default Constructor
	public Residential() {
		super();
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;
		// TODO Auto-generated constructor stub
	}//Default Constructor ends here
	
	//Preferred Constructor
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		// TODO Auto-generated constructor stub
	}//Preferred Constructor ends here
	
	//Setters and Getters start here
	
	/*
	 * getNumBedrooms method start here
	 * @return numBedrooms
	 */
	public int getNumBedrooms() {
		return numBedrooms;
	}//getNumBedrooms end here
	
	/*
	 * setNumBedrooms method start here
	 * @param numBedrooms sets the number of bedrooms of house/apartment
	 */
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}//setNumBedrooms method ends here
	
	/*
	 * getNumBathrooms method start here
	 * @return numBathrooms
	 */
	public int getNumBathrooms() {
		return numBathrooms;
	}//getNumBathrooms method ends here
	
	/*
	 * setNumBathrooms method starts here
	 * @param setNumBathrooms sets the number of bathrooms of house/apartment
	 */
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}//setNumBathrooms method ends here
	
	/*
	 * isLaundryRoom method starts here
	 * @return laundryRoom
	 */
	public boolean isLaundryRoom() {
		return laundryRoom;
	}//isLaundryRoom method ends here
	
	/*
	 * setLaundryRoom method starts here
	 * @param laundryRoom determines if the house/apartment has a laundry room (true or false)
	 */
	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}//setLaundryRoom method ends here
	
	//Draw method
		public void draw()
		{
			
		}//Draw method ends here
		
		//Display data method 
		public String displayData()
		{		
			return toString();
			
		}//Display data method ends here
		
		@Override
		public String toString() {
			return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
					+ laundryRoom + "]";
		}//toString method ends here
		//Setters and Getters ends here
		
	
}//Class ends here
