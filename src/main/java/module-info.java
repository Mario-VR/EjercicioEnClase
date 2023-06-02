module com.example.ejercicio_clase {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejercicio_clase to javafx.fxml;
    exports com.example.ejercicio_clase;
}