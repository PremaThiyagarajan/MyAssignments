package week2.day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3PageTitle {

	public static void main(String[] args) {
		/*
		 * Assignment:3 =================== 1. Load url
		 * "https://acme-test.uipath.com/login" 2. Enter email as
		 * "kumar.testleaf@gmail.com" 3. Enter Password as "leaf@12" 4. Click login
		 * button 5. Get the title of the page and print 6. Click on Log Out 7. Close
		 * the browser (use -driver.close())
		 */

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		driver.get("https://acme-test.uipath.com/login");
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		driver.findElement(By.xpath("(//button)[2]")).click();
		// driver.findElement(By.linkText("Login" )).click();
		System.out.println("Page title is: " + driver.getTitle());

		//driver.findElement(By.xpath("//span[@class='sr-only']")).click();
		driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]//li[3]/a")).click();
		driver.close();

	}

}
