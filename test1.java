import java.util.Scanner;
class test1
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your base no:");
		int base=in.nextInt();
		
		System.out.println("Enter your power no:");
		int total=1;
		int power=in.nextInt();
		
		for(int i=1;i<=power;i++)
		{
			total*=base;
		}
			{
				System.out.println("The total is:"+total);
			}
	}
}






class test2
{
	public static void main(String args[])
	{
		System.out.println("Type a word:");
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int n=s.length();
		boolean isPalindrome=true;
		
		for(int i=0;i<=n/2;i++)
		{
			if(s.charAt(i)!=s.charAt(n-1-i))
			{
				isPalindrome=false;
				break;
			}
		}
		System.out.println("is this a Palindrome:" +isPalindrome);
	}
}

class test3
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		do
		{
			System.out.println("Enter the first value:");
			float a=in.nextFloat();
			System.out.println("Enter the second value:");
			float b=in.nextFloat();
			System.out.println("The sum is:"+(a+b));
			System.out.println("Are you wishes to continue operation again.");
			String s=in.next();
			
			if(!s.equals("yes"))
				break;
		}
		while(true);
	}
}
		
		
class test4
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int min=0;
		int max=0;
		int n=1;
		
		System.out.println("Enter 10 numbers:");
		while(n<=10)
		{
			int value=in.nextInt();
			if(n==1)
			{
				max=value;
				min=value;
			}
			if(value>max)
				max=value;
			else if (value<min)
				min=value;
			n++;
		}
		System.out.println("Maximum No=" +max+"\n"+"Minimum No="+min);
	}
}
