
/**
 * 
 * @author Estevam
 *
 */
module ca.est {

    requires spring.core;
    requires spring.beans;
    requires spring.context;
    
    requires spring.boot;
    requires spring.boot.autoconfigure;
    
    requires javafx.fxml;
    requires javafx.controls;
	requires javafx.graphics;
	//requires jmetro;
    
    opens ca.est to spring.core, javafx.fxml;
    opens ca.est.controller to spring.core, spring.beans, javafx.fxml;
    
    exports ca.est;
}