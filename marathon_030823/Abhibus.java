package marathon_030823;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Abhibus {

	public static void main(String[] args) {
		
	ChromeDriver driver = new ChromeDriver();
	//01) Launch Firefox / Chrome and add  implicitlyWait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
	
	//02) Load https://www.abhibus.com/ 
	driver.get("https://www.abhibus.com/");
	driver.manage().window().maximize();
	
	//03) Click on Bus	
	driver.findElement(By.linkText("Bus")).click();
	
	//04) Type "Chennai" in the FROM text box 
	WebElement source = driver.findElement(By.xpath("//input[@id='source']"));
	source.sendKeys("Chennai");
	
	//05) Click the first option from the pop up box
	driver.findElement(By.xpath("//li[@class='ui-menu-item ui-state-focus']")).click();

	//06) Type "Bangalore" in the TO text box 
	WebElement dest = driver.findElement(By.xpath("//input[@id='destination']"));
	dest.sendKeys("Bangalore");
	
	//07) Click the first option from the pop up box 
	driver.findElement(By.xpath("//li[@class='ui-menu-item ui-state-focus']")).click();
	
	//08) Select tomorrow's date in the Date field
	driver.findElement(By.id("datepicker1")).click();
	driver.findElement(By.xpath( "//a[@class='ui-state-default']")).click();
	
	//09) Click Search Buses
	driver.findElement(By.linkText("Search")).click();
	
	//09) Print the name of the first resulting bus (use .getText()) 
	String bus = driver.findElement(By.xpath("//div/h2[@class='TravelAgntNm ng-binding']")).getText();
	System.out.println(bus);
	
	//10) Choose SLEEPER in the left menu from Bus Type
	driver.findElement(By.id("Bustypes4")).click();
	
	//11) Print the first resulting bus seat count(Example:35 Seats Available)(use .getText()) 
	String seat = driver.findElement(By.xpath("//div/p[contains(@class,'noseats')]")).getText();
	System.out.println(seat);
  //12) Click SelectSeat
	driver.findElement(By.xpath("//span [@class='book']")).click();
	
	//13) Choose any one Available seat 
	boolean seatav = driver.findElement(By.xpath("//li[contains(@class,'sleeper available')]/a")).isEnabled();
	System.out.println("Seat is Free :" + seatav);	
	driver.findElement(By.xpath("//li[contains(@class,'sleeper available')]/a")).click();
	
	//14) Print Seats Selected ,Total Fare 
	String seatno = driver.findElement(By.xpath("//span[@id='seatnos']")).getText();
	System.out.println("Seat number is:" +seatno);
	String fare = driver.findElement(By.xpath("//span[@id='ticketfare']")).getText();
	System.out.println("Ticked Fare is:" +fare);
	//15) Select Boarding Point  and Dropping Point 
	WebElement Boarding= driver.findElement(By.xpath("//select[contains(@id,'boardingpoint_id')]"));
	Select bp= new Select(Boarding);
	bp.selectByIndex(2);
	WebElement Drop= driver.findElement(By.xpath("//select[contains(@id,'droppingpoint_id')]"));
	Select dp= new Select(Drop);
	dp.selectByIndex(2);
	
	//16) Get the Title of the page(use .getTitle()) 
	System.out.println("Page tile is: " +driver.getTitle());
	
	driver.close();	

	}

}
