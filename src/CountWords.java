
public class CountWords
{
	public int numOfWords(String words)
	{
		int numberOfWords = 0;
		String[] arr = words.split(" ");
		for(String word : arr)
		{
			boolean isWord = true;
			for(int i = 0; i < word.length(); i++)
				if(!Character.isLetter(word.charAt(i)))
					isWord = false;
			if(isWord)
				numberOfWords++;
		}
		return numberOfWords;
	}
	
	public static void main(String[] args) 
	{
		CountWords obj = new CountWords();
		System.out.println(obj.numOfWords("Hello World"));
	}
}