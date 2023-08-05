package week2.day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A4_3SelectDropdownvalue {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		driver.get("https://www.leafground.com/select.xhtml");

		WebElement aitool = driver.findElement(By.className("ui-selectonemenu"));
		Select tool = new Select(aitool);

		java.util.List<WebElement> option = tool.getOptions();
		int size = option.size();

		System.out.println("Size of dropdown values are :" + size);
		for (int i = 0; i < size; i++) {
			if (i == 1 || i == 3) {
				option.get(i).click();
			}

		}

	}
}
