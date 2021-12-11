package week2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Priya");
		driver.findElement(By.name("lastname")).sendKeys("J");
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		driver.findElement(By.name("reg_passwd__")).sendKeys("M1a@n3o$j5");
		WebElement day = driver.findElement(By.id("day"));
		Select dd1 = new Select(day);
		dd1.selectByIndex(17);
		WebElement month = driver.findElement(By.id("month"));
		Select dd2 = new Select(month);
		dd2.selectByValue("12");
		WebElement year = driver.findElement(By.id("year"));
		Select dd3 = new Select(year);
		dd3.selectByValue("1990");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
	}

}
