package devicesFactory;

import io.appium.java_client.AppiumDriver;

public interface IDevice {

    AppiumDriver create();
}