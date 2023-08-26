package configInterface;

import lombok.Getter;
import org.aeonbits.owner.ConfigFactory;

@Getter
public class ConfigObjectProvider {

    private String browser;
    private int browserWidth;
    private int browserHeight;
    private String seleniumVer;
    private int timeout;
    private String email;
    private String password;
    private String homepageUrl;

    public ConfigObjectProvider() {

        RunConfiguration cfgRun = ConfigFactory.create(RunConfiguration.class);
        EnvironmentConfiguration cfgEnv = ConfigFactory.create(EnvironmentConfiguration.class);

        this.browser = cfgRun.browser();
        this.browserWidth = cfgRun.browserWidth();
        this.browserHeight = cfgRun.browserHeight();
        this.seleniumVer = cfgRun.seleniumVer();
        this.timeout = cfgRun.timeout();
        this.email = cfgRun.email();
        this.password = cfgRun.password();
        this.homepageUrl = cfgEnv.homepageUrl();
    }

    public String collectAllToString() {

        return "Browser: " + browser
                + "\nbrowserWidth: " + browserWidth
                + "\nbrowserHeight: " + browserHeight
                + "\nseleniumVer: " + seleniumVer
                + "\ntimeout: " + timeout
                + "\nemail: " + email
                + "\npassword: " + password
                + "\nhomepageUrl: " + homepageUrl;
    }
}