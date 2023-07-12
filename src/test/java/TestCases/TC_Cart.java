package TestCases;

import com.aventstack.extentreports.Status;
import common.TestBase;

public class TC_Cart extends TestBase {
    public void cart() throws InterruptedException {
        test = extent.createTest("Cart", "Case 4:Complete order")
                .assignCategory("Functional_testcase")
                .assignAuthor("Cristina Iarosevici");
        logger.info("Verify URL");
        openURL(properties.getProperty("URL"));
        test.log(Status.INFO, "Open URL");
        logger.info("Open URL");

    }
}
