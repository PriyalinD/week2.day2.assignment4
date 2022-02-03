package week2.day2.assignment4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement Select=driver.findElement(By.id("dropdown1"));
		Select list=new Select(Select);
		list.selectByIndex(1);
		Thread.sleep(4000);
		WebElement dropdown = driver.findElement(By.name("dropdown2")); 
		new Select(dropdown).selectByVisibleText("Selenium");
		Thread.sleep(3000);
		WebElement Select2=driver.findElement(By.id("dropdown3"));
		Select list2=new Select(Select2);
		list2.selectByValue("1");
		Thread.sleep(3000);
		
		WebElement dropdown1=driver.findElement (By.xpath("//div[@id='contentblock']/section[1]/div[4]/select[1]"));		
			Select select=new Select(dropdown1);
			List<WebElement> options=select.getOptions();
			System.out.println(options.size());
	
		WebElement selectTrainingProgram = driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[5]/select[1]")); 
		new Select(selectTrainingProgram).selectByVisibleText("Selenium"); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//option[@disabled='true']/following-sibling::option[1]")).click();
		
		
}
}






