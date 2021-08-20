package my.framework.core;

import my.framework.configuration.Configuration;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseTestUI {

    public final Logger logger = LoggerFactory.getLogger(BaseTestUI.class);

    protected static WebDriver driver;

    private final String os           = System.getProperty("os", Configuration.OPERATION_SYSTEM);
    private final String browser      = System.getProperty("browser", Configuration.BROWSER);
    private final String headless     = System.getProperty("mode", Configuration.HEADLESS);


}
