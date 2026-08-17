import java.util.*;
class date{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Day: ");
		int d = sc.nextInt();

		System.out.print("Enter Month: ");
		int m = sc.nextInt();

		System.out.print("EnterYear: ");
		int y = sc.nextInt();

		System.out.println("current date is: " + d+"/"+m+"/"+y);

		
		if(d == 31){
			d=1;
			if(m == 12){
				m =1;
				y++;
			}else{
				m++;
			}
		}else{
			d++;
		}
		System.out.println("next date is: " + d+"/"+m+"/"+y);
		
	}
}