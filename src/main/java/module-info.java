
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
    
    
    opens ca.est to spring.core, javafx.fxml;
    exports ca.est;
}