package test;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {
	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.suneratech.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("current_url :"+currentUrl);

		String pageSource = driver.getPageSource();
		System.out.println("html : "+pageSource);	
		TakesScreenshot scr = (TakesScreenshot) driver;
		String base64 = scr.getScreenshotAs(OutputType.BASE64);
		System.out.println("base64_image : "+base64);	



	}

}

