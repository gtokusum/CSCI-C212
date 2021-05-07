
public class Data {
	/**
	 * Computes the average of the measures of the given objects
	 * @param objects an array of Measurable Objects
	 * @return the average of the measures
	 */
	public static double average(Measurable[] objects) {
		double sum = 0;
		for (Measurable obj: objects) {
			sum = sum + obj.getMeasure();
		}
		if (objects.length>0) {
			return sum/objects.length;
		}
		else {
			return 0;
		}
	}
}
