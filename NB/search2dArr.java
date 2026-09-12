import java.util.*;

class search2dArr
{
	public static void main(String [] args)
	{
	 	Scanner sc = new Scanner(System.in);
		int [][] ary = new int [3][3];
		int search, count = 0;

		for(int i = 0; i < ary.length; i++){
			for(int j = 0; j<ary[i].length; j++){
				System.out.print("Enter element of ["+i +"] ["+ j+"] : ");

				ary[i][j] = sc.nextInt();
			}
				System.out.println();
		}

				System.out.print("Enter the element you want to search: ");
				search = sc.nextInt();
				System.out.println();
		
		for(int i = 0; i < ary.length; i++){
			for(int j = 0; j<ary[i].length; j++){
				if(ary[i][j] == search){
					count++;
				}
				System.out.print(ary[i][j]+" ");
			}
				System.out.println();
		}
				System.out.println();
				System.out.println(search+ " found " +count+ " times in array.");

	}	
}