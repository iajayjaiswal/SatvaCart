package test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.satvacart.com/fruits-vegetables/vegetables.html");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Log In")).click();

		driver.findElement(By.id("email")).sendKeys("ajay@mailinator.com");
		driver.findElement(By.name("login[password]")).sendKeys("ajay1234");
		driver.findElement(By.xpath("(//button[@id='send2'])[2]")).click();

		driver.findElement(By.xpath("//a[normalize-space()='Log Out']")).isDisplayed();
		System.out.println("Logged in successfully");

		driver.close();
	}

}
