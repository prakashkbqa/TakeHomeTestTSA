package Pages;

import Basefile.BaseDriver;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ChooseYourFavoritePage {

    WebDriver driver = BaseDriver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    /*----->Choose your favorite leagues elements<-----*/

    By chooseYourFvrtLeaguesTitle = By.xpath("//*[contains(@resource-id,'title_onboarding') and contains(@text,'favorite leagues')]");

    By getTheLatestText = By.xpath("//*[contains(@resource-id,'subtitle_onboarding') and contains(@text,'breaking news')]");

    By leaguesList = By.xpath("//android.widget.TextView[contains(@resource-id,'txt_name')]");

    By continueBtn = By.xpath("//android.widget.TextView[contains(@resource-id,'action_button_text')]");

    By tailoredContent = By.xpath("//*[contains(@resource-id,'location_title') and contains(@text,'Tailored')]");

    By mayBeLaterBtn = By.xpath("//*[contains(@resource-id,'btn_disallow') and contains(@text,'Maybe')]");

    /*----->Choose your favorite teams elements<-----*/

    By chooseYourFvrtTeamsTitle = By.xpath("//*[contains(@resource-id,'title_onboarding') and contains(@text,'favorite teams')]");

    By recommendedTabList = By.xpath("//android.widget.HorizontalScrollView//android.widget.LinearLayout//android.widget.TextView");

    By teamsList = By.xpath("//android.widget.TextView[contains(@resource-id,'txt_name')]");

    By neverMissaGameTitle = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.fivemobile.thescore:id/title_onboarding\")");

    By toggleSwitchList = By.xpath("//*[contains(@resource-id,'name')]");

    /*----->Introducing theScore Messaging<-----*/

    By introducingTheScoreTitle = By.id("com.fivemobile.thescore:id/title_onboarding");

    By mayBeLaterBtnITSM = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.fivemobile.thescore:id/btn_secondary\")");

    By dontAllowBtn = By.xpath("//android.widget.Button[contains(@resource-id,'permission_deny_button')]");

    /*----->Just Launched: Profile<-----*/

    By justLaunchedProfileTitle = By.xpath("//android.widget.TextView[contains(@text,'Just Launched')]");

    By okGotItBtn = AppiumBy.androidUIAutomator("new UiSelector().text(\"Ok, Got It\")");


    public WebElement get_chooseYourFvrtLeaguesTitle() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(chooseYourFvrtLeaguesTitle));
        return driver.findElement(chooseYourFvrtLeaguesTitle);
    }

    public WebElement get_getTheLatestText() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(getTheLatestText));
        return driver.findElement(getTheLatestText);
    }

    public List<WebElement> get_leaguesList() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(leaguesList));
        return driver.findElements(leaguesList);
    }

    public WebElement get_continueBtn() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(continueBtn));
        return driver.findElement(continueBtn);
    }

    public WebElement get_tailoredContent() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(tailoredContent));
        return driver.findElement(tailoredContent);
    }

    public WebElement get_mayBeLaterBtn() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(mayBeLaterBtn));
        return driver.findElement(mayBeLaterBtn);
    }

    public WebElement get_chooseYourFvrtTeamsTitle() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(chooseYourFvrtTeamsTitle));
        return driver.findElement(chooseYourFvrtTeamsTitle);
    }

    public List<WebElement> get_recommendedTabList() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(recommendedTabList));
        return driver.findElements(recommendedTabList);
    }

    public List<WebElement> get_teamsList() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(teamsList));
        return driver.findElements(teamsList);
    }

    public WebElement get_neverMissaGameTitle() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(neverMissaGameTitle));
        return driver.findElement(neverMissaGameTitle);
    }

    public List<WebElement> get_toggleSwitchList() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(toggleSwitchList));
        return driver.findElements(toggleSwitchList);
    }

    public WebElement get_introducingTheScoreTitle() throws InterruptedException {
        Thread.sleep(5000);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(introducingTheScoreTitle));
        return driver.findElement(introducingTheScoreTitle);
    }

    public WebElement get_mayBeLaterBtnITSM() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(mayBeLaterBtnITSM));
        return driver.findElement(mayBeLaterBtnITSM);
    }

    public WebElement get_dontAllowBtn() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(dontAllowBtn));
        return driver.findElement(dontAllowBtn);
    }

    public WebElement get_justLaunchedProfileTitle() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(justLaunchedProfileTitle));
        return driver.findElement(justLaunchedProfileTitle);
    }

    public WebElement get_okGotItBtn() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(okGotItBtn));
        return driver.findElement(okGotItBtn);
    }

}
