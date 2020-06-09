package com.qa.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewUserTask {

	WebDriver driver;

	@Before
	public void init() {
		driver = new ChromeDriver();
	}

	@Test
	public void create() {
		driver.manage().window().maximize();
		driver.get("http://thedemosite.co.uk/addauser.php");

		final String user = "SUP BOIIIIII";
		final String pass = "ZADDY";

		WebElement username = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
		username.sendKeys(user);

		WebElement password = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
		password.sendKeys(pass);

		WebElement save = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
		save.click();

		WebElement nextpage = driver
				.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[2]/small/a"));
		nextpage.click();
	}

	@After
	public void login() {
		WebElement insertuser = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
		insertuser.sendKeys("SUP BOIIIIII");

		WebElement insertpass = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
		insertpass.sendKeys("ZADDY");

		WebElement testlogin = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input"));
		testlogin.click();
	}

}
