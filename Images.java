package week2.day2.assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Images {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Image.html");
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img")).click();
		driver.findElement(By.xpath("//img[@alt='Images']")).click();
		WebElement image=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
		image.click();
		if(image.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("image is broken");
		}
		else
		{
			System.out.println("image is  not broken");	
		}
		driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
Thread.sleep(2000);



}
}

