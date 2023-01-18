import java.util.Scanner;
class D2Array1
{
	public static void main(String args[])
	{
		int A[][]={{2,2,3,4,5},{1,2,3,4,5},{5,4,6,7,8}};
		for(int i=0;i<10;i++)
		{
			int count=0;
			for(int j=0;j<A.length;j++)
			{
				for(int k=0;k<A[j].length ;k++)
				
				{
					if(A[j][k]==i)
					count++;
				}
			}
			System.out.println("Element "+i+" appears = "+count);
		}
	}
}
			

class D2Array2
{
	public static void main(String args[])
	{
		int A[][]={{2,2,3,4,5},{1,2,3,4,5},{5,4,6,7,8}};
		int row[]=new int[3];
		for(int i=0;i<A.length;i++)
		{
			int count=0;
			for(int j=0;j<A[i].length;j++)
			{
				count+=A[i][j];
			}
			row[i]=count;
		}
		System.out.print("Rows sum is:");
		for(int i=0;i<row.length;i++)
		{
		System.out.print(row[i]+",");
		}
		
		int column[]=new int[5];
		for(int i=0;i<5;i++)
		{
			int count=0;
			for(int j=0;j<A.length;j++)
			{
				count+=A[j][i];
			}
			column[i]=count;
		}
		System.out.print("and Column sum is:");
		for(int i=0;i<column.length;i++)
		{
		System.out.print(column[i]+",");
		}
	}
}

class D2Array3
{
	public static void main(String args[])
	{
		int A[][]={{2,2,3,4,5},{1,2,3,4,5},{5,4,6,7,8}};
		System.out.print("Row major: ");
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[i].length;j++)
			{
				System.out.print(A[i][j]+",");
			}
		}
		System.out.println();
		System.out.print("Column major: ");
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<A.length;j++)
			{
				System.out.print(A[j][i]+",");
			}
		}
	}
}

class D2Array4
{
	public static void main(String args[])
	{
		String cunit[]={"CSC101","CSC102","CSC103","CSC104","CSC105"};
		int marks[][]={{50,82,74,55,36},{49,74,25,61,73},{69,73,45,69,47}};
		for(int i=0;i<cunit.length;i++)
		{
			double icetot=0;
			System.out.print("The course unit"+cunit[i]+"=");
			for(int j=0;j<2;j++)
			{
				icetot+=marks[j][i]*0.15;
			}
			double faimarktot=icetot+marks[2][i]*0.7;
			System.out.println(faimarktot);
		}
	}
}
				
		
		
			