package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		
		driver.findElement(By.id("email")).sendKeys("manomts10@gmail.com");
		
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Appended");
		
		String value = driver.findElement(By.xpath("//label[text()='Get default text entered']/following-sibling::input")).getAttribute("value");
		System.out.println("Attribute Value: "+value);
		
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		
		Boolean boo = driver.findElement(By.xpath("//label[@for='disabled']/following-sibling::input")).isEnabled();
		System.out.println("Element field is enabled: "+boo);
		
		
		
		
	}

}
