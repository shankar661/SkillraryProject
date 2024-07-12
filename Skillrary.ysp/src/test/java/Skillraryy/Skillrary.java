package Skillraryy;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import common_Utils.ExcelUtils;

import common_Utils.PropertyFile_Utils;

public class Skillrary
{
	public static void main(String args[]) throws IOException, InterruptedException
	{
		
		PropertyFile_Utils putil=new PropertyFile_Utils();
		ExcelUtils eutil=new ExcelUtils();
	
	WebDriver driver=new ChromeDriver();
	
	
	
	driver.manage().window().maximize();
	String URL = putil.getDataFromPropertyFile("Url");
	String USER = putil.getDataFromPropertyFile("Username");
	String PASS = putil.getDataFromPropertyFile("Password");
	String EMAIL = eutil.getDataFromExcelFile("skill",0,1);
	String PASSS = eutil.getDataFromExcelFile("skill", 1, 1);
	String FIRST = eutil.getDataFromExcelFile("skill", 2, 1);
	String LAST = eutil.getDataFromExcelFile("skill", 3, 1);
	String ADD = eutil.getDataFromExcelFile("skill", 4, 1);
	//String ACC = eutil.getDataFromExcelFile("skill", 5, 1);
	String NAME=eutil.getDataFromExcelFile("AddNewCourse", 0,1);
	
	
	driver.get(URL);
	driver.findElement(By.id("email")).sendKeys(USER);
	driver.findElement(By.id("password")).sendKeys(PASS);
	driver.findElement(By.name("keepLoggedInCheckBox")).click();
	driver.findElement(By.name("login")).click();
	driver.findElement(By.xpath("//span[text()='Users']")).click();
	driver.findElement(By.xpath("//a[text()=' New']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@id='email'])[2]")).sendKeys(EMAIL);
	driver.findElement(By.xpath("(//input[@id='password'])[2]")).sendKeys(PASSS);
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@id='firstname'])[2]")).sendKeys(FIRST);
	driver.findElement(By.xpath("(//input[@id='lastname'])[2]")).sendKeys(LAST);
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//textarea[@id='address'])")).sendKeys(ADD);
	driver.findElement(By.xpath("(//input[@id='contact'])")).sendKeys("9356391353");
	
	driver.findElement(By.xpath("(//label[text()='Photo'])[1]")).click();
	Thread.sleep(2000);
	Runtime.getRuntime().exec("C:\\Users\\USER\\Desktop\\shnakarrr.exe");
	//driver.findElement(By.name("add")).click();
	driver.findElement(By.xpath("(//button[text()=' Close'])[2]")).click();
	driver.findElement(By.xpath("//span[text()='Courses']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//a[text()=' Course List']")).click();
	driver.findElement(By.xpath("//a[text()=' New']")).click();
 
    
	
	

	}
		

}
