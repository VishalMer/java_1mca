class Person
{
	String name;
	String mobileNo;
	
	Person(String name,String mobileNo)
	{
		this.name=name;
		this.mobileNo=mobileNo;
	}
	
	void display()
	{
		System.out.println("Name :  "+name);
		System.out.println("Mobile No :  "+mobileNo);
	}
}

class Student extends Person
{
	int rlno;
	int sem;
	Student(String name,String mobileNo,int rlno,int sem)
	{
		super(name,mobileNo);
		this.rlno=rlno;
		this.sem=sem;
	}
	
	void displayStudent()
	{
		super.display();
		System.out.println("Roll No : "+rlno);
		System.out.println("Sem : "+sem);
	}
}

class MCAStudent extends Student
{
	int numOfSub;
	MCAStudent(String name,String mobileNo,int rlno,int sem,int numOfSub)
	{
		super(name,mobileNo,rlno,sem);
		this.numOfSub=numOfSub;
	}
	
	void displayStudent()
	{
		super.displayMCAStudent();
		System.out.println("Number of subjects : "+numOfSub);
	}
}


class Faculty extends Person
{
	int exp;
	double salary;
	Faculty(String name,String mobileNo,int exp,double salary)
	{
		super(name,mobileNo);
		this.exp=exp;
		this.salary=salary;
	}
	
	void displayFaculty()
	{
		super.display();
		System.out.println("Experince :  "+exp);
		System.out.println("Salary :  "+salary);
	}
}

class inheritance
{
	public static void main(String[] args)
	{
		Student s1=new Student("Vmer","8989898989",12,1);
		s1.displayStudent();
		System.out.println();

		Faculty f1=new Faculty("ABC","1234567890",5,12000.00);
		f1.displayFaculty();
		System.out.println();

		MCAStudent m1 = new MCAStudent("Vmer","8989898989",12,1,5);
		m1.displayMCAStudent();
	}
}