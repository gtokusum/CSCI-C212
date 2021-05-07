
public class DistanceTo implements Comparable<DistanceTo>{

	private String target;
	private int distance;
	
	/**
	 * constructor
	 * @param String city
	 * @param int dist
	 */
	public DistanceTo(String city, int dist) {
		target = city;
		distance = dist;
	}
	
	/**
	 * get target city
	 * @return String target
	 */
	public String getTarget() {
		return target;
	}
	
	/**
	 * get distance 
	 * @return int distance
	 */
	public int getDistance() {
		return distance;
	}
	
	
	@Override
	public int compareTo(DistanceTo arg0) {
		return distance - arg0.distance;
	}

	
}
