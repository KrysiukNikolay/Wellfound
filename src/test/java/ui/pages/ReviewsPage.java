package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ui.data.UserData;

import java.util.List;

public class ReviewsPage extends BasePage {

    public final String profilePage = "https://wallethub.com/profile/13732055i";
    public final String starRatingNumber = "4";
    public final By FOUR_STAR_RATING = By.cssSelector(".ng-enter-element .rvs-star-svg:nth-of-type(" + starRatingNumber + ")");
    public final By SELECT_FORM = By.xpath("//div[@class='dropdown second']");
    public final By SELECT_LIFE_INSURANCE = By.cssSelector(".wrev-drp  ul[role='listbox'] > li:nth-of-type(3)");
    public final By INPUT_COMMENTS = By.cssSelector(".wrev-user-input");
    public final By BUTTON_SUBMIT = By.xpath("//div[@class='sbn-action semi-bold-font btn fixed-w-c tall']");
    public final By AUTHORIZED_NAME = By.xpath("//span[text()='@" + UserData.username + "']");
    public final By PUBLISHED_COMMENTS = By.cssSelector("[data-pos='0']");
    public final By ASSERT_STAR = By.xpath("//span[text()='@krysiuk_nikolay']/../../../div[@itemprop='reviewRating']/meta[@itemprop='ratingValue']");


    public ReviewsPage enterStarRating() {
        WebElement fourStar = driver.findElement(FOUR_STAR_RATING);
        fourStar.click();
        return this;
    }

    public ReviewsPage enterForm() {
        WebElement buttonSearch = driver.findElement(SELECT_FORM);
        buttonSearch.click();
        return this;
    }

    public ReviewsPage selectLifeInsurance() {
        WebElement buttonSearch = driver.findElement(SELECT_LIFE_INSURANCE);
        buttonSearch.click();
        return this;
    }

    public ReviewsPage inputComments(String comments) {
        WebElement formSearch = driver.findElement(INPUT_COMMENTS);
        formSearch.sendKeys(comments);
        return this;
    }

    public ReviewsPage enterSumbit() {
        WebElement buttonSearch = driver.findElement(BUTTON_SUBMIT);
        buttonSearch.click();
        return this;
    }

    public ReviewsPage navigateToProfilePage() {
        driver.get(profilePage);
        return this;
    }
    public boolean isDisplayedAvatar() {
        WebElement userAvatar = driver.findElement(AUTHORIZED_NAME);
        return userAvatar.isDisplayed();
    }
    public String publishedComments(){
        WebElement text = driver.findElement(PUBLISHED_COMMENTS);
        return text.getText();
    }
    public String assertStar(){
        WebElement stars = driver.findElement(ASSERT_STAR);
        return stars.getAttribute("content");
    }

}
