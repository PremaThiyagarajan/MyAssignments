package week5Assignment;

import org.testng.annotations.Test;

import org.openqa.selenium.By;

public class CreateLead extends baseclass {
	@Test
	public void createlead() {
		System.out.println(Thread.currentThread().getId());
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prema");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thiyagarajan");
		driver.findElement(By.name("submitButton")).click();
	
	}
}
