package org.selenimun;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartExample {

	static WebDriver driver;

	@BeforeClass
	public static void tc_1() {
	// launch the browser / variable check / null check
	driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();

	System.out.println("ClassA tc_1 @BeforeClass");

	}

	@AfterClass
	public static void tc_2() throws Exception {
	// browser close / report / completed msg
	Thread.sleep(1000);
    driver.close();
	System.out.println("ClassA tc_2 @AfterClass");
	System.out.println("Unit testing completed for Flipkart login");
	}

	@Before
	public void tc_3() throws Exception {
	// start time before @Test / screenshot
	long startTime = System.currentTimeMillis();
	System.out.println(startTime);
	// screentshot coding ....
	TakesScreenshot screenshot = (TakesScreenshot) driver;

	File source = screenshot.getScreenshotAs(OutputType.FILE);
	System.out.println(source);

	File dest = new File("D:\\TestingJava\\Flipkart1.png");

	FileUtils.copyFile(source, dest);
	System.out.println("Screenshot taken");
	System.out.println("ClassA tc 3 @Before");
	}

	@After
	public void tc_4() throws Exception {
	// end time before @Test / screenshot
	long endTime = System.currentTimeMillis();
	System.out.println(endTime);
	// screentshot coding ....
	TakesScreenshot screenshot = (TakesScreenshot) driver;

	File source = screenshot.getScreenshotAs(OutputType.FILE);
	System.out.println(source);

	File dest = new File("D:\\TestingJava\\Flipkart2.png");

	FileUtils.copyFile(source, dest);
	System.out.println("Screenshot taken");
	System.out.println("ClassA tc_4 @After");
	}

	@Test
	public void tc_5() {
	// major actions
	// finding elements / resp action
	driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
	WebElement loginid = driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));
	loginid.sendKeys("fnoble20@gmail.com");
	driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']")).click();
//	WebElement password = driver. findElement(By.id("pass"));
//	password. sendKeys("fnoble@123");
//	WebElement loginBtn = driver. findElement(By.name("login"));
//	loginBtn.click();

	System.out.println("ClassA tc_5 @Test");

	}
	}


	

