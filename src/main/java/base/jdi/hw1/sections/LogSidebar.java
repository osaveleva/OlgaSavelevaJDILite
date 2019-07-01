package base.jdi.hw1.sections;
import com.epam.jdi.light.elements.composite.Section;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import org.openqa.selenium.WebElement;


public class LogSidebar extends Section {

   @FindBy(css = "div.info-panel-body.info-panel-body-result")
   public WebElement resultSection;
}
