package week2.day2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4_1Input {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();

		driver.findElement(By.id("j_idt88:name")).sendKeys("Prema Thiyagarajan");
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys(" India");
		boolean txt = driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
		System.out.println("Test is Enabled :" + txt);
		driver.findElement(By.id("j_idt88:j_idt95")).clear();
		String rtrvtxt = driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value");
		System.out.println("Text value is : " + rtrvtxt);
		driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("test@gmail.com", Keys.TAB);
		System.out.println("Key moved to next tab");
		driver.findElement(By.id("j_idt88:j_idt101")).sendKeys("Myself Prema Thiyagarajan");
		driver.close();

	}

}
