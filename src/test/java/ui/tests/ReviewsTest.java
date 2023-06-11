package ui.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.testng.asserts.Assertion;
import ui.config.ConfigReader;
import ui.data.UserData;
import ui.pages.ReviewsPage;
import ui.steps.LoginUserSteps;
import ui.steps.ReviewsSteps;


public class ReviewsTest extends BaseTest {
    static ConfigReader configReader = new ConfigReader();
    static String star = configReader.getStar();

    @Test
    @DisplayName("Reviews")
    public void testReviews() throws InterruptedException {
        ReviewsPage reviewsPage = new ReviewsPage();
        LoginUserSteps.stepsUserLogIn(UserData.USER_EMAIL, UserData.USER_PASSWORD);
        ReviewsSteps.stepsReviews(UserData.COMMENTS);
        Assertions.assertEquals(UserData.COMMENTS, reviewsPage.publishedComments());
        Assertions.assertEquals(star,reviewsPage.assertStar());


    }

}
