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
	
	student(int id, String name, String mobileNo, int sem, String dept)
	{
		super(id, name, mobileNo);
		this.sem = sem;
		this.dept = dept;
	}
	void showDetails()
	{
		super.showDetails();
		System.out.println("Sem: " +sem);
		System.out.println("Department: " +dept);
	}
}
class faculty extends uniMember
{
	private String dept;
	private String designation;
	faculty(int id, String name, String mobileNo, String dept, String designation)
	{
		this. dept = dept;
		this. designation = designation;
	}
	void showDetails()
	{
		super.showDetails();
		System.out.println("Department: " +dept);
		System.out.println("Designation: " +designation);
	}

}

class hirarchical
{
	public static void Main(String [] args)
	{
		student s1 = new student(01, "Student1","9900990099",1,"CS" );
		s1.showDetails();

		faculty f1 = new faculty(011, "faculty1","8989898989","CS","Ass Prof" );
		s1.showDetails();
	}
}