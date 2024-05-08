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

public class FavoriteTabPage {

    WebDriver driver = BaseDriver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    By addBtn = By.xpath("//*[contains(@resource-id,'label') and @text='Add']");
    By addedTeamLeagueList = By.xpath("//android.widget.TextView[contains(@resource-id,'/label') and not(contains(@text,'Add'))]");
    By theScoreBetAppPopUp = By.xpath("//android.widget.TextView[contains(@resource-id,'header_text') and contains(@text,'is live')]");
    By closeBtn = By.xpath("//android.widget.ImageView[@index='0']");

    /*----->Favorite league page<-----*/

    By fvrtLeagueTitle = By.xpath("//*[contains(@resource-id,'titleTextView')]");
    By mainTabList = By.xpath("//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView");
    By highlightedTab = By.xpath("//android.widget.HorizontalScrollView/android.widget.LinearLayout//android.widget.TextView[@selected='true']");

    By welcomeToTheCommnunityPopUp = By.xpath("//android.widget.TextView[contains(@resource-id,'dialog_title_1')]");
    By acceptBtn = By.xpath("//*[contains(@resource-id,'primary_button')and @text='Accept']");

    By subTabList = By.xpath("(//android.widget.HorizontalScrollView[@resource-id='com.fivemobile.thescore:id/tabLayout'])[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView");
    By subTitleText = By.xpath("//*[contains(@resource-id,'txt_name')]");
    By passingYardsSubTitle = By.xpath("//*[contains(@resource-id,'txt_category_name')]");
    By leaderTitleText = By.xpath("//*[contains(@resource-id,'txt_leader')]");
    By leaderName = By.xpath("//*[contains(@resource-id,'big_leader_name')]");
    By leaderStat = By.xpath("//*[contains(@resource-id,'big_leader_stat')]");

    By backBtn = AppiumBy.androidUIAutomator("new UiSelector().description(\"Navigate up\")");

    By fvrtTeamTitle = By.xpath("//*[contains(@resource-id,'team_name')]");

    public WebElement get_addBtn() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(addBtn));
        return driver.findElement(addBtn);
    }

    public List<WebElement> get_addedTeamLeagueList() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(addedTeamLeagueList));
        return driver.findElements(addedTeamLeagueList);
    }

    public WebElement get_theScoreBetAppPopUp() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(theScoreBetAppPopUp));
        return driver.findElement(theScoreBetAppPopUp);
    }

    public WebElement get_closeBtn() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(closeBtn));
        return driver.findElement(closeBtn);
    }

    public WebElement get_fvrtLeagueTitle() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(fvrtLeagueTitle));
        return driver.findElement(fvrtLeagueTitle);
    }

    public WebElement get_fvrtTeamTitle() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(fvrtTeamTitle));
        return driver.findElement(fvrtTeamTitle);
    }

    public List<WebElement> get_mainTabList() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(mainTabList));
        return driver.findElements(mainTabList);
    }

    public WebElement get_highlightedTab() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(highlightedTab));
        return driver.findElement(highlightedTab);
    }

    public WebElement get_welcomeToTheCommnunityPopUp() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(welcomeToTheCommnunityPopUp));
        return driver.findElement(welcomeToTheCommnunityPopUp);
    }

    public WebElement get_acceptBtn() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(acceptBtn));
        return driver.findElement(acceptBtn);
    }

    public List<WebElement> get_subTabList() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(subTabList));
        return driver.findElements(subTabList);
    }

    public WebElement get_subTitleText() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(subTitleText));
        return driver.findElement(subTitleText);
    }

    public WebElement get_passingYardsSubTitle() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(passingYardsSubTitle));
        return driver.findElement(passingYardsSubTitle);
    }

    public WebElement get_leaderTitleText() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(leaderTitleText));
        return driver.findElement(leaderTitleText);
    }

    public WebElement get_leaderName() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(leaderName));
        return driver.findElement(leaderName);
    }

    public WebElement get_leaderStat() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(leaderStat));
        return driver.findElement(leaderStat);
    }

    public WebElement get_backBtn() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(backBtn));
        return driver.findElement(backBtn);
    }
}

