package com.timeKeeping.actiTime.Selenium.TaskTest;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.timeKeeping.actiTime.Selenium.genericUtility.BaseClass;
import com.timeKeeping.actiTime.Selenium.genericUtility.ExcelUtitlity;
import com.timeKeeping.actiTime.Selenium.genericUtility.JavaUtilty;
import com.timeKeeping.actiTime.Selenium.pomRepository.CreateNewCustomerPage;
import com.timeKeeping.actiTime.Selenium.pomRepository.HomePage;
import com.timeKeeping.actiTime.Selenium.pomRepository.LoginPage;
import com.timeKeeping.actiTime.Selenium.pomRepository.TaskPage;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * This is a script to create customer
 * @author Akash
 *
 */

public class CreateCustomerInTaskTest extends BaseClass {
	/**
	 * This is a script to create customer
	 * @throws IOException
	 */
	@Test
	public void createCustomerTest() throws IOException {
		//object creation statements
		HomePage home=new HomePage(driver);
		TaskPage task=new TaskPage(driver);
		CreateNewCustomerPage createCutomer=new CreateNewCustomerPage(driver);
		//getting random no
		int randomNo=jUtils.generateRandomNo(1000);
		//fetching data from excel sheet
		String expectedCustomerName = eUtils.fetchDataFromExcelSheet("Sheet2", 1, 0)+randomNo;
		String description=eUtils.fetchDataFromExcelSheet("Sheet2", 1, 1);
		//clicking on Task Button
		home.clickOnTaskButton();
		//clicking on new Customer button
		task.clickOnNewCustomerButton();
		//creating customer
		createCutomer.createCustomerAction(expectedCustomerName, description);
		//verification
		String actualCustomerName = task.verifyCustomerName(expectedCustomerName);
		Assert.assertEquals(actualCustomerName, expectedCustomerName);
		System.out.println("The Customer Name Has been Verified");		
	
		
	}

}
