module com.example.calculator_oop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculator_oop to javafx.fxml;
    exports com.example.calculator_oop;
}