import java.util.*;

class arr1
{
	public static void main(String args[])
	{
		int arr[] = new int[5];
		int sum = 0;

		arr[0] = 5;
		arr[1] = 6;
		arr[2] = 2;
		arr[3] = 45;
		arr[4] = 12;

		System.out.println("4th value of array is: "+arr[3]);

		//for(int i = 0; i<arr.length; i++)
		for(ele:arr)
		{
			//System.out.print(arr[i]+" ");
			//sum += arr[i];

			System.out.print(ele+" ");
			sum += ele;
		}
			System.out.println();

		if(arr[0] > arr[1]){
			System.out.println(arr[0] +" is greater than "+arr[1]);
		}else{
			System.out.println(arr[0] +" is less than "+arr[1]);
		}
		System.out.println("Sum of all ele is: "+sum);
	}
}


//- array is a collection of elements of same data types.
//- we can access the values of array using index numbers where index number is just the //place number of elements which is starting from 0.
//- we can perform mathematical operations with array.