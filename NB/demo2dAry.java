import java.util.*;

class twoDArray
{
	public static void main(String [] args)
	{
		int [][] ary = {{5,6,1},{7,8,2},{9,0}};

		ary[0][0] = 5;
		ary[0][1] = 6;
		ary[1][0] = 7;
		ary[1][1] = 8;
		
		for(int i = 0; i < ary.length; i++){
			for(int j = 0; j<ary[i].length; j++){
				System.out.print(ary[i][j]+" ");
			}
				System.out.println();
		}
	}	
}