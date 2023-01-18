import java.util.Arrays;
class ArrayList
{
	static int[] data;
	ArrayList(int size)
	{
		data=new int[size];
	}
	static void reset()
	{
		for(int i=0; i<data.length; i++)
		data [i]=0;
	}
	static void replaceAt(int element, int index)
	{
		data[index]=element;
	}
	static void getElementAt(int index)
	{
		data[index-1]=0;
	}
	static void print()
	{
		for(int i=0; i<data.length; i++)
		{
			System.out.print(data[i]+",";
		}
		System.out.println("\b\t");
	}
	static void isContain(int element)
	{
		boolean result=false;
		for(int i=0 ; i<data.length; i++)
		{
			if(data[i]==element)
			return1;
		}
	}
}


class ArrayListEx
{
	public static void main(String args[])
	{
		ArrayList list1=new ArrayList(4);
		list1.print();
		list1.repalaceAt(1,0);
		list1.print();
		list1.isContain(0);
		list1.swap(1,3);
		list1.print();
		list1.insertAt(2,1);
		list1.removeAt(4);
		list1.makeItDouble();
	}
}
		