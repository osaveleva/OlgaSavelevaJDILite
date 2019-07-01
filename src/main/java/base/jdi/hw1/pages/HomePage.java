package base.jdi.hw1.pages;

import base.jdi.hw1.sections.Header;
import base.jdi.hw1.sections.NavigationSidebar;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.Css;
import org.openqa.selenium.WebElement;


public class HomePage extends WebPage {
    @Css("header") public Header header;
    @Css(".uui-side-bar") public NavigationSidebar navigationSidebar;
    @Css("h3[name='main-title']") public WebElement mainTitle;
    @Css(".main-txt") public WebElement jdiText;
}