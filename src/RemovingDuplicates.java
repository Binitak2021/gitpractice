
import java.util.ArrayList;
public class RemovingDuplicates
{
	public void removeDuplicates(String words)
	{
		String[] arr = words.split(" ");
		ArrayList<String> newWords = new ArrayList<String>();
		for(String word : arr)
			if(!newWords.contains(word))
				newWords.add(word);
		for(String word : newWords)
			System.out.print(word + " ");
	}
	
	public static void main(String[] args) 
	{
		RemovingDuplicates obj = new RemovingDuplicates();
		obj.removeDuplicates("Hello World Hello");
	}
}