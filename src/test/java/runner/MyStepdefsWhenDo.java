package runner;

import activity.whenDo.ListTaskScreen;
import activity.whenDo.NewTaskScreen;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.util.Map;

public class MyStepdefsWhenDo {
    ListTaskScreen listTaskScreen= new ListTaskScreen();
    NewTaskScreen newTaskScreen= new NewTaskScreen();

    @Given("I have access to WhenDo app")
    public void iHaveAccessToWhenDoApp() {
    }

    @When("I create a new task")
    public void iCreateANewTask(Map<String,String> values) {
        listTaskScreen.addButton.click();
        newTaskScreen.titleTxtBox.type(values.get("title"));
        newTaskScreen.notesTxtBox.type(values.get("notes"));
        newTaskScreen.saveButton.click();
    }

    @Then("the task {string} and {string} should be created")
    public void theTaskShouldBeCreated(String expectedResult,String expectedDetalle) {
        Assertions.assertEquals(expectedResult,listTaskScreen.firstTask.getValue(),
                "ERROR la tarea no fue creada");
        Assertions.assertEquals(expectedDetalle,listTaskScreen.secondTask.getValue(),
                "ERROR No se visualiza el detalle de la Tarea");
    }
}
