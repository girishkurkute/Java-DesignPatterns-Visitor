package fileVisitors.util;

public class Helper {

	/**
	 * Function to check Prime number
	 * @param length of a word
	 * 
	 */
	public Boolean checkPrimeNo(int length) {
		// TODO Auto-generated method stub
		int num = length ;
		int half = length/2;
		Boolean flag = true;
		
		if(num ==0 || num ==1)
		{
			flag =false;
		}
		else
		{
			for(int k=2;k<=half;k++)
			{
				if(num%k==0)
				{
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

	/**
	 * Function to check word is palindrome 
	 * @param tempword a string to be checked 
	 * 
	 */
	public Boolean checkPalindrome(String tempword) {
		// TODO Auto-generated method stub
		String strOriginal = tempword;
		String strReversed = "";
		int len = -1;
		len = strOriginal.length();
		for(int k = len-1;k>=0;k--)
		{
			strReversed = strReversed+strOriginal.charAt(k);
		}
		return strOriginal.equalsIgnoreCase(strReversed);
	}

}
