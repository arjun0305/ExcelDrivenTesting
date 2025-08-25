package excel;

import java.io.IOException;
import java.util.ArrayList;

public class testSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataDriven data =new DataDriven();
		ArrayList<String> sheetData = new ArrayList<String>();
		
		sheetData = data.GetData("output", "TestCases", "Add Profile");
		
		for (int i=0;i<sheetData.size();i++)
		{
			System.out.println(sheetData.get(i));
		}
	}

}
