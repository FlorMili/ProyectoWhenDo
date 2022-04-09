package control;

import org.openqa.selenium.By;

public class TextBox extends AppiumControl{
    public TextBox(By locator) {
        super(locator);
    }

    public void type(String value){
        this.findControl();
        this.control.sendKeys(value);
    }

}
