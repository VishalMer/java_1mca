import java.util.*;
class date2{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Day: ");
		int d = sc.nextInt();

		System.out.print("Enter Month: ");
		int m = sc.nextInt();

		System.out.print("EnterYear: ");
		int y = sc.nextInt();

		int daysInMonth = 31;
		int monthsInYear = 12;
		
		// Days in Month	
		if(m == 2){
			if(y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)){
				daysInMonth = 29;
			}else{
				daysInMonth = 28;
			}
		}else if(m == 4 || m == 6 || m == 9 || m == 11){
			daysInMonth = 30;
		}else{
			daysInMonth = 31;
		}
		
		// validate day and month
		if(d < daysInMonth || d > daysInMonth || m < 1 || m > 12){
			System.out.println("Invalid Date!!");
		} else {


		System.out.println("current date is: " + d+"/"+m+"/"+y);

		
		if(d == daysInMonth){
			d=1;
			if(m == monthsInYear){
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
}