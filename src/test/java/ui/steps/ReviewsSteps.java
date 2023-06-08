package ui.steps;

import org.openqa.selenium.NoSuchElementException;
import ui.pages.ReviewsPage;

public class ReviewsSteps {

    public static void stepsReviews(String comment){
        ReviewsPage reviewsPage = new ReviewsPage();
        reviewsPage
                .navigateToProfilePage()
                .enterStarRating();
        try {
            reviewsPage.enterForm();
            reviewsPage
                    .selectLifeInsurance()
                    .inputComments(comment)
                    .enterSumbit();
        } catch (NoSuchElementException ignored) {
        }
    }
}
