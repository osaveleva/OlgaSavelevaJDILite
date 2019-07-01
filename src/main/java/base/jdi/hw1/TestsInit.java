package base.jdi.hw1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import static com.epam.jdi.light.elements.init.PageFactory.initElements;
import static java.lang.System.setProperty;


public interface TestsInit {

    @BeforeSuite(alwaysRun = true)
    static void setUp() {
        initElements(HomePageJDISite.class);
    }
}