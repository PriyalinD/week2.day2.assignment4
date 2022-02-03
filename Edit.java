package week2.day2.assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("priyalindany@gmail.com");
		Thread.sleep(2000);
	    System.out.println(driver.findElement(By.xpath("//input[@value='Append ']")).getAttribute("value"));
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.name("username")).isEnabled());
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.xpath("//input[@value='Clear me!!']")).getAttribute("value"));
        Thread.sleep(4000);
        System.out.println(driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/div/div/input")).isEnabled());
        Thread.sleep(5000);
        
}
}
//input[@disabled='true']
