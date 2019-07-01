package base.jdi.hw1.sections;

import base.jdi.hw1.enums.NatureElements;
import com.epam.jdi.light.elements.composite.Section;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import org.openqa.selenium.WebElement;


public class ElementBlock extends Section {

    @FindBy(css ="#elements-checklist p")
    public WebElement natureElementsCheckList;
}
