package exception;

import java.io.IOException;

public class ThrowsExample 
{
	public static void print() throws IOException
	{
		throw new IOException("Checked Exception occured");
	}

	public static void main(String[] args) throws IOException
	{
		ThrowsExample.print();

	}

}
