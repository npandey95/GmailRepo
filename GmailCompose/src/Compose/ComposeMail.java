package Compose;



import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComposeMail {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Electrania.com\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//user login into gmail
		driver.get("https://accounts.google.com");
		driver.findElement(By.id("identifierId")).sendKeys("pandeynavin95");		
		driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);		
		driver.findElement(By.name("password")).sendKeys("Navin@3008");
		driver.findElement(By.xpath("//*[@id='passwordNext']")).click();

		//Click on Compose button
		driver.findElement(By.xpath("//*[@class='T-I T-I-KE L3']")).click();
		
		//Compose message should be displayed
		driver.findElement(By.xpath("//*[@class='nH Hd']")).isDisplayed();
		
		//User adds attachment 
		driver.findElement(By.id(":se")).sendKeys("C:\\Users\\Electrania.com\\Downloads\\ATUL.docx");
		
		
		//Logout
		driver.findElement(By.className("gb_Ta")).click();
		driver.findElement(By.className("gb_71")).click();
		
	}

}
