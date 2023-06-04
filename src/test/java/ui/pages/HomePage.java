package ui.pages;

public class HomePage extends BasePage{

    public static final String URL = "https://wallethub.com/";
    public void openWebSite() {
        driver.get(URL);
    }
}
