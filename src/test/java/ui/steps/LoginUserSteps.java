package ui.steps;

import ui.pages.LoginPage;

public class LoginUserSteps {

  public static void stepsUserLogIn (String name, String password){
    new LoginPage()
            .clickLogin()
            .inputUsername(name)
            .inputPassword(password)
            .enterLoginUser()
            .returnMainPage();
  }
}
