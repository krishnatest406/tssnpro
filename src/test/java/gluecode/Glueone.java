package gluecode;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Glueone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.switchTo().activeElement().sendKeys("surya sai",Keys.TAB);		
		driver.switchTo().activeElement().sendKeys("1273378",Keys.TAB,Keys.TAB);		
		driver.switchTo().activeElement().click();
		driver.quit();
	}

}
