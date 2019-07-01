package base.jdi.hw1.sections;

import base.jdi.hw1.entities.MetalsColors;
import base.jdi.hw1.enums.Vegetables;
import com.epam.jdi.light.elements.complex.Droplist;
import com.epam.jdi.light.elements.composite.Form;

import com.epam.jdi.light.elements.pageobjects.annotations.objects.JCheckList;
import com.epam.jdi.light.elements.pageobjects.annotations.objects.JDropdown;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.UI;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.XPath;
import com.epam.jdi.light.ui.html.complex.MultiDropdown;
import com.epam.jdi.light.ui.html.complex.MultiSelector;
import org.openqa.selenium.WebElement;


public class MetalsColordsForm extends Form<MetalsColors> {

   /* @FindBy(css = "#odds-selector")
    public WebElement odd;*/

   //@UI("[id = elements-checklist]") public static Checklist checklist; - exception here

    @XPath("//*[@id='odds-selector']/p[2]/label") public WebElement odd;
    @XPath("//*[@id='even-selector']/p[4]/label") public WebElement even;

  /* @FindBy(css = "#even-selector p")
    public WebElement even;*/

    @XPath("//*[@id='elements-checklist']/p[1]/label") public WebElement water;
    @XPath("//*[@id='elements-checklist']/p[4]/label") public WebElement fire;

    /*@JCheckList(value = @FindBy(css ="#elements-checklist"))
    public Checklist natureElementsCheckList;*/

    @UI("['Submit']") public WebElement submit;

    @JDropdown(root = "div[ui=dropdown]", value = ".filter-option",
            list = "li", expand = ".caret")
    public Droplist colors;

    @Css("div[ui=combobox] input") public WebElement metals;

    @JDropdown(root = "div[ui=droplist]",
            value = "button",
            list = "li",
            expand = ".caret")
    public MultiSelector vegetables;

  // @UI("#salad-dropdown") MultiDropdown vegetables;
}
