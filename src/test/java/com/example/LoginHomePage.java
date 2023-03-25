package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginHomePage extends BrowserFactory {
    WebDriver driver;
    POM pom;

    @BeforeTest
    public void initBrowser() throws Exception {
        driver=openBrowser("safari");
        pom=new POM(driver);
    }
    @Test
    public void loginHomePage() throws InterruptedException {
    driver.get("https://www.saucedemo.com/");
    pom.setUsername("standard_user");
    pom.setPassword("secret_sauce");
    pom.clickLoginBtn();
    pom.getHeaderText();

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}