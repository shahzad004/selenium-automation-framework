package tests.browser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;


public class CreateBrowser extends Base {

    private static final Logger log = LoggerFactory.getLogger(CreateBrowser.class);

    @Test
    public void createBrowserTest() throws InterruptedException {
       Thread.sleep(2000);
   }

    public static void main(String[] args) {

//        DriverManager.initializeWebDriver();

    }

}
