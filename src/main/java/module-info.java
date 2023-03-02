module com.example.bestsellingapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.candy.sla to javafx.fxml;
    exports com.example.candy.sla;
}