package hw1.data;


import base.jdi.hw1.entities.MetalsColors;
import base.jdi.hw1.entities.User;

import java.util.ArrayList;
import java.util.List;

import static base.jdi.hw1.ResultListBuilder.*;
import static base.jdi.hw1.enums.ColorsList.*;
import static base.jdi.hw1.enums.Metals.*;
import static base.jdi.hw1.enums.NatureElements.FIRE;
import static base.jdi.hw1.enums.NatureElements.WATER;
import static base.jdi.hw1.enums.OddsEven.EIGHT;
import static base.jdi.hw1.enums.OddsEven.THREE;
import static base.jdi.hw1.enums.UserName.PETER_CHAILOVSKII;
import static base.jdi.hw1.enums.Vegetables.*;

public class TestData {
    private static List<String> lines = new ArrayList<>();

    public static User PITER_CHAILOVSKII = new User().set(u -> {
        u.name = PETER_CHAILOVSKII.getLogin();
        u.password = PETER_CHAILOVSKII.getPassword();
    } );

    public static MetalsColors METALS_COLORS = new MetalsColors().set(c -> {
        c.odd = THREE.toString();
        c.even = EIGHT.value;
        c.natureElementsCheckList = WATER.value+", "+FIRE.value;
        c.colors = Red;
        c.metals = Selen;
       // c.vegetables = Cucumber+", "+Tomato+", "+Vegetables;
        c.vegetables = Cucumber.toString();
        //c.vegetables = Tomato.toString();
    } );

    public static List<String> createResultList(){
        lines.add(summaryResult(THREE, EIGHT));
       // lines.add(nameResult(PETER_CHAILOVSKII.getLogin()));
        lines.add(elementsResult(WATER, FIRE));
        lines.add(colorResult(Red.toString()));
        lines.add(metalsResult(Selen.toString()));
        lines.add(vegetablesResult(Cucumber, Tomato));
        return lines;
    }
}




