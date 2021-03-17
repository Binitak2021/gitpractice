import java.util.Arrays;

public class ReverseASentence 
{
	public String reverseSentence(String s)
	{
		String reverse="";
		for(int i=s.length()-1;i>=0;i--)
			reverse+=s.charAt(i);
		return reverse;
	}
    
    public static void main(String[]args)
    {
    	ReverseASentence obj=new ReverseASentence();
    	System.out.println(obj.reverseSentence("my name is binita"));
    }
}
