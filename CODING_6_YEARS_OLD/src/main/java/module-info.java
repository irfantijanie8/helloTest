module com.example.math_6yo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.math_6yo to javafx.fxml;
    exports com.example.math_6yo;
}