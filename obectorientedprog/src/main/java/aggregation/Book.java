package aggregation;

public class Book 
{
	String bookname;
	int publisheddate;
	Author a;
	
	public Book(String bookname, int publisheddate, Author a)
	{
		this.bookname=bookname;
		this.publisheddate=publisheddate;
		this.a=a;
		
	}
	
	public void printdetails()
	{
		System.out.println(bookname);
		System.out.println(publisheddate);
		System.out.println("Author details : " +a.authorname   +a.bornyear);
	}
	

	public static void main(String[] args) 
	{
		Author obj = new Author("Aravind",    1998);
		Book obj2= new Book("ABCD",15,obj);
		obj2.printdetails();

	}

}
