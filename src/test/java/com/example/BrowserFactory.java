package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {


    WebDriver driver;
    public WebDriver openBrowser(String browser) throws Exception {

        switch (browser.toLowerCase()){
            case "chrome":
                ChromeOptions options=new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver=new ChromeDriver(options);
                driver.manage().window().maximize();
                break;
            case "firefox":
                driver =new FirefoxDriver();
                driver.manage().window().maximize();
                break;
            default:
                throw new Exception("Browser NA");

        }
        return driver;
    }

}
