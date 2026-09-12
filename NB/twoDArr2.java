import java.util.*;

class twoDArr2
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
		
		for(int i = 0; i < ary.length; i++){
			for(int j = 0; j<ary[i].length; j++){
				System.out.print(ary[i][j]+" ");
			}
				System.out.println();
		}
	}	
}