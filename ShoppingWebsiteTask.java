package com.qa.test;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingWebsiteTask {
	WebDriver driver;

	@Before
	public void init() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void create() {
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");

		WebElement searchbar = driver.findElement(By.id("search_query_top"));
		searchbar.sendKeys("Dress");

		WebElement searchBar2 = driver.findElement(By.id("search_query_top"));
		assertEquals("Dress", searchBar2.getAttribute("value"));

		WebElement clickbut = driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button"));
		clickbut.click();

		WebElement dress = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]"));
		dress.click();

		WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button"));
		addToCart.click();

		WebElement checkout = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
		checkout.click();

		WebElement proceed = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		proceed.click();

		WebElement emaillog = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
		emaillog.click();
		emaillog.sendKeys("darealatienza@gmail.com");

		WebElement createaccount = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
		createaccount.click();

	}

}
