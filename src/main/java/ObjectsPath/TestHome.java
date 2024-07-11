package ObjectsPath;

// Import necessary classes from Selenium
import org.openqa.selenium.By;


// Define the TestHome class
public class TestHome {


    public static final By language = By.xpath("/html/body/main/div/nav[2]/div[2]/button[1]");

    public static final By BootcampsAndCourses = By.xpath("/html/body/main/div/nav[2]/div[1]/div/div/ul/li[2]/a");

    public static final By FilterPath = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[1]/div[1]/button/img");

    public static final By SearchPath = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[2]/div/div/div[3]/input");

     public static final By SearchInputBar = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[2]/div/div/div[3]/input");

    public static final By assertionPath = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[3]/div[1]/div/div[1]/h2");

    public static final By regionPath = By.xpath("//*[@id='regionSelect'] ");

    public static final By SelectregionPath = By.xpath("//*[@id='regionSelect']/option[2]");

    public static final By CategoriesPath = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[1]/div[2]/button[2]");



    // Locator for the email address input field in the login form
  //  public static final By SearchInputBar = By.xpath("//*[@id='app-header']/div[1]/div[2]/div[2]/div/div/div/input");

    // Locator for the password input field in the login form
    // public static final By assertionUponLogin = By.xpath("//a[text()='SQL for Data Analysis']");

    // Locator for the sign in button in the login form
 //   public static final By Learn = By.xpath("//button[@id='popover-trigger-:R1l669l5t6H1:']");

    // Locator for an element to assert upon successful login
  //  public static final By assertionUponLogin = By.xpath("//*[@id='dashboard']/div/feed-container/div[1]/div/a");

}
