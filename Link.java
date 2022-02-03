package week2.day2.assignment4;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/");
		driver.findElement(By.xpath("//img[@alt='Link']")).click();
		driver.get("http://leafground.com/home.html");
		driver.findElement(By.xpath("//img[@alt='Link']")).click();
		System.out.println(driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
		Thread.sleep(2000);
      WebElement link=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/a"));

if(link.getText().equals("HTTP status 404-not found"))
{
	System.out.println(link.getText())	;
}
else
{
	System.out.println("page is broken");

}
Thread.sleep(2000);

driver.navigate().back();
Thread.sleep(2000);
List<WebElement> linkList=driver.findElements(By.tagName("a"));
System.out.println(linkList.size());

		
//		driver.findElement(By.xpath("(//a[@href='../home.html'])[2]")).click();
//	System.out.println(driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
//		
//		Thread.sleep(2000);
//}
}

	
	}
