package activity.whenDo;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class ListTaskScreen {
    public Button addButton = new Button(By.xpath("//android.widget.ImageButton[@resource-id='com.vrproductiveapps.whendo:id/fab']"));
    public Label firstTask = new Label(By.xpath("//android.widget.TextView[@resource-id='com.vrproductiveapps.whendo:id/home_list_item_text']"));
    public  Label secondTask= new Label(By.xpath("//android.widget.TextView[@resource-id='com.vrproductiveapps.whendo:id/home_list_item_text2']"));

}
