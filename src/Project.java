/**
 * 
 */

/**
 * @author chandan
 *@Program Description: Demo files for COMP1011 Lesson 03
 *@version 0.2- Added Vehicle Class
 */
public class Project {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SportsUtilityVehicle myHonda= new Vehicle(4,4,"Black","Honda","Pilot","2015");
		
		Truck myFord= new Truck(6,3,"White","Ford","FX","2008");
		
		for(int seconds=0;seconds<10;seconds ++){
			myHonda.accelerate();
			myFord.accelerate();
		}
		
		System.out.println("Vehicle Speed" + myHonda.getSpeed());
		System.out.println("Truck Speed" + myFord.getSpeed());
		
	}

}
