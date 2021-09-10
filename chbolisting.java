package Mixtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chbolisting {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//Properties file section
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
		
		
		//Set path of Chrome or firefox driver
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//Open CHBO staging sites
		driver.get("https://staging.corporatehousingbyowner.com/");
		
		//Click at login button
		driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul[1]/li[2]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"login_username\"]")).sendKeys(prop.getProperty("Username"));
		driver.findElement(By.xpath("//*[@id=\"login_password\"]")).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.xpath("//*[@id=\"login_submit_btn\"]")).click();
		
		
	}

}
