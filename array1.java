import java.util.Scanner;
class Question1
{
	public static void main(String args[])
	{
		int array[]={2500,7800,43,58,90,87,5,98};
		System.out.print("The even element array:");
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2==0)
				System.out.print(array[i]+",");
		}
		System.out.println();
		
		System.out.print("The odd element array:");
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2!=0)
				System.out.print(array[i]+",");
		}
	}
}	


class Question2
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int array_A[]=new int[4];
		int array_B[]=new int[4];
		boolean equal=true;
		 
		if(array_A.length==array_B.length)
		{
			for(int i=0;i<array_A.length;i++)
			{
				array_A[i]=input.nextInt();
			}
			System.out.println();
			
			for(int i=0;i<array_B.length;i++)
			{
				array_B[i]=input.nextInt();
			}
			for(int i=0;i<array_A.length;i++)
			{
			if(array_A[i]!=array_B[i])
			{
				equal=false;
				break;
			}
		}
	}
	else
		equal=false;
	if(equal)
		System.out.print("array_A and array_B are equal");
	else
		System.out.print("array_A and array_B are not equal");
}}


class Question3
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int array_A[]={1,2,2,3,4,2};
		int value=0;
		System.out.print("Enter the number:");
		int number=input.nextInt();
		System.out.print("Number off occurances of"+" "+ number+" "+"in array=");
		
		for(int i=0;i<array_A.length;i++)
		{
			if(array_A[i]==number)
				value+=1;
		}
		System.out.print(value);
	}
}

class Question4
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		
		String month[]=new String[12];
		month[0]="january";
		month[1]="February";
		month[2]="March";
		month[3]="April";
		month[4]="May";
		month[5]="June";
		month[6]="July";
		month[7]="August";
		month[8]="September";
		month[9]="October";
		month[10]="November";
		month[11]="December";
		
		System.out.print("Enter the number :");
		int number=input.nextInt();
		int i=number-1;
		System.out.print(month[i]);
	}
}

class Question5
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int A[]=new int[5];
		int B[]=new int[5];
		int C[]=new int[5];
		
		System.out.println("A :");
		for(int i=0;i<A.length;i++)
		{
			A[i]=input.nextInt();
		}
		System.out.println();
		
		System.out.println("B :");
		for(int i=0;i<B.length;i++)
		{
			B[i]=input.nextInt();
		}
		System.out.println();
		
		System.out.println("C=A+B:");
		for(int i=0;i<A.length;i++)
		{
			C[i]=A[i]+B[i];
		System.out.println(C[i]);
	}

}
}
		
			
			
				
		
