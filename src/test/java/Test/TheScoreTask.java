package Test;

import Basefile.Assertion;
import Pages.ChooseYourFavoritePage;
import Pages.FavoriteTabPage;
import Pages.ScoreLandingPage;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;


public class TheScoreTask {

    ScoreLandingPage scoreLandingPage = new ScoreLandingPage();
    FavoriteTabPage favoriteTabPage = new FavoriteTabPage();
    ChooseYourFavoritePage chooseYourFavoritePage = new ChooseYourFavoritePage();

    private static final Logger logger = LoggerFactory.getLogger(TheScoreTask.class);

    String favoriteLeague = "NFL Football";
    String favoriteTeam = "Philadelphia Eagles";
    String addedTeam = "PHI";
    String addedLeague = "NFL";
    String news = "NEWS";
    String standings = "STANDINGS";
    String leaders = "LEADERS";
    String subttileText = "NFC EAST";
    String subttileText1 = "Passing Yards";
    String leader = "LEADER";
    String leaderName, leaderStat = "";

    @Test
    public void Test_Score_Android() throws InterruptedException {

        //1.0 - Launch the Score app and Verify Welcome title
        Assertion.equals(scoreLandingPage.get_welcomeTitle().getText(), "WELCOME");
        Assertion.equals(scoreLandingPage.get_timeToExpText().getText(), "Time to experience the best \n" +
                "sports app. Ever.");

        //2.0 - Click Get started button
        scoreLandingPage.get_getStarted().click();
        logger.info("Clicked on Get started button");

        //3.0 - Verify Chose your favorite leagues titles
        Assertion.equals(chooseYourFavoritePage.get_chooseYourFvrtLeaguesTitle().getText(), "Choose your favorite leagues");
        Assertion.equals(chooseYourFavoritePage.get_getTheLatestText().getText(), "Get the latest breaking news, highlights,\n" +
                "and updates");

        //4.0 - Select any favorite league
        get_validateFavoriteLeagueTeam(favoriteLeague, addedLeague);

        chooseYourFavoritePage.get_continueBtn().click();
        logger.info("Continue button is clicked");

        //6.0 - Click Maybe later button if location request popups appear
        if (chooseYourFavoritePage.get_tailoredContent().isDisplayed()) {
            chooseYourFavoritePage.get_mayBeLaterBtn().click();
            logger.info("May be later is clicked");
        }

        //7.0 - Verify Choose your favorite teams title then Select any favorite team
        Assertion.equals(chooseYourFavoritePage.get_chooseYourFvrtTeamsTitle().getText(), "Choose your favorite teams");

        get_validateFavoriteLeagueTeam(favoriteTeam, addedTeam);

        chooseYourFavoritePage.get_continueBtn().click();
        logger.info("Continue button is clicked");

        //8.0 - Verify Never miss a game title then click Continue button
        Assertion.equals(chooseYourFavoritePage.get_neverMissaGameTitle().getText(), "Never miss a game");

        chooseYourFavoritePage.get_continueBtn().click();
        logger.info("Clicked Continue button");

        //9.0 -  Click Maybe later button if Introducing theScore Messaging! popups appear
        if (chooseYourFavoritePage.get_introducingTheScoreTitle().isDisplayed()) {
            Assertion.equals(chooseYourFavoritePage.get_introducingTheScoreTitle().getText(), "Introducing theScore Messaging!");

            chooseYourFavoritePage.get_mayBeLaterBtnITSM().click();
            logger.info("Clicked Maybe Later button");
        }

        // Click Don't allow button if allow notifications popups appear
        if (chooseYourFavoritePage.get_dontAllowBtn().isDisplayed()) {
            chooseYourFavoritePage.get_dontAllowBtn().click();
            logger.info("Clicked Don't allow button");
        }

        // Click the Ok, Got It button
        if (chooseYourFavoritePage.get_justLaunchedProfileTitle().isDisplayed()) {
            chooseYourFavoritePage.get_okGotItBtn().click();
            logger.info("Clicked Ok, Got It button");
        }

        //10.0 - Validate the selected League name & Team name titles
        get_verifyAddedLeagueTeamTitles();

        //11.0 - Click favorite league
        get_favoriteLeagueTeam(addedLeague);

        if (favoriteTabPage.get_theScoreBetAppPopUp().isDisplayed()) {
            favoriteTabPage.get_closeBtn().click();
            logger.info("Clicked close button (theScore|Bet popu up)");
        }

        //12.0 - Verify Added league details then Tap on Standing tab details
        Assertion.equals(favoriteTabPage.get_fvrtLeagueTitle().getText(), addedLeague);
        Assertion.equals(favoriteTabPage.get_highlightedTab().getText(), news);

        for (WebElement element : favoriteTabPage.get_mainTabList()) {
            if (element.getText().contains(standings)) {
                element.click();
                Assertion.equals(favoriteTabPage.get_highlightedTab().getText(), standings);

                // Tap on NFC sub tab details
                favoriteTabPage.get_subTabList().get(1).click();
                logger.info("Clicked NFC sub tab");

                Assertion.equals(favoriteTabPage.get_subTitleText().getText(), subttileText);
                break;
            }
        }

        //13.0 - Tap on Leader tab then verify the details
        for (WebElement element : favoriteTabPage.get_mainTabList()) {
            if (element.getText().contains(leaders)) {
                element.click();
                Assertion.equals(favoriteTabPage.get_highlightedTab().getText(), leaders);

                Assertion.equals(favoriteTabPage.get_passingYardsSubTitle().getText(), subttileText1);
                Assertion.equals(favoriteTabPage.get_leaderTitleText().getText(), leader);

                leaderName = favoriteTabPage.get_leaderName().getText();
                leaderStat = favoriteTabPage.get_leaderStat().getText();

                logger.info("Leader Name: " + leaderName + "," + "Leader Stat:" + leaderStat);
                break;
            }
        }

        //14.0 - Click the back navigation button to return the previous page
        favoriteTabPage.get_backBtn().click();
        logger.info("Clicked Back button");

        get_verifyAddedLeagueTeamTitles();

        // 15.0 - Verify Added team title details
        favoriteTabPage.get_addedTeamLeagueList().get(0).click();
        logger.info("Clicked favorite team");

        Assertion.equals(favoriteTabPage.get_fvrtTeamTitle().getText(), favoriteTeam);

        // 16.0 - Click the back navigation button to return the previous page
        favoriteTabPage.get_backBtn().click();
        logger.info("Clicked Back button");

        get_verifyAddedLeagueTeamTitles();

    }

    public void get_validateFavoriteLeagueTeam(String leagueTeam, String addedLeagueTeam) {

        for (WebElement element : chooseYourFavoritePage.get_teamsList()) {
            if (element.getText().contains(leagueTeam)) {
                element.click();
                logger.info("Selected favorite Team/League");
                Assertion.equals(favoriteTabPage.get_addedTeamLeagueList().get(0).getText(), addedLeagueTeam);
                break;
            }
        }
    }

    public void get_favoriteLeagueTeam(String leagueTeam) {
        for (int i = 0; i < 2; i++) {
            if (favoriteTabPage.get_addedTeamLeagueList().get(i).getText().contains(leagueTeam)) {
                favoriteTabPage.get_addedTeamLeagueList().get(i).click();
                logger.info("Selected favorite league/Team");
            }
        }
    }

    public void get_verifyAddedLeagueTeamTitles() {
        Assertion.equals(favoriteTabPage.get_addedTeamLeagueList().get(0).getText(), addedTeam);
        Assertion.equals(favoriteTabPage.get_addedTeamLeagueList().get(1).getText(), addedLeague);
    }
}


