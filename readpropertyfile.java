package Mixtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readpropertyfile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//number = 1 create File class object and give address of properties file
		File file =new File("F:\\Gul Data\\Gulraiz Softwares Col1\\Selenium Work space\\workspace\\Webdriver\\config.properties");
		
		//number = 2 Create FileinputStream Class object and pass File object as parameter
		FileInputStream fileInput = new FileInputStream(file);
		//Added exception code to trace file failure
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//number = 3 Create properties class object
		Properties prop = new Properties();
		
		//load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(prop.getProperty("URL"));
		System.out.println(prop.getProperty("Username"));
		System.out.println(prop.getProperty("Password"));
		
	}

}
