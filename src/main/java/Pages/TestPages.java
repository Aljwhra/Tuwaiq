package Pages;

// Import necessary classes from Selenium and TestNG
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static ObjectsPath.TestHome.*; // Import all static fields (locators) from TestHome class

// Define the TestPages class
public class TestPages {
    WebDriver driver = null; // Declare WebDriver instance variable

    // Constructor to initialize WebDriver instance
    public TestPages(WebDriver driver) {
        this.driver = driver; // Assign WebDriver instance from parameter to local driver variable
    }

    // Method to open  homepage
    public void OpenUrl (){
        driver.get("https://tuwaiq.edu.sa/"); // Navigate to GitHub URL

    }

    public void ChangeLanguage() {
        WebElement English = driver.findElement(language);
        English.click();
    }




    public void BootcampsAndCoursesTest() {
        WebElement BootcampsCourses = driver.findElement(BootcampsAndCourses);
        BootcampsCourses.click();
    }


    public void FilterTest() {
        WebElement Filter = driver.findElement(FilterPath);
        Filter.click();
    }



    public void SearchBar() {
        WebElement SearchText = driver.findElement(SearchPath);
        SearchText.click();
    }



    public void SearchData () throws InterruptedException {
        driver.findElement(SearchInputBar).sendKeys("علم البيانات");
        driver.findElement(SearchInputBar).sendKeys(Keys.RETURN);

        boolean homepageview = driver.findElement(assertionPath).isDisplayed(); // Check if assertion element is displayed
          Assert.assertTrue(homepageview, "home page is not displayed!");

    }


    public void RegionMethod() {
        WebElement Region = driver.findElement(regionPath);
        Region.click();
    }



    public void SelectRegionMethod() {
        WebElement SelectRegion = driver.findElement(SelectregionPath);
        SelectRegion.click();
    }


    public void CategoriesPMethod() {
        WebElement SelectCategories = driver.findElement(CategoriesPath);
        SelectCategories.click();
    }



    public void scrollToPostion(int x , int y) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(arguments[0], arguments[1])", x,y);
    }


//
//    // Method to click on the  button on the home page
//    public void SearchBar() {
//        WebElement SearchIcon = driver.findElement(SearchBarElement); // Find login button element
//        SearchIcon.click(); // Click on the login button
//    }
//
//    // Method to enter
//    public void SearchData () throws InterruptedException {
//        driver.findElement(SearchInputBar).sendKeys("data"); // Find email address field and enter email
//        driver.findElement(SearchInputBar).sendKeys(Keys.RETURN); // Find password field and enter password

        // driver.findElement(signInBtn).click(); // Click on sign-in button

        // boolean homepageview = driver.findElement(assertionUponLogin).isDisplayed(); // Check if assertion element is displayed
       //  Assert.assertTrue(homepageview, "home page is not displayed!"); // Assert that homepageview is true
  //  }

//
//    public void LearnButton () {
//        WebElement LearnOpen = driver.findElement(Learn); // Find login button element
//        LearnOpen.click();
//    }
//
//    public void ArtificialIntelligence () {
//        WebElement ArtificialIntelligenceOpen = driver.findElement(ArtificialIntelligencePath);
//        ArtificialIntelligenceOpen.click();
//    }


}
