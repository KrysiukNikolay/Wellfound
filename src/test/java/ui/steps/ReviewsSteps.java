package ui.steps;

import ui.pages.ReviewsPage;

public class ReviewsSteps {

    public static void stepsReviews(String comment){
        new ReviewsPage()
                .enterStarRating()
                .enterForm()
                .selectLifeInsurance()
                .inputComments(comment)
                .enterSumbit();
    }
}
