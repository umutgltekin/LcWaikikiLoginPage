package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
    //elementlerimiz
    WebDriver driver;
    By checkHome=By.cssSelector(".video-area");
    By clickCard=By.id("user_1_");
    By checkLoginPage=By.cssSelector(".login-form__title");

    public homePage(WebDriver driver){
        this.driver=driver;
    }
    //ana ekranın geldiğinin kontrolu
    public void checkHome(){
        driver.findElement(checkHome);
        driver.manage().window().maximize();
    }
    //card simgesine tıklama işlemi
    public  void clickCard(){
        driver.findElement(clickCard).click();
    }
    //login elkranın geldiğinin konteolu
    public void checkLoginPage(){
        driver.findElement(checkLoginPage);
    }


}
