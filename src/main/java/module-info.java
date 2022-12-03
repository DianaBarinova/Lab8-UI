module com.example.convertation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.convertation to javafx.fxml;
    exports com.example.convertation;
}