package session;

import devicesFactory.FactoryDevices;
import io.appium.java_client.AppiumDriver;

public class Session {
    private static Session session=null;
    private AppiumDriver driver;

    private Session(){
        driver= FactoryDevices.make("android").create();
        //driver= FactoryDevices.make("").create();   //Android cloud
    }

    public static Session getInstance(){
        if(session == null)
            session= new Session();
        return session;
    }

    public void closeApp(){
        driver.quit();
        session=null;
    }

    public AppiumDriver getDriver() {
        return driver;
    }
}
