import java.util.*;

class minMax2dArr
{
	public static void main(String [] args)
	{
	 	Scanner sc = new Scanner(System.in);
		int [][] ary = new int [3][3];

		for(int i = 0; i < ary.length; i++){
			for(int j = 0; j<ary[i].length; j++){
				System.out.print("Enter element of ["+i +"] ["+ j+"] : ");

				ary[i][j] = sc.nextInt();
			}
				System.out.println();
		}
		
		int min = ary[0][0];
		int max = ary[0][0];
		
		for(int i = 0; i < ary.length; i++){
			for(int j = 0; j<ary[i].length; j++){
				if(ary[i][j] < min)
				{
					min = ary[i][j];
				}

				if(ary[i][j] > max)
				{
					max = ary[i][j];
				}

				System.out.print(ary[i][j]+" ");
			}
				System.out.println();
		}
				System.out.println();
				System.out.println("Minimum of array is: " + min);
				System.out.println("Maximum of array is: " + max);
	}	
}