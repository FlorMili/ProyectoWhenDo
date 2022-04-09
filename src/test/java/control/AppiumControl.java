package control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import session.Session;

public class AppiumControl {
    protected By locator;
    protected WebElement control;


    public AppiumControl(By locator){
        this.locator=locator;
    }

    protected void findControl(){
        this.control= Session.getInstance().getDriver().findElement(this.locator);
    }

    public void click(){
        this.findControl();
        this.control.click();
    }
    public boolean isControlDisplay(){
        try {
            this.findControl();
            return this.control.isDisplayed();
        }catch (Exception e){
            return  false;
        }
    }

    public String getValue(){
        this.findControl();
        return this.control.getText();
    }

}
