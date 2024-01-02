module com.example.kalkulator_bmi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kalkulator_bmi to javafx.fxml;
    exports com.example.kalkulator_bmi;
}