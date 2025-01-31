package page;

import component.NavigationMenu;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage navigateTo(String url) {
        driver.get(url);
        return this;
    }

    public NavigationMenu getNavigationMenu() {
        return new NavigationMenu(driver);
    }
}

