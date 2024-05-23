package aggregation;

public class Student
{
	String name;
	int rollno;
	Address a;
	
	public Student(String name, int rollno, Address a)
	{
		this.name=name;
		this.rollno=rollno;
		this.a=a;
	}
	
	public void Studentdetails()
	{
		System.out.println("Name : " +name);
		System.out.println("roll number : " +rollno);
		System.out.println("Address : " +a.housename+a.housenum+a.pincode+a.city);
	}
	
	public static void main(String args[])
	{
		Address obj= new Address(22,"ram",695316,"tvm");
		Student obj2= new Student("Nidhin",25,obj);
		obj2.Studentdetails();
	}

}
