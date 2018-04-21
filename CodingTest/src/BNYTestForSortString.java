import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BNYTestForSortString {
	public static void  main(String args[]) throws FileNotFoundException{
		ArrayList<String> listOfLines = new ArrayList<>();
		String FILE_PATH = "C:\\Users\\Bhami\\git\\LocalCodingTest\\CodingTest\\src\\file1.txt";
		try {
			BufferedReader bufReader = new BufferedReader(new FileReader(FILE_PATH));
			String inStr = bufReader.readLine();
			System.out.println("Reading Line" + inStr);
			while (inStr != null) {
				listOfLines.add(inStr); 
				inStr = bufReader.readLine();
			} 
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("inStr:" + listOfLines.toArray());
		//String[] inStr = {"Bhami", "sami", "priya", "rahul", "satish", "Bhami", "rahul", "priya", "priya"};
		HashMap<String, Integer> inMap = new HashMap<String, Integer>();
		for(String str1 : listOfLines){
			for(String str: str1.split(" ")){
				if(!inMap.containsKey(str)){
					inMap.put(str,1); 
				}
				else {
					//int val = inMap.get(str);
					inMap.put(str, (inMap.get(str) +1));
				}
			}
		}
		//System.out.println("Map contains:" + inMap);
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(inMap.entrySet());
		System.out.println("unSorted list contains:" + list);
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
			public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2){
				return entry1.getValue().compareTo(entry2.getValue());
			}
		});
		System.out.println("Sorted list contains:" + list);
	}
}
