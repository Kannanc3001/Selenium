package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import newStuding.base;

public class Teststudy extends base {
	@Test
	public void tester()

	{
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("KANNAN");
	}
	
	@Test
	
	public void validatelastname()
	{
		
		driver.findElement(By.id("lastname")).sendKeys("c");
	}
	

}

