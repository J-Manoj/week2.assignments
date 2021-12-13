package week2.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//label[text()='Select the languages that you know?']/following::input[1]")).click();
		
		boolean select = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input[1]")).isSelected();
		System.out.println("CheckBox Selected: "+select);
		
		List<WebElement> box = driver.findElements(By.xpath("//section[@class='innerblock']/div[3]/div/input"));
		int count = box.size();
		for(int i=0; i<count; i++)
		{
			if(box.get(i).isSelected())
			{
				box.get(i).click();
			}
			else
				continue;
				
		}
		
		List<WebElement> findElements = driver.findElements(By.xpath("//label[text()='Select all below checkboxes ']/following::input"));
		int size = findElements.size();
		for (int i=0; i<size; i++) {
			findElements.get(i).click();
		}
	}

}
