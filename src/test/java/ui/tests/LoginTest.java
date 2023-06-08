package ui.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ui.data.UserData;
import ui.pages.LoginPage;
import ui.steps.LoginUserSteps;

public class LoginTest extends BaseTest {

  @Test
  @DisplayName("Authorization")
  public void testLoginCorrectDataUser() throws InterruptedException {
    LoginPage loginPage = new LoginPage();
    LoginUserSteps.stepsUserLogIn(UserData.USER_EMAIL, UserData.USER_PASSWORD);
    Assertions.assertTrue(loginPage.isDisplayedAvatar());
  }

}
