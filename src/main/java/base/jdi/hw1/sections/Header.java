package base.jdi.hw1.sections;


import com.epam.jdi.light.elements.composite.Section;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.XPath;
import org.openqa.selenium.WebElement;

public class Header extends Section {
    @Css("form#login-form") public LoginForm loginForm;
    @XPath(".//button[@type='submit']") public WebElement logout;
    @Css("img#epam_logo") public WebElement epamLogo;
    @Css("img#user-icon") public WebElement userIcon;
    @XPath(".//*[@ui='label']") public WebElement piterChailovskii;
    @Css("input[type=text]") public WebElement textField368977;
}