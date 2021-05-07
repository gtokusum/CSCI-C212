import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.Map.Entry;

public class FrequencyCounter {

	private File inputFile;
	private String vowels = "aeiou";
	private String filename;
	private Scanner in;
	private int lines = 0;
	private int words = 0;
	private int lengthWords = 0;
	private int distinct = 0;

	private Map<String,Integer> distinctWords = new HashMap<String,Integer>();
	
	/**
	 * consturctor
	 * @param filename
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public FrequencyCounter(String filename) throws FileNotFoundException,IOException{
		this.filename = filename;
		this.PopulateFiles();
	}
	
	/**
	 * method to populate files
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void PopulateFiles() throws FileNotFoundException, IOException{
		try {
			this.inputFile = new File(this.filename);
			this.in = new Scanner(this.inputFile);
			Path file = Paths.get(this.filename);
			lines = (int) Files.lines(file).count();
			while (in.hasNext()) {
				String next = in.next().toLowerCase();
				words++;
//				if (vowels.indexOf(Character.toLowerCase(next.charAt(0))) != -1 && !distinctWords.containsKey(next)) {
//					distinct++;
//				}
				if (distinctWords.containsKey(next)) {
					distinctWords.put(next,distinctWords.get(next)+1);
				}
				else {
					distinctWords.put(next, 1);
				}
				
			}
		}
		catch (FileNotFoundException exception) {
			exception.printStackTrace();
		}
		
	}
	
	/**
	 * creates statistics.txt
	 * @param length
	 * @throws FileNotFoundException
	 */
	public void create(int length) throws FileNotFoundException {
		PrintWriter out = new PrintWriter("statistics.txt");
		ArrayList<StringData> stringInfo = new ArrayList<StringData>();
		ArrayList<StringData> vowelInfo = new ArrayList<StringData>();
		out.println(this.filename + " has " + words + " number of words");
		out.println(this.filename + " has " + lines + " number of lines");
		for (Entry<String, Integer> m:distinctWords.entrySet()) {
			stringInfo.add(new StringData(m.getKey(),m.getKey().length(),m.getValue()));
		}
		Collections.sort(stringInfo);
		
		for (StringData d:stringInfo) {
			if(vowels.indexOf(Character.toLowerCase(d.getWord().charAt(0))) != -1) {
				//out.println(d.getWord() + " {Word Length: "+d.getLength()+" }: " +d.getCount());
				vowelInfo.add(d);
				distinct++;
			}
			if (d.getLength() == length) {
				lengthWords++;
			}
		}
		out.println(this.filename + " has " + distinct + " distinct words that start with a vowel");
		for (StringData d:vowelInfo) {
			out.println(d.getWord() + " {Word Length: "+d.getLength()+" }: " +d.getCount());
		}
		
//		for (StringData d:stringInfo) {
//			if (d.getLength() == length) {
//				lengthWords++;
//			}
//		}
		out.println(this.filename + " has " + lengthWords + " distinct words with length " + length);
		out.close();
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		FrequencyCounter test = new FrequencyCounter("small.txt");
		//change argument below to change length value
		test.create(2);
	}
	
}
