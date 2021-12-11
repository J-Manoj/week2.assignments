package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		
		//driver.findElement(By.id("home")).click();
		
		Point Loc = driver.findElement(By.id("position")).getLocation();
		System.out.println("X and Y axis: "+Loc);
		
		String color = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println("Color of Element: "+color);
		
		Dimension size = driver.findElement(By.id("size")).getSize();
		System.out.println("Height and Width: "+size);
		
	}

}
