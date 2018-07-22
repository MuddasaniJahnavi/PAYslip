package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Main extends Application {
    public Controller controller = new Controller();

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));

        //controller = loader.getController();
        GridPane rootGridPane = loader.load();
        MenuBar menuBar = createMenu();
        menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
        Pane menuPane = (Pane) rootGridPane.getChildren().get(0);
        menuPane.getChildren().add(menuBar);

        Scene scene = new Scene(rootGridPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Pay Slip Generator");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private MenuBar createMenu() {
        MenuBar MB = new MenuBar();
        Menu optionM = new Menu(" Options ");
        MenuItem newM = new MenuItem("New ");
        newM.setOnAction(event -> controller.resetT());
        MenuItem resetM = new MenuItem("Reset");
        final MenuItem closeM = new MenuItem(" Exit ");
        closeM.setOnAction(event -> exitM());
        optionM.getItems().addAll(newM, resetM, closeM);


        MB.getMenus().addAll(optionM);
        return MB;

    }


    private void exitM() {
        Platform.exit();
        System.exit(0);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
