package Basefile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;


public class Assertion {

    private static final Logger logger = LoggerFactory.getLogger(Assertion.class);

    public static void equals(String actualTxt, String expectedTxt) {
        if (actualTxt.equals(expectedTxt)) {
            logger.info("Verification passed : 'Actual : " + actualTxt + " \n " + "Expected : " + expectedTxt + "'");
        } else {
            String message =
                    "Verification failed : 'Actual : " + actualTxt + " \n " + "Expected : " + expectedTxt + "'";
            Assert.fail(message);
        }
    }
}
