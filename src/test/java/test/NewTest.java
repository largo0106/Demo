package test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	public String baseUrl = "https://link.bollore-logistics.com";
	public WebDriver driver;

	@BeforeTest
	public void setBaseUrl() {
		
		ProfilesIni profile = new ProfilesIni();			
		FirefoxProfile ffProfile = profile.getProfile("my profile");
		ffProfile.setAcceptUntrustedCertificates(true);
		ffProfile.setAssumeUntrustedCertificateIssuer(false);
		System.setProperty("webdriver.gecko.driver", "C:/Program Files/geckodriver.exe");
		driver = new FirefoxDriver(ffProfile);
		driver.get(baseUrl);
		
/*		FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true); 
		profile.setAssumeUntrustedCertificateIssuer(false);
		System.setProperty("webdriver.gecko.driver", "C:/Program Files/geckodriver.exe");
		driver = new FirefoxDriver(profile); 
		driver.get(baseUrl);*/
		
		//System.setProperty("webdriver.gecko.driver", "C:/Program Files/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//driver.get(baseUrl);
/*		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setBrowserName(DesiredCapabilities.firefox().getBrowserName());
		FirefoxProfile profile = new FirefoxProfile();
		capability.setCapability(FirefoxDriver.PROFILE, profile);
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, false);
		System.setProperty("webdriver.gecko.driver", "C:/Program Files/geckodriver.exe");
		driver = new FirefoxDriver(capability);
		driver.get(baseUrl);*/
		
	/*	try {
			driver = new RemoteWebDriver(new URL("http://127.0.0.1:8080/wd/hub"), DesiredCapabilities.firefox());
			driver.get(baseUrl);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}

	@Test
	public void verifyPageTitle() {
		String expectedTitle = "LINK - Tracking Solutions";
		String actualTitle = driver.getTitle();
		boolean result = expectedTitle.equalsIgnoreCase(actualTitle);
		if (result) {
			System.out.println("TC is " + result);
		} else {
			System.out.println("TC is " + result);
		}
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}