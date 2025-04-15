package Class53_Assigment;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import TestNGSelenium_Class47.TestNGBaseClass;

public class TestNGBreakOutsession extends TestNGBaseClass {

	public static void main(String[] args) {
	
	WebDriver driver=Helper_Class42.Utility.StartBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
    driver.manage().window().maximize();
	
	driver.findElement(By.id("email1")).sendKeys("admin@email.com");
	driver.findElement(By.id("password1")).sendKeys("admin@123");
	driver.findElement(By.className("submit-btn")).click();
	
	Actions ac=new Actions(driver);
	ac.moveToElement(driver.findElement(By.xpath("//span[text()='Manage']")));
	ac.moveToElement(driver.findElement(By.xpath("//a[text()='Manage Courses']"))).click();
	
	driver.findElement(By.xpath("//button[text()='Add New Course ']")).click();
	driver.findElement(By.xpath("//input[@id='thumbnail']")).sendKeys("C:\\Users\\rajar\\OneDrive\\Pictures\\apj kalam.jpg");
	driver.findElement(By.id("name")).sendKeys("course1");
	driver.findElement(By.id("description")).sendKeys("desc1");
	driver.findElement(By.id("name")).sendKeys("course1");
	driver.findElement(By.id("instructorNameId")).sendKeys("Mukesh Otwani");
	driver.findElement(By.className("startDate")).sendKeys("03/28/2025");
	driver.findElement(By.className("startDate")).sendKeys("04/27/2025");
	driver.findElement(By.className("//div[text()='Select Category']")).click();
	driver.findElement(By.className("//button[text()='Java']")).click();
	driver.findElement(By.className("//button[text()='Save']")).click();
	
	String str=(driver.findElement(By.xpath("//td[text()='Selenium For Web Automation']")).getText());
	if(str=="Selenium For Web Automation") { 
	    //assert.assertTrue(true, "did not match");
		System.out.println("course added successfully. course name: "+str);
	}
	
	
	
	
	
	
}}
