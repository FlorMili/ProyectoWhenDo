package runner;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import session.Session;

@RunWith(Cucumber.class)
public class runner {
    @Before
    public void hookBefore(){
        System.out.println("Este es mi hook before");
    }
    @After
    public void hookAfter(Scenario scenario){
        if(scenario.isFailed()){
            byte[] screen = Session.getInstance().getDriver().getScreenshotAs(OutputType.BYTES);
            scenario.attach(screen,"image/png","failed screenshot movile");
        }
        System.out.println("Este es mi hook after");
        Session.getInstance().closeApp();
    }

}
