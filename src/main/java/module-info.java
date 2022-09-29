module com.example.tppersonne {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tppersonne to javafx.fxml;
    exports com.example.tppersonne;
}