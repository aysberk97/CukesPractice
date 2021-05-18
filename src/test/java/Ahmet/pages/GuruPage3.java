package Ahmet.pages;

import Ahmet.utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuruPage3 extends BrowserUtils {
    public GuruPage3(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='name']")
    private WebElement name;
    @FindBy(xpath = "//input[@value='m']")
    private WebElement male;
    @FindBy(xpath = "//input[@id='dob']")
    private WebElement dob;
    @FindBy(xpath = "//textarea[@name='addr']")
    private WebElement adress;
    @FindBy(xpath = "//input[@name='city']")
    private WebElement city;
    @FindBy(xpath = "//input[@name='state']")
    private WebElement state;
    @FindBy(xpath = "//input[@name='telephoneno']")
    private WebElement telno;
    @FindBy(xpath = "//input[@name='pinno']")
    private WebElement pinno;
    @FindBy(xpath = "//input[@name='emailid']")
    private WebElement email;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;
    @FindBy(xpath = "//input[@name='sub']")
    private WebElement submit;
    public void setName (String name1){
        name.sendKeys(name1);
    }

    public void setMale(){
        male.click();
    }


    public void setDob(String dob1 ){
        dob.sendKeys(dob1);
    }
    public void setAdress(String address1){
        adress.sendKeys(address1);
    }
    public void setCity(String city1){
        city.sendKeys(city1);
    }
    public void setState(String state1){
        state.sendKeys(state1);
    }
    public void setPinno(String pinno1){
        pinno.sendKeys(pinno1);
    }
    public void setTelno(String telno1 ){
        telno.sendKeys(telno1);
    }
    public void setEmail(String email1 ){
        email.sendKeys(email1);
    }
    public void setPassword(String pass1){
        password.sendKeys(pass1);
    }
    public void  setSubmit(){
        submit.click();
    }
}
