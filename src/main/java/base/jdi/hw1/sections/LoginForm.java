package base.jdi.hw1.sections;

import base.jdi.hw1.entities.User;
import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.XPath;
import org.openqa.selenium.WebElement;


public class LoginForm extends Form<User> {
    @XPath(".//button[@type='submit']") public WebElement loginButton;
    @Css("input[type=text]") public WebElement name;
    @Css("input[type=password]") public WebElement password;
	
}