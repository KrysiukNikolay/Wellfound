package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReviewsPage extends BasePage {

    public final By FOUR_STAR_RATING = By.cssSelector(".rvs-svg > div > svg:nth-of-type(4)");
    public final By SELECT_FORM = By.xpath("//div[@class='dropdown second']");
    public final By SELECT_LIFE_INSURANCE = By.xpath("//li[@id='opt-647c3cedce6b7-1']");
    public final By INPUT_COMMENTS = By.xpath("//div[@class='android textarea-user']");
    public final By BUTTON_SUBMIT = By.xpath("//div[@class='sbn-action semi-bold-font btn fixed-w-c tall']");

    public ReviewsPage enterStarRating() {
        WebElement buttonSearch = driver.findElement(FOUR_STAR_RATING);
        buttonSearch.click();
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

    public void inputComments(String comments) {
        WebElement formSearch = driver.findElement(INPUT_COMMENTS);
        formSearch.sendKeys(comments);
    }

    public ReviewsPage enterSumbit() {
        WebElement buttonSearch = driver.findElement(BUTTON_SUBMIT);
        buttonSearch.click();
        return this;
    }
}
