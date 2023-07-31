module com.example.senadzidzor {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.amaabrampah to javafx.fxml;
    exports com.example.amaabrampah;
}