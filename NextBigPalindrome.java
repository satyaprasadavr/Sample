import java.math.BigInteger;


public class NextBigPalindrome {
	public static String getNextBigPalindromeAfter(String x)
	{
		BigInteger bi=new BigInteger(x);
		bi=bi.add(new BigInteger("1"));
		while(true)
		{
			String rev=new StringBuffer(bi.toString()).reverse().toString();
			if(rev.equals(bi.toString()))
				break;
			bi=bi.add(new BigInteger("1"));
			System.out.println(bi);
		}
		return bi.toString();
	}
	public static boolean checkDigitsOnly(String x)
	{
		for(char ch:x.toCharArray())
		{
			if(!Character.isDigit(ch))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		final String n="1334511111111111111111111111111111111111111111111111111145500";
		
		if(checkDigitsOnly(n))
		{
			String nextBigPalindrome=getNextBigPalindromeAfter(n);
			System.out.println(nextBigPalindrome);
		}
		else
		{
			System.out.println("Wrong input");
		}
		
	}
}
