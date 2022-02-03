package week2.day2.assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./src/main/resources/driver/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leafground.com/pages/Button.html");
			Thread.sleep(2000);
			driver.findElement(By.id("home")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@alt='Buttons']")).click();
			Thread.sleep(2000);
			System.out.println(driver.findElement(By.id("position")).getLocation());
			Thread.sleep(2000);
			System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
			Thread.sleep(2000);
			System.out.println(driver.findElement(By.id("size")).getSize());
			Thread.sleep(2000);
			
}
}
