package marathon_030823;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {

	public static void main(String[] args) throws InterruptedException {
		/*Testcase:2(Amazon)
===============
01) Launch Chrome  
02) Load https://www.amazon.in/
     add  implicitlyWait
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
03) Type "Bags" in the Search box
04) Choose the 	 item in the result (bags for boys)
05) Print the total number of results (like 50000)
    1-48 of over 50,000 results for "bags for boys"
06) Select the first 2 brands in the left menu
    (like American Tourister, Generic)
07) Choose New Arrivals (Sort)
08) Print the first resulting bag info (name, discounted price)
09) Get the page title and close the browser(driver.close())’
*/
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags ");
		driver.findElement(By.xpath("//span[text()='for boys']")).click();
		String Totalnum = driver.findElement(By.xpath("//div[contains(@class,'a-spacing-top-small')]")).getText();
		System.out.println("Total number of Bags available: " + Totalnum);
		driver.findElement(By.xpath("//div[@id='brandsRefinements']//i[1]")).click();
		driver.findElement(By.xpath("//div[@id='brandsRefinements']//i[2]"));
		driver.findElement(By.id("a-autoid-0-announce")).click();
		driver.findElement(By.linkText("Newest Arrivals")).click();
		String Name = driver.findElement(By.xpath("(//h2)[1]")).getText();
		System.out.println("Name is: " + Name);
		String price = driver.findElement(By.xpath("//span[@class='a-price']")).getText();
		System.out.println("Discounted Price is:" + price);
		System.out.println("Page title is: " + driver.getTitle()); 
		driver.close();
	}

}
