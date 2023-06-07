package ui.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import ui.driver.DriverSetup;
import ui.pages.HomePage;

public class BaseTest {
    HomePage homePage = new HomePage();
    @BeforeEach
    public void warmUP(){
        homePage.openWebSite();
}

    @AfterEach
    public void tearDown() {
        DriverSetup.closeDriver();
  }
}
