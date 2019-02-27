package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.AppStrings.*;
import static alhilal.androidapp.utils.Locators.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resend_OTP_Page extends CommonPage{
	
	public void GET_OTP() {
		String path = System.getProperty("user.dir");
		String chromepath = path+"/src/test/build/chromedriver";
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver2 = new ChromeDriver();
		driver2.get(OTPweb);
		driver2.findElement(By.name("userId")).sendKeys(web_username);
		driver2.findElement(By.name("password")).sendKeys(web_password);
		driver2.findElement(By.name("go")).click();
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.switchTo().frame(1);
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.switchTo().frame(0);
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.findElement(By.xpath("/html/body/table/tbody/tr[16]/td/div/strong")).click();
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.findElement(By.linkText("Reports")).click();
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.switchTo().defaultContent();
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.switchTo().frame(1);
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.switchTo().frame(1);
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.findElement(By.linkText("Message Statistics")).click();
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.findElement(By.name("button")).click();
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.findElement(By.xpath("//td[5]/a")).click();
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		String OTPMSG = driver2.findElement(By.xpath("//tr[2]/td[3]")).getText();
		System.out.println(OTPMSG);
		driver2.close();
		String OTP = OTPMSG.substring(0, 6);
		System.out.println(OTP);
	}
	
	public void Reset_OTP_multi_time() {
		for (int i=0; i<=3; i++) {
			String path = System.getProperty("user.dir");
			String chromepath = path+"/src/test/build/chromedriver";
			System.setProperty("webdriver.chrome.driver", chromepath);
			driver2 = new ChromeDriver();
			driver2.get(OTPweb);
			driver2.findElement(By.name("userId")).sendKeys(web_username);
			driver2.findElement(By.name("password")).sendKeys(web_password);
			driver2.findElement(By.name("go")).click();
			driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			driver2.switchTo().frame(1);
			driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			driver2.switchTo().frame(0);
			driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			driver2.findElement(By.xpath("/html/body/table/tbody/tr[16]/td/div/strong")).click();
			driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			driver2.findElement(By.linkText("Reports")).click();
			driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			driver2.switchTo().defaultContent();
			driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			driver2.switchTo().frame(1);
			driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			driver2.switchTo().frame(1);
			driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			driver2.findElement(By.linkText("Message Statistics")).click();
			driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			driver2.findElement(By.name("button")).click();
			driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			driver2.findElement(By.xpath("//td[5]/a")).click();
			driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			String OTPMSG = driver2.findElement(By.xpath("//tr[2]/td[3]")).getText();
			System.out.println(OTPMSG);
			driver2.close();
			String OTP = OTPMSG.substring(0, 6);
			System.out.println("OTP NO"+i+"= "+OTP);
			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			hideKeyboard();
			clickOnElement(RESEND_OTP);
		}
	}
	
	public void Validate_First_OTP() {
		String path = System.getProperty("user.dir");
		String chromepath = path+"/src/test/build/chromedriver";
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver2 = new ChromeDriver();
		driver2.get(OTPweb);
		driver2.findElement(By.name("userId")).sendKeys(web_username);
		driver2.findElement(By.name("password")).sendKeys(web_password);
		driver2.findElement(By.name("go")).click();
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.switchTo().frame(1);
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.switchTo().frame(0);
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.findElement(By.xpath("/html/body/table/tbody/tr[16]/td/div/strong")).click();
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.findElement(By.linkText("Reports")).click();
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.switchTo().defaultContent();
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.switchTo().frame(1);
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.switchTo().frame(1);
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.findElement(By.linkText("Message Statistics")).click();
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.findElement(By.name("button")).click();
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.findElement(By.xpath("//td[5]/a")).click();
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		String OTPMSG = driver2.findElement(By.xpath("//tr[2]/td[3]")).getText();
		System.out.println(OTPMSG);
		driver2.close();
		String OTP1 = OTPMSG.substring(0, 6);
		System.out.println("First OTP="+OTP1);
		
			for (int i=0; i<=3; i++) {
				driver2 = new ChromeDriver();
				driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
				driver2.get(OTPweb);
				driver2.findElement(By.name("userId")).sendKeys(web_username);
				driver2.findElement(By.name("password")).sendKeys(web_password);
				driver2.findElement(By.name("go")).click();
				driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
				driver2.switchTo().frame(1);
				driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
				driver2.switchTo().frame(0);
				driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
				driver2.findElement(By.xpath("/html/body/table/tbody/tr[16]/td/div/strong")).click();
				driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
				driver2.findElement(By.linkText("Reports")).click();
				driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
				driver2.switchTo().defaultContent();
				driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
				driver2.switchTo().frame(1);
				driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
				driver2.switchTo().frame(1);
				driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
				driver2.findElement(By.linkText("Message Statistics")).click();
				driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
				driver2.findElement(By.name("button")).click();
				driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
				driver2.findElement(By.xpath("//td[5]/a")).click();
				driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
				String OTPMSG1 = driver2.findElement(By.xpath("//tr[2]/td[3]")).getText();
				System.out.println(OTPMSG1);
				driver2.close();
				String OTP = OTPMSG1.substring(0, 6);
				System.out.println("OTP NO"+i+"= "+OTP);
				driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
				waitForProgressBarToDismiss();
				hideKeyboard();
				clickOnElement(RESEND_OTP);
			}
			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			enterText(OPT_FIELD, OTP1);	
		}
	
}
