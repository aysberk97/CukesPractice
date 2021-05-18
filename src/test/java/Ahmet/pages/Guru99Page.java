package Ahmet.pages;
import Ahmet.utils.BrowserUtils;
import Ahmet.utils.ConfigurationReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.logging.Logger;
public class Guru99Page extends BrowserUtils {

    public Guru99Page(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@name='uid']")
    private WebElement userrnameBox;

    @FindBy(xpath = "//input[@name='password']") // findby comes from selenium and it help us to locate our web elements
    private WebElement passrwordBox;

    @FindBy(xpath = "//input[@name='btnLogin']")
    private WebElement loginbuttonBox;

    @FindBy(xpath = "//h2")
    private WebElement vrfyTitle1;

    @FindBy(xpath = "//tr[@class='heading3']//td")
    private WebElement titlrvrf2;

    public void setUserrnameBox(){
        userrnameBox.sendKeys(ConfigurationReader.getProperties("username"));
    }
    public void setPassrwordBox(){
        passrwordBox.sendKeys(ConfigurationReader.getProperties("Password"));
    }
    public  void setLoginbuttonBox(){
        loginbuttonBox.click();
    }
    public void setVrfyTitle1(String str1){
        System.out.println(vrfyTitle1.getText());
        Assert.assertEquals(str1,vrfyTitle1.getText());
    }
//    public void setTitlrvrf2(String title2){
//        Assert.assertEquals(title2,titlrvrf2.getText());
//    }
}


