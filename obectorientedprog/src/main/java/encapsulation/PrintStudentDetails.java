package encapsulation;

public class PrintStudentDetails 
{
	public static void main(String[] args) {
		StudentDetails sd= new StudentDetails();
		sd.setName("ABCD");
		sd.setDepartment("HR");
		sd.setMailid("xya@abcd.com");
		
		System.out.println(sd.getName());
		System.out.println(sd.getDepartment());
		System.out.println(sd.getMailid());

	}

}
