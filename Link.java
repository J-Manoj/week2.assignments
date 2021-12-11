package week2.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().back();
		
		String url = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		System.out.println(url);
		
		String url2 = driver.findElement(By.linkText("Verify am I broken?")).getAttribute("href");
		if(url2.contains("error"))
		{
			System.out.println("Page is Broken");
		}else
			System.out.println("Page is not Broken");
		
		String url1 = driver.findElement(By.linkText("Go to Home Page")).getAttribute("href");
		String url3 = driver.findElement(By.xpath("//label[text()='(Interact with same link name)']/preceding-sibling::a")).getAttribute("href");
		if(url1.equals(url3))
		{
			System.out.println("Interacted with same link");
			driver.findElement(By.linkText("Go to Home Page")).click();
			driver.navigate().back();
		}
		
		driver.findElement(By.linkText("How many links are available in this page?")).click();
		List<WebElement> findElements = driver.findElements(By.tagName("a"));
		int size = findElements.size();
		System.out.println(size);
		
		
		
	}

}
