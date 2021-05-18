package Ahmet.StepDefinitions;
import Ahmet.utils.BrowserUtils;
import Ahmet.utils.ConfigurationReader;
import Ahmet.utils.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.util.concurrent.TimeUnit;

public class Hook extends BrowserUtils {
    @Before
    public void setup(Scenario scenario) {
        Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(ConfigurationReader.getProperties("url"));
    }
}