import java.util.*;
class employee
{
	String name;
	int id;
	int leaves;
	double salary;
	double hra; //30%
	double da; //10%
	double s_gross;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		name = sc.nextLine();

		System.out.print("Enter id: ");
		id = sc.nextInt();

		System.out.print("Enter number of leaves: ");
		leaves = sc.nextInt();

		System.out.print("Enter salary: ");
		salary = sc.nextDouble();

		hra = (salary * 0.3);
		da = (salary * 0.1);
		s_gross = ((salary + hra + da)- 200);

	}

	void display()
	{
		System.out.println("");
		System.out.println("Employee ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Leaves: "+leaves);

		if(leaves >= 5 && leaves < 8)
		{
			s_gross = s_gross - (s_gross * 0.05);
			System.out.println("Gross Salary: "+ s_gross);

		}else if(leaves >= 8){
			s_gross = s_gross - (s_gross * 0.05);
			System.out.println("Gross Salary: "+ s_gross);

		}else{
			System.out.println("Gross Salary: "+ s_gross);		
		}
		
	}
}

class emp_salary
{
	public static void main(String args[])
	{
		employee e1 = new employee();
		e1.input();
		e1.display();
	}
}
