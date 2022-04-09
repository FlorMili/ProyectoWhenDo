package activity.whenDo;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class NewTaskScreen {
    public TextBox titleTxtBox = new TextBox(By.xpath("//android.widget.EditText[@text='Title']"));
    public TextBox notesTxtBox = new TextBox(By.xpath("//android.widget.EditText[@text='Notes']"));
    public Button saveButton= new Button(By.xpath("//android.widget.TextView[@content-desc='Save']"));
}
