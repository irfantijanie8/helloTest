module com.example.science {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.science to javafx.fxml;
    exports com.example.science;
}