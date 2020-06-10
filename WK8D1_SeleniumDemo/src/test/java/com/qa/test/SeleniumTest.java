package com.qa.test;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class SeleniumTest {

	private WebDriver driver;

	private static ExtentReports report;

//	private ExtentTest test;

	@BeforeClass
	public static void setup() {
		report = new ExtentReports();
		ExtentHtmlReporter html = new ExtentHtmlReporter("test-output/extent-report.html");
		html.config().setAutoCreateRelativePathMedia(true);
		report.attachReporter(html);
	}

	@Before
	public void init() {
		driver = new ChromeDriver();
	}

	@Test
	public void test() {
		driver.manage().window().maximize();
		driver.get("https://www.bing.co.uk");

//		BingLandingPage landing = PageFactory.initElements(driver, BingLandingPage.class);
//		landing.search(searchTerm);

		WebElement searchBar = driver.findElement(By.id("sb_form_q"));

		searchBar.sendKeys("turtles");
		searchBar.sendKeys(Keys.ENTER);

//		WebElement searchButton = 
//		searchButton.click();
	}

	@After
	public void tearDown() {
//		driver.quit();
	}

}
