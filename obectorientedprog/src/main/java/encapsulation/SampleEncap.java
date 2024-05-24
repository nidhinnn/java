package encapsulation;

public class SampleEncap 
{
	private int salary;
	private String name;
	private long phonenum;
	
	public void setter(long phonenum,String name,int salary)
	{
		this.salary=salary;
		this.name=name;
		this.phonenum=phonenum;
	}
	
	public void getter()
	{
		System.out.println(name);
		System.out.println(salary);
		System.out.println(phonenum);
	}

}