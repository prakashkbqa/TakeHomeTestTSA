package Pages;

import Basefile.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class ScoreLandingPage {

    WebDriver driver = BaseDriver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    By welcomeTitle = By.xpath("//android.widget.TextView[contains(@resource-id,'txt_welcome')]");

    By timeToExpText = By.xpath("//android.widget.TextView[contains(@resource-id,'txt_app_exp')]");

    By getStarted = By.xpath("//android.view.ViewGroup[contains(@resource-id,'btn_primary')]");


    public WebElement get_welcomeTitle() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(welcomeTitle));
        return driver.findElement(welcomeTitle);
    }

    public WebElement get_timeToExpText() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(timeToExpText));
        return driver.findElement(timeToExpText);
    }

    public WebElement get_getStarted() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(getStarted));
        return driver.findElement(getStarted);
    }
}
