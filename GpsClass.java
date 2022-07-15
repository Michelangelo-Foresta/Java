import java.util.ArrayList;

public class GpsClass {
	private ArrayList<Double> x = new ArrayList<Double>();
	private ArrayList<Double> y = new ArrayList<Double>();
	private ArrayList<Integer> time = new ArrayList<Integer>();
	private ArrayList<ArrayList<Double>> waypoint = new ArrayList<ArrayList<Double>>();
	private int tmpTime=0;
	
	public void storeWaypoint(double x, double y) {
		this.x.add(x);
		this.y.add(y);
		setWaypoint();
	}
	
	public void setWaypoint() {
		waypoint.add(x);
		waypoint.add(y);
	}

	public void timeToCheckpoint(int timestamp) {
		time.add(timestamp-tmpTime);
		tmpTime=timestamp;
	}
	
	public double DistanceTravelled() {
		double StartLongitude = waypoint.get(0).get(0);
		double StartLatitude = waypoint.get(1).get(0);
		double EndLongitude = waypoint.get(0).get(x.size() - 1);
		double EndLatitude = waypoint.get(1).get(y.size() - 1);
		return ((EndLongitude-StartLongitude)+(EndLatitude-StartLatitude))/10;
	}
	public int TimeTravelled() {
		return (time.get(time.size()-1));
	}
	
	public String toString() {
		return ("\nYou hiked a total of "+DistanceTravelled()+" miles in a total of "+TimeTravelled()+" seconds!\n");
	}
	
	}
	