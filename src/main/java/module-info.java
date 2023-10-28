module com.example.projectonejfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projectonejfx to javafx.fxml;
    exports com.example.projectonejfx;
}