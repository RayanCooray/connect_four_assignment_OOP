package lk.ijse.gdse;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Appinitializer extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/CreatePlayer.fxml"))));
//        stage.setTitle("Connect 4 game - Create Player");
        //stage.getIcons().add(new Image("F:\\OOP\\connect_four_assignment\\src\\main\\resources\\asset\\connect-four.png"));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

    public static void main(String[] args) {launch(args);}

}