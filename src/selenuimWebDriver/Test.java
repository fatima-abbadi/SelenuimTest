package selenuimWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Test {
    public static void main(String[] args) {
        // Set the path for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ProBook\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

     
            // Navigate to the Lancôme0 USA website0
            driver.get("https://customer-staging.epallet.com/");
            System.out.println("Successfully opened the website");
        
            WebElement  logoPresent = driver.findElement(By.cssSelector(".styles_logoImg___arJP"));
            if (logoPresent.isDisplayed()) {
                System.out.println("Logo is displayed successfully.");
            } else {
                System.out.println("Logo is not displayed.");
            }
           

           // Verify the "E-mail sign up", "My account" and "My bag" links are displayed
           WebElement emailSignUp = driver.findElement(By.cssSelector(".styles_itemsWrapper__EolXq"));
           WebElement emailSignIn = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div[2]/div/div[2]/div[2]/a[1]/button"));
           WebElement contactUs = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div[1]/div[2]/a[1]"));
         //   WebElement myBag = driver.findElement(By.cssSelector(".c-minicart-icon__link"));

            if (emailSignUp.isDisplayed()&& contactUs.isDisplayed()) {
                System.out.println("E-mail Sign Up,contactUs links are displayed successfully.");
            } else {
                System.out.println("One or more of the required links are not displayed.");
            }
            
       // Click on the "emailSignIn" link
            emailSignIn.click();
          System.out.println("I Clicked on 'emailSignIn' link.");   
          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='__next']/div[1]/div[3]")));
          
          
           WebElement loginTitle = driver.findElement(By.xpath(("//*[@id=\"__next\"]/div[1]/div[4]/form/div/div[1]/span")));
           String loginTitleText = loginTitle.getText();
        if (loginTitleText.equals("Sign in")) {
                System.out.println("Login form title is correct.");
           } else {
                System.out.println("Login form title is incorrect.");
           }
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='__next']/div[1]/div[3]")));
        // Find the email and password input fields and enter valid credentials
        WebElement emailField = driver.findElement(By.xpath("//*[@id=\"Email\"]")); 
        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"Password\"]"));

        // Enter email and password
        emailField.sendKeys("fhani0899@gmail.com");
        passwordField.sendKeys("fatimaEng2002214");

        // Find and click the sign-in button
        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[4]/form/div/div[6]/button")); 
        signInButton.click();
        System.out.println("Clicked on the 'log in' button.");

}
}
