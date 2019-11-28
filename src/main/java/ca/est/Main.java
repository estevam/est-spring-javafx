package ca.est;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
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
	private Parent rootNode;
    private final String MAIN_FXML = "/fxml/MainWindow.fxml"; 
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@SuppressWarnings("exports")
	@Override
	public void start( Stage stage) throws Exception {
		stage.setScene(new Scene(rootNode, 400, 400));
		stage.setMinWidth(400);
		stage.setMinHeight(400);
		stage.show();
	}

	/**
	 * FXML loader
	 */
	public void init() throws Exception {
		springContext = SpringApplication.run(Main.class);
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(MAIN_FXML));
		fxmlLoader.setControllerFactory(springContext::getBean);
		rootNode = fxmlLoader.load();
	}

	public void stop() throws Exception {
		springContext.close();
	}
}