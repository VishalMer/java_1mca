class uniMember
{
	private int id;
	private String name;
	private String mobileNo;
	
	uniMember(int id, String name, String mobileNo)
	{
		this.id = id;
		this.name = name;
		this.mobileNo = mobileNo;
	}
	void showDetails()
	{
		System.out.println("Member ID: " +id);
		System.out.println("Member Name: " +name);
		System.out.println("Member Mobile: " +mobileNo);
	}
}
class student extends uniMember
{
	private int sem;
	private String dept;
	private int m1,m2,m3;
	
	student(int id, String name, String mobileNo, int sem, String dept, int m1, int m2, int m3)
	{
		super(id, name, mobileNo);
		this.sem = sem;
		this.dept = dept;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	int total_calc(){return m1+m2+m3;}

	double average(){return (total_calc()/3.0);}

	boolean result(){return (m1 >= 35 && m2 >= 35  && m3 >= 35 );}

	void showDetails()
	{
		super.showDetails();
		System.out.println("Sem: " +sem);
		System.out.println("Department: " +dept);
		System.out.println();
		System.out.println("Sub 1 Marks: "+ m1);
		System.out.println("Sub 2 Marks: "+ m3);
		System.out.println("Sub 3 Marks: "+ m3);
		System.out.println("Total Marks: "+ total_calc());
		System.out.println("Percentage : "+ average() +"%");

		if(result()){
			System.out.println("Passed");
		}else{
			System.out.println("Failed");
		}
		System.out.println();
	}
}
class faculty extends uniMember
{
	private String dept;
	private String designation;
	private double basic_sal;
	faculty(int id, String name, String mobileNo, String dept, String designation, double basic_sal)
	{
		super(id, name, mobileNo);
		this.dept = dept;
		this.designation = designation;
		this.basic_sal = basic_sal;
	}
	double da_calc(){return ((basic_sal*40)/100);}
	double hra_calc(){return ((basic_sal*20)/100);}
	double gross_sal(){return ((basic_sal + da_calc() + hra_calc()));}
	void showDetails()
	{
		super.showDetails();
		System.out.println("Department: " +dept);
		System.out.println("Designation: " +designation);
		System.out.println();
		System.out.println("Basic salary: "+ basic_sal);
		System.out.println("DA: "+ da_calc());
		System.out.println("HRA: "+ hra_calc());
		System.out.println("Basic salary: "+ gross_sal());
	}

}

class hirarchical
{
	public static void main(String [] args)
	{
		student s1 = new student(01, "Student1","9900990099",1,"CS", 21,35,37 );
		s1.showDetails();

		faculty f1 = new faculty(011, "faculty1","8989898989","CS","Ass Prof",40000.00 );
		f1.showDetails();
	}
}