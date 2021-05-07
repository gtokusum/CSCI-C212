import java.io.*;
import java.util.*;
import java.util.Map.Entry;


public class Routes {
	private Map<String, HashSet<DistanceTo>> routeMap; 
	private String inputFile;
	private String startCity;
	
	/**
	 * Constructor
	 * @param fileName
	 * @throws FileNotFoundException
	 */
	public Routes(String fileName) throws FileNotFoundException {		
		inputFile = fileName;
		routeMap = new HashMap<String,HashSet<DistanceTo>>();
		populateFiles();
	}
	
	/**
	 * populates routeMap using map.txt
	 * @throws FileNotFoundException
	 */
	public void populateFiles() throws FileNotFoundException{
		try {
			File testFile = new File(inputFile);
			Scanner in = new Scanner(testFile);
			HashSet<DistanceTo> tmpSet = new HashSet<DistanceTo>();
			while (in.hasNext()) {
				String start = in.next();
				String target = in.next();
				int dist = in.nextInt();
				if (routeMap.containsKey(start)) {
					tmpSet = routeMap.get(start);
					tmpSet.add(new DistanceTo(target,dist));
					routeMap.put(start, tmpSet);
				}
				else {
					tmpSet.add(new DistanceTo(target,dist));
					routeMap.put(start, tmpSet);
				}
			}
			in.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	 
	/**
	 * find the shortest distance
	 * @return Map<String,Integer> shortestKnownDistance
	 */
	public Map<String, Integer> findShortestKnownDistance(String start) {
		// implement the algorithm using priority queue  
		Map<String, Integer> shortestKnownDistance = new HashMap<String,Integer>();
		PriorityQueue<DistanceTo> list = new PriorityQueue<DistanceTo>();
		startCity = start;
		list.add(new DistanceTo(startCity,0));
		for (Entry<String, HashSet<DistanceTo>> m:routeMap.entrySet()) {
			Iterator<DistanceTo> it = m.getValue().iterator();
			while (it.hasNext()) {
				list.add(it.next());
			}
		}
		while (!list.isEmpty()) {
			DistanceTo tmp = list.poll();
			if (!shortestKnownDistance.containsKey(tmp.getTarget())) {
				shortestKnownDistance.put(tmp.getTarget(), tmp.getDistance());
				for(Entry<String,HashSet<DistanceTo>> m:routeMap.entrySet()) {
					Iterator<DistanceTo> it = m.getValue().iterator();
					if (tmp.getTarget().equals(m.getKey())) {
						while(it.hasNext()) {
							DistanceTo tmpDist = it.next();
							list.add(new DistanceTo(tmpDist.getTarget(),tmpDist.getDistance() + tmp.getDistance()));
						}
					}
				}
			}
		}
		
		return shortestKnownDistance;
	}
	
	/**
	 * creates shortestDistances.txt and prints output of algorithm
	 * @param Map<String,Integer> m
	 * @throws FileNotFoundException 
	 */
	public void createFile(Map<String,Integer> m) throws FileNotFoundException {
		PrintWriter out = new PrintWriter("shortestDistances.txt");
		for (Entry<String,Integer> tmp:m.entrySet()) {
			if (!tmp.getKey().equals(startCity)) {
			out.println(tmp.getKey() + ":" + tmp.getValue());
		
			}
		}
		out.close();
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		Routes test = new Routes("map.txt");
		
		//Change argument in findShortestKnownDistance to change start city
		Map<String,Integer> m = test.findShortestKnownDistance("Pendleton");
		test.createFile(m);
	}
}