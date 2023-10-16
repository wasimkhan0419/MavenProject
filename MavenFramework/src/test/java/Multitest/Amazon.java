package Multitest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Amazon {
	
	@Test

	public void YTTest() throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver(); //RTP
		
		driver.get("https://youtube.com");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		//driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute']")).click();
		//driver.findElement(By.xpath("//a[text()='Amazon miniTV']")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'SAP')]")).click();
		driver.findElement(By.xpath(" //input[@id ='search']")).sendKeys("cheques");
		driver.findElement(By.xpath(" //button[@id ='search-icon-legacy']")).click();
        Thread.sleep(5000);

		//driver.findElement(By.xpath("(//yt-formatted-string[text()='iPhone 15/15 Pro Impressions: Not Just USB-C!'])[2]")).click();
    //  driver.findElement(By.xpath("//a[contains(@title , 'Shubh - Cheques (Official Music Video)')]")).click();
        driver.findElement(By.xpath("//a[@title = 'Shubh - Cheques (Official Music Video)']")).click();
		Thread.sleep(10000);
		driver.quit();
		
		

		
		

	}

}
