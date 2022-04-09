package devicesFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidCloud implements IDevice{
    @Override
    public AppiumDriver create() {
        DesiredCapabilities caps = new DesiredCapabilities();
        // Set your access credentials
        caps.setCapability("browserstack.user", "florperezrojas_lGYRC3");
        caps.setCapability("browserstack.key", "f2mMNUvs1VbwPdaFUFCw");

        // Set URL of the application under test
        caps.setCapability("app", "bs://bb8a92ed80b0d7d529160d59a394ca1fe7b354bf");

        // Specify device and os_version for testing
        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "9.0");

        // Set other BrowserStack capabilities
        caps.setCapability("project", "JBGroup");
        caps.setCapability("build", "Appium");
        caps.setCapability("name", "WhenDo");

          //Initialise the remote Webdriver using BrowserStack remote URL
          // and desired capabilities defined above


        AndroidDriver<AndroidElement> driver = null;
        try {
            driver = new AndroidDriver<AndroidElement>(
                    new URL("http://hub.browserstack.com/wd/hub"), caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
     //   AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
       //         new URL("http://hub.browserstack.com/wd/hub"), caps);

        return driver;


    }
}
