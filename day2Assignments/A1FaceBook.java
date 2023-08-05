package week2.day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A1FaceBook {

	public static void main(String[] args) {
		
		/*Assignment:1
FaceBook:
================================
// Step 1: Download and set the path 
// Step 2: Launch the chromebrowser
// Step 3: Load the URL https://en-gb.facebook.com/
// Step 4: Maximise the window
// Step 5: Add implicit wait
// Step 6: Click on Create New Account button
// Step 7: Enter the first name
// Step 8: Enter the last name
// Step 9: Enter the mobile number
// Step 10: Enterthe password
// Step 11: Handle all the three drop downs
// Step 12: Select the radio button "Female" 
            ( A normal click will do for this step) */
		
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//input[@name ='firstname']")).sendKeys("Prema");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Thiyagarajan");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("987654321");

		WebElement day = driver.findElement(By.id("day"));
		Select dd = new Select(day);
		dd.selectByVisibleText("10");

		WebElement month = driver.findElement(By.id("month"));
		Select mm = new Select(month);
		mm.selectByValue("7");

		WebElement year = driver.findElement(By.id("year"));
		Select yy = new Select(year);
		yy.selectByIndex(16);

		WebElement gender = driver.findElement(By.xpath("//span//input[@value='1']"));
		gender.click();
		driver.close();
			

	}

}
