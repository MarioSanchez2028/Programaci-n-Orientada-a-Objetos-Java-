package view;

import controller.MainController;
import javafx.application.Application;
import javafx.stage.Stage;
import model.MainModel;

public class Mercado extends Application {

    @Override
    public void start(Stage primaryStage) {
        MainModel model = new MainModel("Mario Sanchez Villa");
        View view = new View(primaryStage);
        MainController controller = new MainController(model, view);
        
        controller.initController();
        view.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
