class employee
{
	private int eid;
	private String name;
	private double basic_sal;
	private double incentive;
	employee(int eid, String name, double basic_sal, double incentive)
	{
		this.eid = eid;
		this.name = name;
		this.basic_sal = basic_sal;
		this.incentive = incentive;
	}
	void display()
	{
		System.out.println("Employee id: "+eid);
		System.out.println("Employee name: "+name);
		System.out.println("Basic Salary: "+basic_sal);
	}
}
class developer extends employee
{
	private String tech;
	private double hra;
	developer(int eid, String name, double basic_sal, double incentive, String tech)
	{
		super(eid, name, basic_sal, incentive);
		this.tech = tech;
	}
	
	double getBasic_Sal(){return basic_sal;}

	double hra_calc(){ return (getBasic_Sal()*0.2);}

	double gross_sal(){ return (getBasic_Sal() + hra_calc() + incentive);}

	void display()
	{
		super.display();
		System.out.println("Incentive: "+incentive);
		System.out.println("HRA: "+hra);
	}
}

class single
{
	public static void main(String []args)
	{
		developer d1 = new developer(01, "Employee1",40000.00,1000.00,"Backend");
		
	}
}