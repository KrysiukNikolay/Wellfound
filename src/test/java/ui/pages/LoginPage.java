package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

  private final By BUTTON_LOGIN_PAGE = By.xpath("//a[@class='login']");
  private final By INPUT_USERNAME = By.xpath("//input[@id='email']");
  private final By INPUT_PASSWORD = By.xpath("//input[@id='password']");
  private final By BUTTON_ENTER_LOGIN = By.xpath("//button[@class='btn grey-dark blank touch-element-cl ng-hide']");
  private final By MAIN_PAGE = By.xpath("//span[@class='w-icon-wallet']");



  public LoginPage clickLogin() {
    WebElement buttonLogIn = driver.findElement(BUTTON_LOGIN_PAGE);
    buttonLogIn.click();
    return this;
  }
  public LoginPage inputUsername(String username) {
    WebElement userNameLogIn = driver.findElement(INPUT_USERNAME);
    userNameLogIn.sendKeys(username);
    return this;
  }

  public LoginPage inputPassword(String password) {
    WebElement userPassword = driver.findElement(INPUT_PASSWORD);
    userPassword.sendKeys(password);
    return this;
  }

  public LoginPage enterLoginUser() {
    WebElement buttonLogInUser = driver.findElement(BUTTON_ENTER_LOGIN);
    buttonLogInUser.click();
    return this;
  }

  public LoginPage returnMainPage() {
    WebElement buttonLogInUser = driver.findElement(MAIN_PAGE);
    buttonLogInUser.click();
    return this;
  }

}
