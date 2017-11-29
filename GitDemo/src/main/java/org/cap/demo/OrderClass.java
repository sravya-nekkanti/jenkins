package org.cap.demo;

public class OrderClass {

	int a[]={1,2,3,4,5,6};
	public void display()
	{
		int sum=0;
		for(int i=0;i<6;i++)
		{
			sum+=i;
			System.out.println(a[i]);
		}
		System.out.println("sum is "+sum);
		System.out.println("Enhanced loop");
	}
	public void show()
	{
		System.out.println("Show method");
	}
}
