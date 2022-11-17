import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.spi.LoggerFactory;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.log4j.Logger;
public class TT {
    static Logger logger  = Logger.getLogger(TT.class);
   private  WebDriver d;
    @BeforeClass
    public static void init(){
        PropertyConfigurator.configure("log4j.properties");
        logger.info("performing initialization");
        WebDriverManager.chromedriver().setup();
        logger.trace("This is trace");
        logger.debug("This is Debug");
        logger.info("This is info");
        logger.warn("This is warning");
        logger.error("This is error");
    }
    @Test
    public void LaunchBrowser(){
        logger.info("Launching browser");
        d = new ChromeDriver();
        d.get("http://www.saucedemo.com/");

    }
    @After
    public void cleanup(){
        logger.info("performing clean up");
        d.quit();
    }



}




