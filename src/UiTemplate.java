import javafx.application.Application;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

/*
- add javafx to the project as an sdk.
- File > projectStructure > Library > add "the library from its directory"

 CHANGE THE SCOPE OF THE DEPENDENCY to "Provided"
 then go to modules and add the module. if you dno't this error will appear in terminal:
      "Error: JavaFX runtime components are missing, and are required to run this application"

 */

public class UiTemplate extends Application {


    // Starting Ui So i can See how it looks visually... struggling to fin djavafx documents...
    // using this link: https://fxdocs.github.io/docs/html5/#_scene_graph
    // https://docs.oracle.com/en/java/java-components/javafx/26/docs/allclasses-index.html


    public UiTemplate() {
        // constructor for Ui Components,
        // make sure components for-- i think thats just for threading

    }

    // this is an abstract method in application class. this is the window itself
    @Override
    public void start(Stage stage) throws Exception {

    }


}

public static void main(String[] args) {

    launch(args);

}



