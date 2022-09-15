package pages;

import org.openqa.selenium.WebDriver;

public class Dashboard {

    final WebDriver driver;

    public Dashboard(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLogged() {
        return this.driver.getTitle().equals("EASY - Dashboard");
    }

}
