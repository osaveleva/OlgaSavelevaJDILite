package hw1;

import base.jdi.hw1.HomePageJDISite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import static com.epam.jdi.light.driver.WebDriverFactory.quit;
import static com.epam.jdi.light.elements.init.PageFactory.initElements;


public class HomePageInits {

    @BeforeSuite(alwaysRun = true)
    public static void setUp() {
        initElements(HomePageJDISite.class);
    }

    @AfterMethod(alwaysRun = true)
    public static void closeBrowser(){
        quit();
    }
}
