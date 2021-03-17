import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class CountOccurenceOfLetters {
	public String countLetterFrequency(String s)
	{
		ArrayList<Character> allLeters = new ArrayList<Character>();
		for(int i = 0; i < s.length(); i++)
			allLeters.add(s.charAt(i));
		TreeSet<Character> uniqueLetters = new TreeSet<Character>(allLeters);
		String output = "";
		for(Character letter : uniqueLetters)
			output += letter + "" + Collections.frequency(allLeters, letter);		
		return output;
	}
public static void main(String []args)
{
	CountOccurenceOfLetters obj=new CountOccurenceOfLetters();
	System.out.println(obj.countLetterFrequency("aaabbccddddd"));
	}

}
