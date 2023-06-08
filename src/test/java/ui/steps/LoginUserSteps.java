package ui.steps;

import ui.pages.LoginPage;

public class LoginUserSteps {

  public static void stepsUserLogIn (String name, String password) throws InterruptedException {
    new LoginPage()
            .clickLogin()
            .inputUsername(name)
            .inputPassword(password)
            .enterLoginUser();
            Thread.sleep(5000);
            new LoginPage()
                    .returnMainPage();
  }
}
