package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class POM {
    WebDriver driver;
    public POM(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver,this);
    }
    @FindBy(id="user-name")
    private WebElement username;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(id="login-button")
    private WebElement loginBtnclick;

    public void setUsername(String username){
        this.username.sendKeys(username);
    }
    public void setPassword(String password){
        this.password.sendKeys(password);
    }
    public void clickLoginBtn(){
        loginBtnclick.click();
    }
    public void getHeaderText(){
        System.out.println(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText());
        Assert.assertEquals("Products",driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText());

    }
}
