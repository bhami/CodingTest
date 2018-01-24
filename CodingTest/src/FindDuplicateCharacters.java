import java.util.HashMap;

public class FindDuplicateCharacters {

	public static void main(String[] args) {
		printDuplicateCharacters("Programming");
	}
	
	public static void printDuplicateCharacters(String word){
		char[] characters = word.toCharArray();
		HashMap<Character, Integer> charMap = new HashMap<Character,Integer>();
		for(Character ch : characters){
			if (charMap.containsKey(ch))
				charMap.put(ch, charMap.get(ch) + 1);
			else
				charMap.put(ch, 1);
			}
		}
	// Iterate through HashMap to print all duplicate characters of String

	//Set<Map.Entry<Character,Integer>> entrySet = charMap.entrySet();
		//Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		
		
	}


