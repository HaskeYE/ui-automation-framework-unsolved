package selenium;

public final class WebDriverFactoryProvider {

    private static WebDriverFactory INSTANCE;

    public static WebDriverFactory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new WebDriverFactory();
        }

        return INSTANCE;
    }
}