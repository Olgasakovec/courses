package component;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class NavBar {

    private By menuLocator = By.xpath( "//header//div[@class='navbar__toggler' and @data-navbar-target='toggler']");

    private WebDriver driver;

    public NavBar(WebDriver driver) {
        this.driver = driver;
    }

    public ToolsDropDown clickMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(menuLocator)).click();
        return new ToolsDropDown(driver);
    }


}
