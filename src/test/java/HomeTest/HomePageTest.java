package HomeTest;

import Base.BaseClass;
import Pages.TestPages;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {


    @Test
    public void HomePageLoginMethod() throws InterruptedException {
        TestPages homepage = new TestPages(driver);
        homepage.OpenUrl();
        Thread.sleep(2000);


    }


    @Test
    public void TuwaiqTestMethod() throws InterruptedException {
        TestPages homepage = new TestPages(driver);
        homepage.OpenUrl();
        homepage.ChangeLanguage();
        Thread.sleep(2000);
        homepage.BootcampsAndCoursesTest();
        Thread.sleep(2000);
        homepage.FilterTest();
        Thread.sleep(3000);
        homepage.SearchBar();
        Thread.sleep(2000);
        homepage.SearchData();
        Thread.sleep(2000);
        homepage.RegionMethod();
        homepage.RegionMethod();
        Thread.sleep(2000);
        homepage.SelectRegionMethod();
        Thread.sleep(2000);
        homepage.CategoriesPMethod();
        Thread.sleep(2000);


    }

    @Test
    public void BotCampsMethod() throws InterruptedException {
        TestPages homepage = new TestPages(driver);
        homepage.OpenUrl();
        homepage.ChangeLanguage();
        Thread.sleep(2000);
        homepage.BootcampsAndCoursesTest();
        Thread.sleep(2000);
        homepage.scrollToPostion(0,600);
        Thread.sleep(4000);


    }



}




