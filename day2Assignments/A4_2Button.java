package week2.day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class A4_2Button {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		driver.get("https://www.leafground.com/button.xhtml");
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt90\"]/span")).click();
		System.out.println("Page title is " +driver.getTitle());
		driver.close();
		

	}

}
