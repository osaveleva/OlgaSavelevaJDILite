package base.jdi.hw1;

import base.jdi.hw1.pages.*;
import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;




@JSite("https://epam.github.io/JDI/")
public class HomePageJDISite{
    @Url("index.html")
    public static HomePage homePage;
    @Url("/metals-colors.html") @Title("Metal and Colors")
    public static MetalAndColorsPage metalAndColorsPage;
}
