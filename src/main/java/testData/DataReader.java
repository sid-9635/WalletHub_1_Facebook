package testData;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import baseClass.BaseClass;

public class DataReader extends BaseClass{

	public static String st;

	public static String ReadTextFile()
	{
		
		   
		   try {
				
				String currentDirectory = System.getProperty("user.dir")+"\\src\\main\\java\\testData\\textTestData";
				
				
				RandomAccessFile file = new RandomAccessFile(currentDirectory, "r");
				
					st = file.readLine();
					
				}
				 catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (IOException e) {
					e.printStackTrace();// TODO: handle exception
				}
			
				//System.out.println(st);
				return st;
		

       
   
    }
	
}
