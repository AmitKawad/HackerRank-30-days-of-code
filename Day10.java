import java.util.*;
class Day10
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
	
		int n;
		int count=1;
		n=scan.nextInt();
		String st1=new String();
		st1=Integer.toBinaryString(n);
		
		int size=st1.length();

		for(int i=0;i<size-1;i++)
		{
			if(st1.charAt(i)==st1.charAt(i+1))
				 count=count+1;
		}
		System.out.println(count);
	
	
	
	}
}