package propertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadData {

	public static void main(String[] args) throws IOException {

		String currentWorkingDir=System.getProperty("user.dir");
		//System.out.println(currentWorkingDir);
		String filePath=currentWorkingDir+"\\TestData\\Data.properties";
		//System.out.println(filePath);
		//get file location --->create an instance of FileInputStream class and pass the file location to its constructor
		
		//FileInputStream fis=new FileInputStream("F:\\Online Class\\Training Syllabus-20210816T050832Z-001\\Training Syllabus\\CoreJavaSessions\\JavaTraining\\TestData\\Data.properties");
				//or
		//FileInputStream fis=new FileInputStream(filePath);
				//or using relative path where '.' indicates current working dir
		FileInputStream fis=new FileInputStream(".\\TestData\\Data.properties");
		
		//Create an instance of Properties class
		Properties prop=new Properties();
		//load property using load method Properties class
		prop.load(fis);
		//read data from property file
		System.out.println(prop.getProperty("applicationUrl"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("pinCode"));
		System.out.println(prop.getProperty("mobile"));
	}

}
