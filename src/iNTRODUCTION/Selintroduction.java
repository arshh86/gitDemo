package iNTRODUCTION;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selintroduction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"" + "C:\\arshiya\\chrom_107\\chromedriver_win32 (1)\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://twitter.com/?lang=en");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Set<Cookie> cookiesList = driver.manage().getCookies();
		for (Cookie getcookies : cookiesList) {
			System.out.println(getcookies);
		}
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Log in')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Sign in with Apple')]")).click();
		//driver.findElement(By.xpath().clear();
		//driver.findElement(By.xpath("account_name_text_field")).sendKeys("pirzadaarshiya@gmai.com");
        
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.findElement(By.id("iforgot-link")).click();

	}

}
