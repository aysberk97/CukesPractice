package Ahmet.pages;

import Ahmet.utils.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuruPage2 extends BrowserUtils {
    public GuruPage2(){
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//a[@href='addcustomerpage.php']")
    private WebElement addNewCstmr;

    @FindBy(xpath = "//p[@class='heading3']")
    private WebElement newcstmrVrfy;

    public void setAddNewCstmr(){
        addNewCstmr.click();
    }
    public void setNewcstmrVrfy(){
        newcstmrVrfy.getText();
        String message="Add New Customer";
        String acuall =newcstmrVrfy.getText();
        Assert.assertEquals("title are not match",message,acuall);
    }

}
