package testArval;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class domo {
	public WebDriver driver;

	@BeforeTest
	public void setBaseUrl() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://arval:Estate2017@alb-it-frontadmin-dev-1-carenet.a-4-me.net/login");
		driver.navigate().to("https://alb-it-frontadmin-dev-1-carenet.a-4-me.net/login");
		Thread.sleep(2000);
		 /*ProfilesIni profile = new ProfilesIni(); FirefoxProfile ffProfile =
		 * profile.getProfile("default");
		 * ffProfile.setAcceptUntrustedCertificates(true);
		 * ffProfile.setAssumeUntrustedCertificateIssuer(false);
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:/Program Files/geckodriver.exe"); driver = new
		 * FirefoxDriver(ffProfile);
		 */

		// (new Thread(new LoginWindow())).start();
		// driver.navigate().refresh();
		// Actions ac = new Actions(driver);
		// ac.sendKeys(Keys.F5);
		// driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

	}

	@Test
	public void uploadFile() throws InterruptedException, AWTException {
		WebElement usrn = driver.findElement(By.id("tfid-17-0"));
		usrn.sendKeys("ekino@test.com");
		WebElement pwd = driver.findElement(By.id("tfid-17-1"));
		pwd.sendKeys("12345678");
		Thread.sleep(2000);
		pwd.submit();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement a = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='pt-popover-target']")));
		String b = a.getText();
		System.out.println(b);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='import-addon']"))).click();
		//String filePath = System.getProperty("user.dir") + "/Downloads/Test.xlsx";
		Robot rb = new Robot();
		StringSelection filePath = new StringSelection("C:\\Test.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
	 	rb.keyRelease(KeyEvent.VK_V);
	 	rb.keyRelease(KeyEvent.VK_CONTROL);
	 	Thread.sleep(2000);
	 	rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		//Actions ac = new Actions(driver);
		//ac.sendKeys("C:\\Users\\thanh-luan.do\\Downloads\\Test.xlsx");
		WebElement btnUpld = driver.findElement(By.xpath("//button[contains(@class, 'upload-file__btn') and not(@disabled='')]"));
		btnUpld.click();
		//ac.sendKeys(Keys.ENTER);
		WebElement c = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='pt-toast-message']")));
		String d = c.getText();
		System.out.println(d);
		Thread.sleep(2000);
	}
	
	 /*public class LoginWindow implements Runnable {
	 * @Override public void run() { try { login(); } catch (Exception ex) {
	 * System.out.println("Error in Login Thread: " + ex.getMessage()); } }
	 * 
	 * public void login() throws Exception {
	 * 
	 * //wait - increase this wait period if required Thread.sleep(5000);
	 * 
	 * //create robot for keyboard operations Robot rb = new Robot();
	 * 
	 * //Enter user name by ctrl-v
	 * StringSelection username = new StringSelection("arval");
	 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(username, null);
	 	rb.keyPress(KeyEvent.VK_CONTROL); rb.keyPress(KeyEvent.VK_V);
	 	rb.keyRelease(KeyEvent.VK_V); rb.keyRelease(KeyEvent.VK_CONTROL);
	 * 
	 * //tab to password entry field
	 * rb.keyPress(KeyEvent.VK_TAB);
	 * rb.keyRelease(KeyEvent.VK_TAB); Thread.sleep(2000);
	 * 
	 * //Enter password by ctrl-v
	 * StringSelection pwd = new StringSelection("12345678");
	 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(pwd, null);
	 * rb.keyPress(KeyEvent.VK_CONTROL); rb.keyPress(KeyEvent.VK_V);
	 * rb.keyRelease(KeyEvent.VK_V); rb.keyRelease(KeyEvent.VK_CONTROL);
	 * 
	 * //press enter
	 * rb.keyPress(KeyEvent.VK_ENTER);
	 * rb.keyRelease(KeyEvent.VK_ENTER);
	 * 
	 * //wait Thread.sleep(5000); } }
	 */

	@AfterTest
	public void afterTest() {
		driver.close();
	}
}
