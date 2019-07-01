package base.jdi.hw1.sections;

import base.jdi.hw1.enums.OddsEven;
import com.epam.jdi.light.elements.composite.Section;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.XPath;
import org.openqa.selenium.WebElement;


public class Summary extends Section {

    @FindBy(css = "#odds-selector p")
    public WebElement odd;

    @FindBy(css = "#even-selector p")
    public WebElement even;

    @XPath(".//button[@type='submit' and contains(.,'Calculate')]") public WebElement calculate;
}
