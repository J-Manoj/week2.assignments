package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		WebElement index = driver.findElement(By.id("dropdown1"));
		Select dd1 = new Select (index);
		dd1.selectByIndex(1);
		
		WebElement text = driver.findElement(By.name("dropdown2"));
		Select dd2 = new Select (text);
		dd2.selectByVisibleText("Selenium");
		
		WebElement value = driver.findElement(By.id("dropdown3"));
		Select dd3 = new Select (value);
		dd3.selectByValue("1");
		
		WebElement send = driver.findElement(By.className("dropdown"));
		Select dd4 = new Select (send);
		int size = dd4.getOptions().size();
		System.out.println("Total Dropdowns: "+size);
		
		driver.findElement(By.xpath("(//section[@class='innerblock']//select)[5]")).sendKeys("Se");
		
		WebElement select = driver.findElement(By.xpath("(//section[@class='innerblock']//select)[6]"));
		Select dd5 = new Select(select);
		dd5.selectByIndex(1);
		
	}

}
