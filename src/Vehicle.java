

/**
 * @author chandan
 * Class Description: Creating Vehicle Class se as a Super class for others Vehicles
 *
 */
public abstract class Vehicle {
//Private Properties ---=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
	protected int numWheels= 4;
	protected int numDoors= 2;
	protected String colour=" ";
	protected String make="";
	protected String model="";
	protected String year=" ";
	protected float speed=0; 
	protected final int MAX_SPEED = 40;
	
	//Get Accessor Methods -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==
	/**
	 * @return the numWheels
	 */
	public int getNumWheels() {
		return this.numWheels;
	}

	/**
	 * @return the numDoors
	 */
	public int getNumDoors() {
		return this.numDoors;
	}

	

	/**
	 * @return the colour
	 */
	public String getColour() {
		return this.colour;
	}

	

	/**
	 * @return the make
	 */
	public String getMake() {
		return this.make;
	}

	

	/**
	 * @return the model
	 */
	public String getModel() {
		return this.model;
	}

	
	/**
	 * @return the year
	 */
	public String getYear() {
		return this.year;
	}

	/**
	 * @return the Speed
	 */
	public float getSpeed() {
		return this.speed;
	}
	
	//getter ends here
	
	
	public Vehicle(int wheels,int doors,String colour, String make, String model, String year){
		this.numWheels=wheels;
		this.numDoors=doors;
		this.colour=colour;
		this.make=make;
		this.model=model;
		this.year=year;
		
	}
	
	public Vehicle(String colour, String make, String model, String year){
		
		this.colour=colour;
		this.make=make;
		this.model=model;
		this.year=year;
		
	}
	//public MEthods -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-===-=-=-=-
	//Must be Overridden
	public abstract void accelerate();
	
	public abstract void decelerate();
	
	
	public void turnLeft(){
		System.out.println("Turning Left");
		
	}
	
	public void turnRight(){
		System.out.println("Turning Right");
		
	}

	
	
	
}
