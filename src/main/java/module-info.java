module com.example.java_test {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires com.calendarfx.view;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    //requires eu.hansolo.tilesfx; // powoduje błąd java: module not found: javafx.swing

    opens com.example.java_test to javafx.fxml;
    exports com.example.java_test;
}