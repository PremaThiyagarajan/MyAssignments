package marathon_030823;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemas1 {

	public static void main(String[] args) {
		/*Testcase 3 (PVR cinemas)
		==========
		01) Launch the Url  https://www.pvrcinemas.com/
		02) Click  on Movie Library under hamburger button
		03) Select the City -->chennai
		04) Select the Genre-->Animation
		05) Select the Language-->english
		06) Click on Apply
		07) Click on first resulting animation movie
		08) Click proceed to book
		09) Enter the all fields  cinema , Name, date, Prefered show time, no of seats, food and beverages,Email and Mobile
		10) Click on copy to self 
		11) Click on  Send Request
		12) Click cancel 
		13) Close the OTP dialog
		14) Verify the ttile of the page*/

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.className("nav-icon")).click();
		driver.findElement(By.xpath("//li[@class='sidebar-list-item']/a[text()='Movie Library']")).click();
		
		WebElement city = driver.findElement(By.xpath("//select[@name='city']"));
		Select selCity = new Select(city);
		selCity.selectByVisibleText("Chennai");
		
		WebElement genre = driver.findElement(By.xpath("//select[@name='genre']"));
		Select gnr = new Select(genre);
		gnr.selectByVisibleText("ANIMATION");
		
		WebElement Language = driver.findElement(By.name("lang"));
		Select lng = new Select(Language);
		lng.selectByVisibleText("ENGLISH");
		
		driver.findElement(By.xpath("//button[contains(@class,'btn-submit')]")).click();
		String firstmovie = driver.findElement(By.xpath("(//div[@class='movie-list']/div[contains(@class,'movie-wrapper')][1]")).getText();
		System.out.println("First Resulting Movie is: " +firstmovie);
		
		driver.findElement(By.xpath("//div[@class='header-info-fixed']//button")).click();
		
		WebElement cinemaname = driver.findElement(By.xpath("//select[@id='cinemaName']"));
		Select cname = new Select(cinemaname);
		cname.selectByIndex(2);
		
		driver.findElement(By.xpath("//div[@class='pvr-datepicker']")).click();
		driver.findElement(By.xpath("//span[contains(@class,'is-selected')]")).click();
		
		WebElement showtime = driver.findElement(By.xpath("//select[@name='timings']"));
		Select stime = new Select(showtime);
		stime.selectByIndex(2);
		
		driver.findElement(By.name("noOfTickets")).sendKeys("7");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Prema");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Test@gmail.com");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9876543210");
		WebElement food= driver.findElement(By.xpath("//input[@name='food']"));
		Select food1 = new Select(food);
		food1.selectByIndex(1);
		
		driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("No other requierements");
		driver.findElement(By.xpath("//label[contains(@class,'custom-radio')]")).click();
		
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		driver.findElement(By.className("swal2-close")).click();
		
		
		String pagetitle = driver.getTitle();
		
		if(pagetitle.equals("Movie Library")) {

			System.out.println(pagetitle+ "is Matching" );
		}
		else {
			System.out.println(pagetitle+ "is not Matching" );
		}
		
		driver.close();		
		

	}

}
