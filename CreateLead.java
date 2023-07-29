package week2.day1Assignments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		driver.manage().window().maximize();
		Thread.sleep(500);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(500);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Edgeverve Systems Limited");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prema");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thiyagarajan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Prema");
		
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("T");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computer Science");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Test description");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Test@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(1000);
		
		
		System.out.println("Page title is: " + driver.getTitle());//View Lead | opentaps CRM
		
		
		driver.close();
		
		
		
		
		
		

	}

}
