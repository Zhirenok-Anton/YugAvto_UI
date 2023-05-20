package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

public class YugAvtoTests extends TestBase{

    MainPage mainPage = new MainPage();
    NewCarsPage newCarsPage = new NewCarsPage();
    UsedCarsPage usedCarsPage = new UsedCarsPage();

    @Test
    @Tag("avto")
    public void test(){
        mainPage.openPage();
        mainPage.clickNewAutoButton();
        newCarsPage.verifyCountCardAuto();
    }

    @Test
    @Tag("avto")
    public void test2(){
        mainPage.openPage();
        mainPage.clickUsedAutoButton();
        usedCarsPage.verifyCountCardAuto();
    }


}