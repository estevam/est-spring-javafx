package ca.est;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 
 * @author Estevam
 */
@SpringBootApplication
public class Main extends Application {

	private ConfigurableApplicationContext springContext;

	private static final String PATH_FXML = "/fxml/";
	private final String MAIN_FXML = "/fxml/MainWindow.fxml";
	private static Scene scene;

	public static void main(String[] args) {
		Application.launch(args);
	}

	@SuppressWarnings("exports")
	@Override
	public void start(Stage stage) throws Exception {

		scene = new Scene(loadFXML("MainWindow"));
		stage.setScene(scene);
		stage.setMinWidth(800);
		stage.setMinHeight(800);
		stage.show();

		// scene = new Scene(loadFXML("primary"));

	}

	public static void setRoot(String fxml) throws IOException {
		scene.setRoot(loadFXML(fxml));
	}

	private static Parent loadFXML(String fxml) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(PATH_FXML + fxml + ".fxml"));
		return fxmlLoader.load();
	}

	/**
	 * FXML loader
	 */
	public void init() throws Exception {
		springContext = SpringApplication.run(Main.class);
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(MAIN_FXML));
		fxmlLoader.setControllerFactory(springContext::getBean);
		//fxmlLoader.load();
	}

	public void stop() throws Exception {
		springContext.close();
	}
}