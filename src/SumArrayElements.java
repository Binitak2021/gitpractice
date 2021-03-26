package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayElements 
{
	public int elementSum(int[]arr)
	{
		int sum=0;
		for(int i:arr)
		{
			sum+=i;
		}
		return sum;
	}
	@Test
	public void summingElements()
	{
		Assert.assertEquals(elementSum(new int[] {1,2,3}), 6);
		Assert.assertEquals(elementSum(new int[] {1,2,3,4,10,11}), 31);
	}
	

}
