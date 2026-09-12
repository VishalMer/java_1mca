import java.util.*;

class add2d2ary
{
	public static void main(String [] args)
	{
	 	Scanner sc = new Scanner(System.in);
		int [][] ary = new int [3][3];
		int [][] ary2 = new int [3][3];
		int [][] ary3 = new int [3][3];

		for(int i = 0; i < ary.length; i++){
			for(int j = 0; j<ary[i].length; j++){
				System.out.print("Enter for Array 1 element no: ["+i +"] ["+ j+"] : ");

				ary[i][j] = sc.nextInt();
			}
				System.out.println();
		}

		for(int i = 0; i < ary.length; i++){
			for(int j = 0; j<ary[i].length; j++){
				System.out.print("Enter for Array 2 element no: ["+i +"] ["+ j+"] : ");

				ary2[i][j] = sc.nextInt();
			}
				System.out.println();
		}

		System.out.println();
		for(int i = 0; i < ary.length; i++){
			for(int j = 0; j<ary[i].length; j++){
				System.out.print(ary[i][j]+" ");
			}
				System.out.println();
		}

		System.out.println();		
		for(int i = 0; i < ary2.length; i++){
			for(int j = 0; j<ary2[i].length; j++){
				System.out.print(ary2[i][j]+" ");
			}
				System.out.println();
		}

		System.out.println();
		for(int i = 0; i < ary.length; i++){
			for(int j = 0; j<ary[i].length; j++){
				ary3[i][j] = ary[i][j] + ary2[i][j];
				System.out.print(ary3[i][j] +" ");
			}
				System.out.println();
		}
	}	
}