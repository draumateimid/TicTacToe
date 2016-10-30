package com.draumateymid.tictactoe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TestTicTacToeWeb extends SeleniumTestWrapper {
	
	@Test
    public void TestNavigateFromIndexToGame() throws InterruptedException{
        driver.get("http://localhost:" + "4567" + "/index.html");
		WebElement clickLink = driver.findElement(By.id("gameLink"));
		clickLink.click();
		Thread.sleep(3000);
		assertThat(driver.getCurrentUrl(), containsString("tictactoe"));
	}
	
	@Test
    public void setXinLeftTopCorner() throws InterruptedException{
        driver.get(baseUrl + "/index.html");
		WebElement clickLink = driver.findElement(By.id("gameLink"));
		clickLink.click();
		Thread.sleep(3000);
		
		WebElement value = driver.findElement(By.id("1"));
		value.click();
		
		value = driver.findElement(By.id("field1"));
		Thread.sleep(3000);
		assertEquals( "X" ,value.getText());
	}
}