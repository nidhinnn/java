package excelreadiing;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException
	{
		String s=ExcelCode.readStringData(0, 0);
		System.out.println(s);
		String s1=ExcelCode.readIntegerData(1, 1);
		System.out.println(s1);
		

	}

}
