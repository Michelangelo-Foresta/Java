import java.util.Scanner;

public class Gps {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double Longitude,Lattitude;
		int timestamp;
		String response="y";
		GpsClass gps = new GpsClass();
		
		do {
		System.out.print("Please Enter Waypoint Below: \nLongitude: ");
		Longitude = input.nextDouble();
		System.out.print("Lattitude: ");
		Lattitude = input.nextDouble();
		gps.storeWaypoint(Longitude,Lattitude);
		System.out.print("Time: ");
		timestamp = input.nextInt();
		gps.timeToCheckpoint(timestamp);
		
		System.out.println("\nWould you like to enter a new waypoint? y/n");
		response = input.next();
		
		if(response.equals("n")) {
			System.out.println(gps.toString());
			System.out.println("Journey completed!");
			input.close();
			System.exit(0);
		}	
		
	}while(!response.equals("n"));
	
	}
}

