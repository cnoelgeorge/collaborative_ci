package collab.acceptance;

import org.apache.commons.lang3.SystemUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class baseTest {


    static WebDriver browser;
    static String urlApp;

    @BeforeClass
    public static void launchBrowser() throws IOException {
        String chromePath;
        Properties prop = new Properties();
        InputStream inputStream =
                baseTest.class.getClassLoader().getResourceAsStream("run.properties");
        prop.load(inputStream);
        String browserRequired=prop.getProperty("browser");
        urlApp=prop.getProperty("url");
        if(SystemUtils.IS_OS_LINUX)
            chromePath = baseTest.class.getClassLoader().getResource("chromedriver").getPath();
        else
            chromePath=baseTest.class.getClassLoader().getResource("chromedriver.exe").getPath();
        System.setProperty("webdriver.chrome.driver", chromePath);
        System.out.println(chromePath);
        browser = new ChromeDriver();

    }

    @AfterClass
    public static void afterClass(){
        browser.quit();
    }

}
