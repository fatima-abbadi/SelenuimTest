package selenuimWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Test {
    public static void main(String[] args) {
        // Set the path for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ProBook\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the Lancôme0 USA website0
            driver.get("https://www.lancome-usa.com/");
            System.out.println("Successfully opened the website");

            WebElement  logoPresent = driver.findElement(By.cssSelector(".c-logo"));
            if (logoPresent.isDisplayed()) {
                System.out.println("Logo is displayed successfully.");
            } else {
                System.out.println("Logo is not displayed.");
            }
           

            // Verify the "E-mail sign up", "My account" and "My bag" links are displayed
            WebElement emailSignUp = driver.findElement(By.cssSelector(".c-text-field__input"));
            WebElement myAccount = driver.findElement(By.cssSelector(".c-hamburger__item-link"));
            WebElement myBag = driver.findElement(By.cssSelector(".c-minicart-icon__link"));

            if (emailSignUp.isDisplayed()&& myAccount.isDisplayed()&& myBag.isDisplayed()) {
                System.out.println("E-mail Sign Up, My Account, and My Bag links are displayed successfully.");
            } else {
                System.out.println("One or more of the required links are not displayed.");
            }
            
         // Click on the "My account" link
          myBag.click();
            System.out.println("I Clicked on 'My Bag' link.");
          

            // Get the title of the login form and verify it equals "Registered Members"
//            WebElement loginTitle = driver.findElement(By.cssSelector(".c-account__title.h-text-size-26.h-text-uppercase"));
//            String loginTitleText = loginTitle.getText();
//            if (loginTitleText.equals("Registered Members")) {
//                System.out.println("Login form title is correct.");
//            } else {
//                System.out.println("Login form title is incorrect.");
//            }
        
            
            WebElement loginButton = driver.findElement(By.cssSelector(".c-field"));
            loginButton.click();
            System.out.println("I Clicked on login Button ");

            
            WebElement accountNavLink = driver.findElement(By.cssSelector(".c-account__user-name.h-show-for-large"));
            String accountName = accountNavLink.getText();

            if (accountName.contains("Fatima Hani ")) {  
                System.out.println("User logged in successfully.");
            } else {
                System.out.println("Login failed or user name mismatch.");

            }} catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
        	 driver.quit();
        }
    }
}
