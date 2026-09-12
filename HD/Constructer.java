/*creat a class which is having concept of parameterised and having number funct, 
bankid, name , branch
use scanner class and demonstrate it*/

import java.util.*;

class bank
{
	int id;
	String name, branch;

	bank(int id, String name, String branch)
	{
		this.id = id;
		this.name = name;
		this.branch = branch;
	}

	void display()
	{
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("branch: "+branch);
	}
}

class Constructer
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String name, branch;
		int id;
		
		System.out.print("Enter Name: ");
		name = sc.nextLine();
		System.out.print("Enter Branch: ");
		branch = sc.nextLine();
		System.out.print("Enter ID: ");
		id = sc.nextInt();
		System.out.println();
		bank b1 = new bank(id,name,branch);
		b1.display();
	}
}