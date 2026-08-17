import java.util.*;
class student
{
	String name;
	int roll;
	int total;
	float percentage;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		name = sc.nextLine();
		System.out.print("Enter Rollno: ");
		roll = sc.nextInt();
		total = 450;
		percentage = total/5;
	}

	void display()
	{
		System.out.println("");
		System.out.println("Name: "+name);
		System.out.println("Roll: "+roll);
		System.out.println("Percentage: "+percentage);		
	}
}

class tmp
{
	public static void main(String args[])
	{
		student s1 = new student();
		s1.input();
		s1.display();
	}
}
