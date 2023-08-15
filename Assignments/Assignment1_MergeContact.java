package week4.day1.Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1_MergeContact {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * //Pseudo Code 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		 * 2.Enter UserName and Password Using Id Locator 3.Click on Login Button using
		 * Class Locator 4.Click on CRM/SFA Link 5.Click on contacts Button 6.Click on
		 * Merge Contacts using Xpath Locator 7.Click on Widget of From Contact 8.Click
		 * on First Resulting Contact 9.Click on Widget of To Contact 10.Click on Second
		 * Resulting Contact 11.Click on Merge button using Xpath Locator 12.Accept the
		 * Alert 13. Verify the title of the page
		 */

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));

		driver.get("http://leaftaps.com/opentaps/control/login");

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(500);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();

		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]/ancestor::a")).click();
		Set<String> winhandle = driver.getWindowHandles();
		List<String> win = new ArrayList<String>(winhandle);
		driver.switchTo().window(win.get(1));
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//div/a)[1]")).click();
		driver.switchTo().window(win.get(0));

		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]/ancestor::a")).click();
		Set<String> winhandle1 = driver.getWindowHandles();
		List<String> win1 = new ArrayList<String>(winhandle1);
		driver.switchTo().window(win1.get(1));
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']/following::div[contains (@class,'x-grid3-col-partyId')]/a)[1]")).click();
		driver.switchTo().window(win1.get(0));

		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		driver.switchTo().alert().accept();
		String PT = driver.getTitle();
		System.out.println("Page Title: " + PT);
		Thread.sleep(3000);
		driver.close();

	}

}
