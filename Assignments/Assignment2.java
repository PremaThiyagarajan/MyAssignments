package week4.day1.Assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		/*1. Load https://buythevalue.in/
			2. Click on first product (eg: Hamdard Hing - 50GM)
			3. Enter the pincode 
			4. Click on Check
			5. Click on ADD TO CART
			6. Click on View
			7. Click on CHECK OUT
			//Handle alert
			8. Accept the alert */
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		driver.get("https://buythevalue.in");
		driver.findElement(By.xpath("(//div[@class='grid-item product-item'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='wk_zipcode']")).sendKeys("560068");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		driver.findElement(By.id("product-add-to-cart")).click();
		driver.findElement(By.xpath("//a[text()='View Cart']")).click();
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.close();
		
		
		

	}

}
