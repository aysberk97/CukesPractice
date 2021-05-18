package Ahmet.pages;

import Ahmet.utils.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuruPage4 extends BrowserUtils {
    public GuruPage4(){
        PageFactory.initElements(driver, this);


    }

    @FindBy(xpath ="//p[@class='heading3']")
    private WebElement verifycation;

    public void setVerifycation(){
        String expected="Customer Registered Successfully!!!";
        Assert.assertEquals("verification is failed",expected,verifycation.getText());
    }
}



