package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ParentPage {
    WebDriver webDriver;
    Logger logger;

    public ParentPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());
    }

    /**
     * Method opens url
     * @param url
     */
    public void open(String url){
        try{
            webDriver.get(url);
            logger.info("Page was opened " + url);
        }catch (Exception e){
            logger.error("Page can`t be opened " + url);
            Assert.fail("Page can`t be opened " + url);
        }
    }
}