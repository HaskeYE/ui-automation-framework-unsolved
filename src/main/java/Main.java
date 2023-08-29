import selenium.WebDriverFactory;

public class Main {

    public static void main(String[] args) {

        WebDriverFactory webDriverFactory = new WebDriverFactory();

        webDriverFactory.initialize("Chrome", "116.0.5845.96");
        webDriverFactory.end();

        webDriverFactory.initialize("Firefox", "116.0.3");
        webDriverFactory.end();
    }
}
