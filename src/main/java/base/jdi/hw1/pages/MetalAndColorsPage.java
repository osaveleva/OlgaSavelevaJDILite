package base.jdi.hw1.pages;

import base.jdi.hw1.sections.*;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.UI;
import com.epam.jdi.light.ui.html.complex.MultiDropdown;
//import com.epam.jdi.light.ui.html.complex.MultiDropdown;


public class MetalAndColorsPage extends WebPage {

    @Css(".main-content") public Main main;

    @Css(".uui-side-bar[name='log-sidebar']") public LogSidebar logSidebar;

    @UI("#salad-dropdown")
    MultiDropdown vegatables;

  /*  @Css("header") public Header header;
    @Css(".uui-side-bar[name='navigation-sidebar']") public NavigationSidebar navigationSidebar;

    @JDropdown(root = @FindBy(css = "div[ui=dropdown]"),
		value = @FindBy(css = ".filter-option"),
		list = @FindBy(css = "li"),
		expand = @FindBy(css = ".caret")
	)
	public Dropdown colors;
    @JComboBox(root = @FindBy(css = "div[ui=combobox]"),
		value = @FindBy(css = "input"),
		list = @FindBy(css = "li"),
		expand = @FindBy(css = ".caret")
	)
	public ComboBox metals;

    @XPath(".//button[@type='submit' and contains(.,'Submit')]") public Button submit;*/
	
}