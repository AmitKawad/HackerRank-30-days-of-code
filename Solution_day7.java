import java.util.*;
public class Solution_day7
{
	public static void main(String args[])
	{
		int n;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		Map<String,String> mymap=new HashMap<String,String>();
		for(int i=0;i<n;i++)
		{
			String name=scan.next();
			int phone=scan.nextInt();
			mymap.put(name,Integer.toString(phone));
			scan.nextLine();
		}
		while(scan.hasNext())
		{
			String s=scan.next();
			if(mymap.containsKey(s))
			{
				System.out.println(s+"="+mymap.get(s));
			}
			else
			{
				System.out.println("Not Found");
			}
		}
		scan.close();



	}
}