
public class ReverseString 
{
	public String reverseString(String s)
	{
		String output="";
		for(int i=s.length()-1;i>=0;i--)
		{
			output+=s.charAt(i);			
		}
		return output;
	}
	public static void main(String[] args) 
	{
		ReverseString obj=new ReverseString();
		System.out.println(obj.reverseString("selenium"));
	}

}
