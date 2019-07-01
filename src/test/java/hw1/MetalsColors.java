package hw1;
import base.jdi.hw1.TestsInit;
import org.testng.annotations.Test;

import java.util.List;

import static base.jdi.hw1.HomePageJDISite.homePage;

//import static base.jdi.hw1.HomePageJDISite.metalAndColorsPage;
import static base.jdi.hw1.HomePageJDISite.metalAndColorsPage;
import static base.jdi.hw1.enums.Vegetables.Tomato;
import static base.jdi.hw1.enums.Vegetables.Vegetables;
import static hw1.data.TestData.*;


public class MetalsColors implements TestsInit {

    @Test
    public void checkMetalsColors() {
        List<String> list;

        //1. Open browser
        homePage.open();

        //2. Login on JDI site as User
       homePage.header.userIcon.click();
        homePage.header.loginForm.loginAs(PITER_CHAILOVSKII);
        homePage.checkOpened();

        //3. Open Metals & Colors page by Header menu
        homePage.navigationSidebar.metalsColors.click();
        metalAndColorsPage.checkOpened();

        //4. Fill form Metals & Colors and submit data
        metalAndColorsPage.main.form.odd.click();
        metalAndColorsPage.main.form.even.click();
        metalAndColorsPage.main.form.water.click();
        metalAndColorsPage.main.form.fire.click();
     //   metalAndColorsPage.main.form.vegetables.select(Vegetables);
      //  metalAndColorsPage.main.form.vegetables.select(Tomato);
        metalAndColorsPage.main.form.submit(METALS_COLORS);

        //5. Check result sections
        list = createResultList();
        for (String line : list) {
            assert (metalAndColorsPage.logSidebar.resultSection.getText().contains(line));
        }

    }
}
