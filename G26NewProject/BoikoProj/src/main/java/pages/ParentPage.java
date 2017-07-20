package pages;

import libs.ActionsWithOurElements;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Оля on 19.07.2017.
 */
public class ParentPage {
    WebDriver webDriver;
    Logger logger;
    ActionsWithOurElements actionsWithOurElements;

    public ParentPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());
        actionsWithOurElements = new ActionsWithOurElements(webDriver);
        PageFactory.initElements(webDriver, this); //инициализирует переменные того класа который к ней обращается
    }

    /**
     * Method opens url
     * @param url
     */
    public void open(String url){
        try {
            webDriver.get(url);
            logger.info("Page was opened "+ url);
        }catch (Exception e){
            logger.error("Page can not open " + url);
            Assert.fail("Page can not open " + url);
        }

    }
}