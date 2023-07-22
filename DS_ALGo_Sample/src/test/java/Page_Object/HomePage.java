package Page_Object;

import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.glassfish.jersey.internal.util.collection.DataStructures;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
    private WebDriver driver;
    private String URL = "https://dsportalapp.herokuapp.com/";

    @FindBy(xpath = "html/body/div/div/div/a/button")
    private WebElement getStartedButton;

    @FindBy(xpath = "html/body/div[2]/div/div/div/a")
    private WebElement DataStrIntroGetStarted;

    @FindBy(xpath = "html/body/div/nav/div/div[2]/ul/a[3]")
    private WebElement signInButton;
    
    @FindBy(xpath = "html/body/div/nav/div/div[2]/ul/a[2]")
    private WebElement RegisterButton;

    @FindBy (xpath = "html/body/div/nav/div/div/div/div")
    private DataStructures DropdownButton;
    
    
    
    public HomePage() {
        // Set the system property to indicate the location of the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/Users/ronthakkar/eclipse-workspace/Dsalgoproject/src/test/resources/drivers/chromedriver");

        // Create a new instance of ChromeDriver
        driver = new ChromeDriver();
        
        
        
        // Set implicit wait timeout
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Initialize elements using PageFactory
        PageFactory.initElements(driver, this);
    }

    public void navigateToDSPortal() {
        driver.get(URL);
    }

    public void clickGetStartedButton() {
        getStartedButton.click();
    }

    public void clickDataStrIntroGetStarted() {
        DataStrIntroGetStarted.click();
    }
    public void clickSignInButton() {
        signInButton.click();
    }
    public void clickRegisterButton() {
    	RegisterButton.click();
    }
    

    public static void main(String[] args) {
        HomePage HomePage = new HomePage();
        HomePage.navigateToDSPortal();
        HomePage.clickGetStartedButton();
       
        
      
       
    }

}
