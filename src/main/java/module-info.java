module com.example.bestsellingapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bestsellingapp to javafx.fxml;
    exports com.example.bestsellingapp;
}